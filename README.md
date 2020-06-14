# WeNeedaTeamName-aCtFasteR_SCDFXIBM
## Contents
1. [Short Description](#shortd)
2. [Pitch Video](#pv)
3. [Architecture](#archi)
4. [Long Description](#longd)
5. [Project Roadmap](#proad)
6. [Getting Started](#gstart)
7. [Test Runs](#trun)
8. [Built With](#bwith)

## <a name="shortd"></a>Short Description
### What's the problem?
Singapore is expected to become a 
<a href="https://www.rsis.edu.sg/rsis-publication/rsis/co15193-a-super-aged-singapore-policy-implications-for-a-smart-nation/#.XuOL8IHEmhA">“Super-Aged” country</a>
in 2025 with the number of 
<a href="https://www.todayonline.com/voices/more-seniors-living-alone-knowing-and-caring-our-neighbours-should-be-norm">elderly living alone in housing estates rising sharply</a> 
over the years. As emergency resources become more and more strained due to reduced manpower and increased demand, it is crucial for Singapore to develop a culture of inter-dependency. This is exemplified through our increasing reliance on our Community First Responders (CFRs) in providing early intervention during emergencies. For the isolated seniors, there is a huge risk that they are unable to receive medical assistance promptly in times of need. This poses an issue for emergency response. Hence, to cope with the rising number of elderly and limited medical resources, there is a need for a highly accurate and precise early detection system for incidents involving our most vulnerable.
### How can technology help?
Through the use of Internet of Things (IoT) technology, we are now able to monitor the most vulnerable within the confines of their home without invading their privacy. Furthermore, we can notify the CFRs to check in with the elderly in the event of a suspected incident, before raising the issue to higher authorities such as the SCDF. This can help provide more timely medical assistance to the elderly, reduce false alarms and allow for a more efficient allocation of medical resources.
### Idea
A mesh of proximity sensors can be set up in the homes of the elderly to detect motions made by them. Should the sensors not detect any movement for an extended period of time, it sends an alert to nearby CFRs through the MyResponders Application so that they may check in with the elderly. With the early detection, CFRs can access the situation and call for emergency rescuers if required. Thus, this decreases the time that the elderly is left unattended after an incident, which will be especially useful for severe incidents which are moderately sensitive to time. 
</br>Note: Our solution works on the assumption that an elderly will be moving around the house to carry out their daily activities, such as going to the toilet, having a meal, taking a nap etc. This is a valid assumption for an elderly living alone as they will have to carry out all household chores independently.

## <a name="pv"></a>Pitch Video
<a href="https://youtu.be/E3KT0LeUuN0" target="_blank"><img src="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/Pitch%20Video%20Screenshot.PNG" 
alt="aCtFasteR Pitch Video"/></a>

## <a name="archi"></a>Architecture
<img src="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/Architecture.png" border="10" /></a>
1. Proximity sensors detect motion and sends data to IBM Watson IoT Platform.
2. IoT application outputs a message in Node-RED for the data recorded.
3. In the event that there is inactivity for an extended period of time, function in Node-RED will trigger an alert message to be sent to the MyResponders App and a dashboard. 
4. Database containing information of the elderly will release the elderly's address along with the alert message.
5. MyResponders App will deploy the nearest CFR to check in with the elderly.
6. Adminstrators can monitor the dashboard for incidents happening around Singapore.

## <a name="longd"></a>Long Description
<a href="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/DESCRIPTION.md">Link to the detailed solution here.</a>

## <a name="proad"></a>Project Roadmap
<img src="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/Roadmap.jpg" alt="Project Roadmap"/></a>

## <a name="gstart"></a>Getting Started
### Prerequisites
You will need:
- An account on <a href="https://cloud.ibm.com/login">IBM Cloud</a>.
- Smartphone (Android)

### Installing
#### Step 1: Create an IoT app in the IBM Cloud
Work through the tutorial to <a href="https://developer.ibm.com/tutorials/how-to-create-an-internet-of-things-platform-starter-application/">create a Node-RED and Watson IoT Platform starter app</a> in IBM Cloud.

#### Step 2: Add a device that will send MQTT messages to the IBM Watson IoT Platform 
1. An organization ID is assigned to your app, and you will need this ID later when developing the mobile app. In the following image, the organization ID is l0y3u1, which is displayed under your login information in the upper right corner of the dashboard. <img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step002_1.png" alt="Screen capture of the service on the IBM Internet of Things Platform server and the organization ID highlighted"></a>
2. Click tab **Device Types**, then click **Add Device Type**. In your organization, you can have multiple device types each with multiple devices. A device type is a group of devices that share characteristics; for example, they might provide the same sensor data. In our case, the device type name must be “Android” (this device type name is required by the app that you will use later).
3. Click **Next**. A page is displayed where you can enter metadata about the device type, such as a serial number or model. You don’t need to specify this information for this tutorial. Just click **Finish**. <img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step002_3.png" alt="Screen capture of the add device type page"></a>
4. Click **Register Devices**. Enter the device ID. The device ID can be, for example, the MAC address of your smartphone. However, it must be unique within your organization only. Therefore, you might enter, as I did here, something like “112233445566”. <img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step002_4.png" alt="Screen capture of the page where device parameters are entered"></a>
5. Click **Next**. A page is displayed where you could enter metadata about the device. Leave it blank, and click **Next**.
6. On the security page, enter a value for the authentication token. Remember this value for later. Then, click **Next**. <img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step002_5.png" alt="Screen capture showing authentication token"></a>
7. Click **Finish**.
Now you are ready to send MQTT messages from a device to the IBM Watson IoT Platform.

#### Step 3: Install and configure the Android app
1. On your phone, go to **Settings > Apps & notifications**. Tap **Advanced**. Scroll down up to end of the page and tap **Special app access**
2. Select **Install unknown apps**
3. Click **Chrome** and enable **trust this source**

Now you can install .apk files from outside of Google Play using Chrome.

1. Open chrome on your phone and enter this URL to download the apk:</br>
https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/aCtFasteR.apk
2. Once downloaded, click **Install** to install the app

The aCtFasteR app is now installed on your android device.

Next you need to configure your Android App.

1. There is a need to enable location access to track the sensor's GPS coordinates. Go to **Settings > Apps > aCtFasteR > Permissions** and enable **Location**.
2. Start the aCtFasteR app.
3. Click **Skip tutorial**.
4. Enter the following parameters:
- **Organisation**: The organization ID that was displayed on the IBM IoT server (at the start of ” “). For example, l0y3u1 in this tutorial.
- **Device ID**: The device ID that you configured above. For example, “112233445566” in this tutorial.
- **Auth Token**: The authorization token that you specified earlier.
- Make sure that **Use SSL** is checked.
5. Click **Activate Sensor**. Now the app collects data from the proximity sensor in your smartphone and sends the data to the IBM IoT server. The app displays the proximity data and the number of messages that were published or received.

#### Step 4: Verify that messages are being sent from your smartphone to the Watsons IoT Platform
1. Back on your computer, open the IBM Watson IoT Platform page for your organization again
2. In the left menu, click **Devices**. Your Android device is displayed. <img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step004_2.png" alt="Screen capture of the Devices tab that lists the Android device"></a>
3. Click the arrow icon on the right of your Device ID. This opens an new page where you can see “Recent Events”. You should see events coming from your smartphone.
4. Click one of the events. The messages that are sent from your smartphone are in JSON format. They contain proximity and position data.

#### Step 5: Process messages in a Node-RED flow

First, you need to import the flow into your Node-RED editor.

1. Copy the following code.
```
node red code
[{"id":"db0b8c97.58b89","type":"tab","label":"SCDF Hackathon","disabled":false,"info":""},{"id":"a7b831bf.3e378","type":"ibmiot in","z":"db0b8c97.58b89","authentication":"boundService","apiKey":"","inputType":"evt","logicalInterface":"","ruleId":"","deviceId":"","applicationId":"","deviceType":"","eventType":"proximity","commandType":"","format":"json","name":"IBM IoT App In","service":"registered","allDevices":true,"allApplications":"","allDeviceTypes":true,"allLogicalInterfaces":false,"allEvents":"","allCommands":"","allFormats":"","qos":"0","x":160,"y":580,"wires":[["3a34dffb.ea35","694463d1.536b0c"]]},{"id":"7c1d6635.53af98","type":"ibmiot out","z":"db0b8c97.58b89","authentication":"boundService","apiKey":"","outputType":"cmd","deviceId":"223344556677","deviceType":"Android","eventCommandType":"text","format":"json","data":"{\"d\":{\"value\":\"text\"}}","qos":"","name":"IBM IoT App Out","service":"registered","x":560,"y":700,"wires":[]},{"id":"c115d635.a0c308","type":"debug","z":"db0b8c97.58b89","name":"MyResponders","active":true,"tosidebar":true,"console":false,"tostatus":false,"complete":"payload","targetType":"msg","x":1280,"y":480,"wires":[]},{"id":"4d6273e1.87d82c","type":"function","z":"db0b8c97.58b89","name":"Add timestamp","func":"msg.payload.d.alert = msg.payload.d.timestamp + \" Alert: Elderly may be in distress. Please verify if aid is required.\";\n\nreturn msg;","outputs":1,"noerr":0,"x":1060,"y":560,"wires":[["1659ebc9.3f9dc4"]]},{"id":"7c8823e2.82f80c","type":"trigger","z":"db0b8c97.58b89","op1":"","op2":"","op1type":"nul","op2type":"payl","duration":"1","extend":true,"units":"s","reset":"","bytopic":"all","name":"Send Alert","x":610,"y":380,"wires":[["9b8b6d72.c3351","24c029c7.baf8f6","3c288a16.c706e6"]],"info":"If this node receives a msg, extends the delay by 5 seconds.\nOnce there is no msgs sent for 5s, send out an \"alert message\""},{"id":"bb2eab15.ce9948","type":"comment","z":"db0b8c97.58b89","name":"Display the Map","info":"","x":160,"y":80,"wires":[]},{"id":"3a34dffb.ea35","type":"function","z":"db0b8c97.58b89","name":"Filter messages","func":"var proximity = msg.payload.d.proximity;\n\nif (proximity == 1) {\n\treturn msg;\n} ","outputs":1,"noerr":0,"x":400,"y":540,"wires":[["7c8823e2.82f80c"]]},{"id":"694463d1.536b0c","type":"function","z":"db0b8c97.58b89","name":"calc color","func":"var proximity = msg.payload.d.proximity;\nvar r = 0.0;\nvar b = 0.0;\nvar g = 0.0;\n\nif (proximity == 0) {\n\tr = 255.0;\n} else {\n    g = 255.0;\n}\n\na = 1.0;\n\nmsg.eventOrCommandType = \"color\";\nmsg.payload = JSON.stringify({\"d\":{\"r\":r,\"b\":b,\"g\":g,\"alpha\":a}});\n\nreturn msg;","outputs":1,"noerr":0,"x":380,"y":700,"wires":[["7c1d6635.53af98"]]},{"id":"1659ebc9.3f9dc4","type":"ui_text","z":"db0b8c97.58b89","group":"7662f034.89499","order":0,"width":"8","height":"1","name":"Display alert","label":"","format":"{{msg.payload.d.alert}}","layout":"row-left","x":1270,"y":560,"wires":[]},{"id":"34fdf7a3.e052e8","type":"inject","z":"db0b8c97.58b89","name":"Simulate incident","topic":"","payload":"{\"d\":{\"proximity\":0,\"longitude\":103.803892,\"latitude\":1.285665,\"trip_id\":\"1592043739\",\"timestamp\":\"2020-06-13T10:22:23.931+00:00\"}}","payloadType":"json","repeat":"","crontab":"","once":true,"onceDelay":"0.1","x":170,"y":320,"wires":[["7c8823e2.82f80c"]]},{"id":"9b8b6d72.c3351","type":"moment","z":"db0b8c97.58b89","name":"","topic":"","input":"payload.d.timestamp","inputType":"msg","inTz":"Africa/Abidjan","adjAmount":"8","adjType":"hours","adjDir":"add","format":"dddd, MMM Do YYYY, kk:mm:ss","locale":"en_US","output":"payload.d.timestamp","outputType":"msg","outTz":"Africa/Abidjan","x":840,"y":560,"wires":[["4d6273e1.87d82c"]]},{"id":"24c029c7.baf8f6","type":"change","z":"db0b8c97.58b89","name":"Retrieve lat and lon","rules":[{"t":"set","p":"payload.name","pt":"msg","to":"Incident","tot":"str"},{"t":"set","p":"payload.latitude","pt":"msg","to":"payload.d.latitude","tot":"msg"},{"t":"set","p":"payload.longitude","pt":"msg","to":"msg.payload.d.longitude","tot":"msg"},{"t":"delete","p":"payload.d","pt":"msg"}],"action":"","property":"","from":"","to":"","reg":false,"x":830,"y":240,"wires":[["45ae7fa8.2d672"]]},{"id":"b2d79794.b41bf8","type":"ui_template","z":"db0b8c97.58b89","group":"57fda9aa.f94898","name":"Map","order":1,"width":"13","height":"12","format":"<div align=center ng-bind-html=\"msg.payload | trusted\"></div>","storeOutMessages":true,"fwdInMessages":true,"resendOnRefresh":true,"templateScope":"local","x":510,"y":140,"wires":[[]]},{"id":"45ae7fa8.2d672","type":"worldmap","z":"db0b8c97.58b89","name":"","lat":"1.290270","lon":"103.851959","zoom":"11","layer":"OSM","cluster":"0","maxage":"","usermenu":"show","layers":"show","panit":"false","panlock":"false","zoomlock":"false","hiderightclick":"false","coords":"none","showgrid":"false","path":"/worldmap","x":1040,"y":240,"wires":[]},{"id":"9a4c08da.d0ea78","type":"template","z":"db0b8c97.58b89","name":"Display","field":"payload","fieldType":"msg","format":"handlebars","syntax":"mustache","template":"<iframe src=\"/worldmap\" height=670 width=670></iframe>","output":"str","x":360,"y":140,"wires":[["b2d79794.b41bf8"]]},{"id":"9cc56286.b22ef","type":"inject","z":"db0b8c97.58b89","name":"Start the map","topic":"","payload":"{}","payloadType":"json","repeat":"","crontab":"","once":true,"onceDelay":"0.1","x":180,"y":140,"wires":[["9a4c08da.d0ea78"]]},{"id":"bc16c438.64a648","type":"google geocoding","z":"db0b8c97.58b89","name":"Reverse geocode","geocodeBy":"coordinates","address":"","lat":"","lon":"","googleAPI":"","bounds":"","language":"","region":"","components":"","x":1010,"y":380,"wires":[["77de5a43.5961e4","c115d635.a0c308","ec87241e.50dab8"]]},{"id":"3c288a16.c706e6","type":"function","z":"db0b8c97.58b89","name":"Format lat lon","func":"var coords ={};\nlatitude= parseFloat(msg.payload.d.latitude).toFixed(7);\nlength = parseFloat(msg.payload.d.longitude).toFixed(7);\ncoords.location = {lat:latitude, lon:length};\nmsg = coords;\nreturn msg;","outputs":1,"noerr":0,"x":820,"y":380,"wires":[["bc16c438.64a648"]]},{"id":"2a98132e.55f72c","type":"inject","z":"db0b8c97.58b89","name":"Simulate incident 2","topic":"","payload":"{\"d\":{\"proximity\":0,\"longitude\":103.855,\"latitude\":1.3498,\"trip_id\":\"1592043739\",\"timestamp\":\"2020-06-13T10:22:23.931+00:00\"}}","payloadType":"json","repeat":"","crontab":"","once":true,"onceDelay":"0.1","x":170,"y":420,"wires":[["7c8823e2.82f80c"]]},{"id":"ec87241e.50dab8","type":"debug","z":"db0b8c97.58b89","name":"","active":true,"tosidebar":true,"console":false,"tostatus":false,"complete":"false","x":1270,"y":380,"wires":[]},{"id":"77de5a43.5961e4","type":"ui_text","z":"db0b8c97.58b89","group":"7662f034.89499","order":0,"width":"8","height":"1","name":"Display location","label":"Location: ","format":"{{msg.payload.address}}","layout":"row-left","x":1280,"y":300,"wires":[]},{"id":"873197e9.75d248","type":"comment","z":"db0b8c97.58b89","name":"Connect proximity sensor to Node-RED","info":"","x":230,"y":480,"wires":[]},{"id":"6bff8c7.3b65d74","type":"comment","z":"db0b8c97.58b89","name":"Change the colour of app for visualisation","info":"","x":480,"y":640,"wires":[]},{"id":"24acc4f7.5ae23c","type":"comment","z":"db0b8c97.58b89","name":"Add location to worldmap","info":"","x":810,"y":180,"wires":[]},{"id":"ea45b8a6.161298","type":"comment","z":"db0b8c97.58b89","name":"Send location to dashboard","info":"","x":1330,"y":240,"wires":[]},{"id":"fb98fd27.02d6d","type":"comment","z":"db0b8c97.58b89","name":"Send alert to dashboard","info":"","x":860,"y":500,"wires":[]},{"id":"cd960e6.b48faf","type":"comment","z":"db0b8c97.58b89","name":"Send location to myResponder App","info":"","x":1360,"y":440,"wires":[]},{"id":"a1b17529.43f188","type":"comment","z":"db0b8c97.58b89","name":"Obtain location from lat, lon data","info":"","x":910,"y":320,"wires":[]},{"id":"9705a366.7682c","type":"comment","z":"db0b8c97.58b89","name":"For simulation purposes","info":"","x":180,"y":240,"wires":[]},{"id":"7662f034.89499","type":"ui_group","z":"","name":"Warnings","tab":"3860b804.6cd928","order":2,"disp":true,"width":"8","collapse":false},{"id":"57fda9aa.f94898","type":"ui_group","z":"","name":"Map","tab":"3860b804.6cd928","order":1,"disp":true,"width":"14","collapse":false},{"id":"3860b804.6cd928","type":"ui_tab","z":"","name":"SCDF Hackathon","icon":"dashboard","order":1,"disabled":false,"hidden":false}]
```

Your imported flow should look like this: <img src="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/assets/images/Flow%20imported.png" alt="Location of proximity sensor"></a>
2. In Node-RED, press **Ctrl-I** to open the import nodes dialog. Paste the code, click **OK**.
3. In Node-RED, under manage palettes, install the following nodes:
- node-red-contrib-scx-ibmiotapp
- node-red-dashboard
- node-red-contrib-web-worldmap
- node-red-contrib-moment
- node-red-node-google
4. Now you need to adapt the flow to your specific parameters. The only relevant parameters are the Device ID and inputting your own Google Maps API. Double-click the node IBM IoT App out. In the pop-up window, enter the Device ID that you used earlier (for example, 112233445566), and click **Import**. Double-click the node Google Geocoding. In the pop-up window, click the pen icon by the side of the Google API Key to edit. To obtain an API-key, go to <href="https://console.developers.google.com/">Google Developer Console</a> and create a **Project**. Once done, go to the side menu on the left and click on **Credentials**. Then, click on **Create credentials** and select **API key**. Copy the generated API key into the Google geocoding node.
5. Click **Deploy** in the flow editor. The flow is deployed and should be active immediately.
6. Click the dashboard tab (Looks like a chart) at the top right-hand corner. Then, click the button right below it to access your dashboard.
Your dashboard should look like this:
</br><img src="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/assets/images/Dashboard.png" alt="Location of proximity sensor"></a> </br>

You should have all the resources needed to run the test.

## <a name="trun"></a>Test Run
If installed successfully, the system should be able to:
- Track the data sent out by the proximity sensor on your phone
- Trigger an alert message when there is inactivity (no movement captured by the proximity sensor)
- Display the alert message and location on the map in the Node-RED dashboard

### End-to-end connection test
1. To begin, tap your screen once to simulate motion detected by the proximity sensor (and to kickstart the countdown for the alert trigger).
2. Tap your screen repeatedly at an interval of roughly three seconds. When this is ongoing, there should not be any alert messages appearing on the dashboard.
3. To simulate inactivity, stop tapping on the screen.
4. After ten seconds, an alert message should appear on the dashboard.

If everything ran smoothly, the end-to-end connection is established.

## <a name="bwith"></a>Built With
- Android Studios
- Node-RED - Flow editor
- IBM Watsons IoT Platform - Application and server
- Google Maps API
