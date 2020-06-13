/*******************************************************************************
 * Copyright (c) 2014-2015 IBM Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *    Mike Robertson - initial contribution
 *******************************************************************************/
package com.ibm.iot.android.iotstarter.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ibm.iot.android.iotstarter.IoTStarterApplication;
import com.ibm.iot.android.iotstarter.R;
import com.ibm.iot.android.iotstarter.utils.Constants;

/**
 * Web View for Quickstart
 */
public class WebActivity extends Activity {
    private static final String TAG = WebActivity.class.getName();

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.webview);

        if (savedInstanceState != null) {
            ((WebView)findViewById(R.id.webPage)).restoreState(savedInstanceState);
        }

        wv = (WebView) findViewById(R.id.webPage);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);
        wv.setWebChromeClient(new myWebChromeClient());

        IoTStarterApplication app = (IoTStarterApplication) getApplication();
        String url = Constants.QUICKSTART_URL + app.getDeviceId() + "/sensor/";
        Log.d(TAG, "Launching chromium with URL: " + url);
        if (savedInstanceState == null) {
            wv.loadUrl(url);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        wv.saveState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        wv.restoreState(savedInstanceState);
    }

    /**************************************************************************
     * Functions to handle the menu bar
     **************************************************************************/

    private void openProfiles() {
        Log.d(TAG, ".openProfiles() entered");
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if (currentAPIVersion < Build.VERSION_CODES.HONEYCOMB) {
            new AlertDialog.Builder(this)
                    .setTitle("Profiles Unavailable")
                    .setMessage("Android 3.0 or greater required for profiles.")
                    .setPositiveButton(getResources().getString(R.string.ok), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                        }
                    }).show();
        } else {
            Intent profilesIntent = new Intent(getApplicationContext(), ProfilesActivity.class);
            startActivity(profilesIntent);
        }
    }

    void openTutorial() {
        Log.d(TAG, ".openTutorial() entered");
        Intent tutorialIntent = new Intent(getApplicationContext(), TutorialPagerActivity.class);
        startActivity(tutorialIntent);
    }

    private void openHome() {
        Log.d(TAG, ".openHome() entered");
        Intent homeIntent = new Intent(getApplicationContext(), MainPagerActivity.class);
        startActivity(homeIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, ".onCreateOptions() entered");
        getMenuInflater().inflate(R.menu.web_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Process the selected iot_menu item.
     *
     * @param item The selected iot_menu item.
     * @return true in all cases.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, ".onOptionsItemSelected() entered");

        IoTStarterApplication app = (IoTStarterApplication) getApplication();

        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_accel:
                app.toggleAccel();
                return true;
            case R.id.action_profiles:
                openProfiles();
                return true;
            case R.id.action_tutorial:
                openTutorial();
                return true;
            case R.id.action_home:
                openHome();
                return true;
            case R.id.action_clear_profiles:
                app.clearProfiles();
                return true;
            case R.id.clear:
                app.setUnreadCount(0);
                app.getMessageLog().clear();
                return true;
            default:
                if (item.getTitle().equals(getResources().getString(R.string.app_name))) {
                    openOptionsMenu();
                    return true;
                } else {
                    return super.onOptionsItemSelected(item);
                }
        }
    }

    public class myWebChromeClient extends WebChromeClient {
    }
}
