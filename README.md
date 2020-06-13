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
in 2025, with the number of 
<a href="https://www.todayonline.com/voices/more-seniors-living-alone-knowing-and-caring-our-neighbours-should-be-norm">elderly living alone in housing estates rising sharply</a> 
over the years. As emergency resources are stretched and become more and more strained due to reduced manpower, it is crucial for Singapore to develop a culture of inter-dependency. This is exemplified through our increasing reliance on our Community First Responders (CFRs) in providing early intervention during emergencies. For the isolated senior, there is a huge risk that they are unable to receive medical assistance promptly in times of need. This poses an issue for emergency response. Hence, to cope with the rising number of elderly and limited medical resources, there is a need for a highly accurate and precise early detection system for incidents involving our most vulnerable.
### How can technology help?
Through the use of Internet of Things (IoT) technology, we are now able to monitor the most vulnerable within the confines of their home without invading their privacy. Furthermore, we can notify the CFRs to check in with the elderly in the event of a suspected incident, before raising the issue to higher authorities such as the SCDF. This can help provide more timely medical assistance to the elderly, reduce false alarms and allow for a more efficient allocation of medical resources.
### Idea
A mesh of proximity sensors can be set up in the homes of the elderly to detect motions made by them. This idea assumes that the elderly will move around the house for their daily routine and activities, thus enabling the sensor to detect their motion. However, should the sensor not detect any movement for an extended period of time, it sends an alert to nearby CFRs through the MyResponders App, for them to check in with the elderly. With the early detection, CFRs can access the situation and call for emergency rescuers if required. Thus, decreasing the time that the elderly is left unattended after an incident, which can be a life saving measure. 

## <a name="pv"></a>Pitch Video
<a href="URL TO VIDEO" target="_blank"><img src="LINK TO A SCREENSHOT OF VIDEO ON YOUTUBE" 
alt="Solution Pitch Video" width="240" height="180" border="10" /></a>

## <a name="archi"></a>Architecture
<img src="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/Architecture.png" border="10" /></a>
1. Proximity sensors detect motion and sends data to IBM Watson IoT Platform.
2. IoT application outputs a message in Node-RED for the data recorded.
3. Function in Node-RED will trigger an alert message to be sent to the MyResponders App and a dashboard, in the event that there is inactivity for an extended period of time. 
4. Database containing information of the elderly will release the address along with the alert message.
5. MyResponders App will deploy the nearest CFR to check in with the elderly.
6. Adminstrators can monitor the dashboard for incidents happening around Singapore.

## <a name="longd"></a>Long Description
<a href="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/DESCRIPTION.md">Link to the detailed solution here.</a>

## <a name="proad"></a>Project Roadmap
<img src="https://github.com/cheweejia/WeNeedaTeamName-aCtFasteR_SCDFXIBM/blob/master/Timeline.jpg" alt="Project Roadmap"/></a>

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

The IoT Starter app is now installed on your android device.

Next you need to configure your Android App.

1. Start the IoT Starter app.
2. Click **Skip tutorial**.
3. Enter the following parameters:
- **Organisation**: The organization ID that was displayed on the IBM IoT server (at the start of ” “). For example, l0y3u1 in this tutorial.
- **Device ID**: The device ID that you configured above. For example, “112233445566” in this tutorial.
- **Auth Token**: The authorization token that you specified earlier.
- Make sure that **Use SSL** is checked.
4. Click **Activate Sensor**. Now the app collects data from the proximity sensor in your smartphone and sends the data to the IBM IoT server. The app displays the proximity data and the number of messages that were published or received.

#### Step 4: Verify that messages are being sent from your smartphone to the Watsons IoT Platform
1. Back on your computer, open the IBM Watson IoT Platform page for your organization again
2. In the left menu, click **Devices**. Your Android device is displayed. <img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step004_2.png" alt="Screen capture of the Devices tab that lists the Android device"></a>
3. Click the arrow icon on the right of your Device ID. This opens an new page where you can see “Recent Events”. You should see events coming from your smartphone.
4. Click one of the events. The messages that are sent from your smartphone are in JSON format. They contain proximity and position data.

#### Step 5: Process messages in a Node-RED flow
First you need to import the nodes ibm iot in and ibm iot out into your Node-RED application. These nodes allow you to easily connect to Watson IoT, but they are not in the palette by default. To do so, you need to create a continuous delivery toolchain and then add dependencies to the application.
<br>
1. Open the Overview page of the Node-RED starter application, which you created in Step 1.
2. In the **continuous delivery** section of the dashboard, click **Enable**<img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step005_2.png"></a>
3. On the Toolchain page, select **Delivery Pipeline** and then **Create API Key**
4. Leave the defaults, and click **Create**
<img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step005_4.png"></a>
5. Back on the Toolchain page, click the Eclipse Orion Web IDE icon. The IDE opens. Here you can change the code of your application.
6. Select the file **package.json** on the left side. In the editor on the right, add a line in the **dependencies** section: “node-red-contrib-scx-ibmiotapp”: “0.x”Edit package.json in the Eclipse Orion IDE
<img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step005_6.png"></a>
7. Select menu File > Save. Then click the git icon in the left menu.
<img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step005_7.png"></a>
8. On the Git page, first click **Commit**, then **Push**. This pushes your change from the Git repository to the Application on the IBM Cloud.Commit and push on the GIT page
<img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step005_8.png"></a>
9. Click the back arrow to get back to the Toolchain page. Now click **Delivery pipeline**.
10. On the Delivery Pipeline page, click the play icon next to Build Stage.
<img src="https://developer.ibm.com/developer/tutorials/iot-mobile-phone-iot-device-bluemix-apps-trs/images/step005_10.png"></a>

The build pipeline will take 5 – 10 minutes to complete.

Next, you need to import the flow into your Node-RED editor.

1. Copy the following code.
```
node red code
```
2. In Node-RED, press **Ctrl-I** to open the import nodes dialog. Paste the code, click **OK**.
3. **Instructions to install moments node and dashboard**
4. Now you need to adapt the flow to your specific parameters. The only relevant parameter is the Device ID. Double-click the node IBM IoT App out. In the pop-up window, enter the Device ID that you used earlier (for example, 112233445566), and click **Import**.
5. Click **Deploy** in the flow editor. The flow is deployed and should be active immediately.

You should have all the resources needed to run the test.

## <a name="trun"></a>Test Run
If installed successfully, the system should be able to:
- Track the data sent out by the proximity sensor on your phone
- Trigger an alert message when there is inactivity (no movement captured by the proximity sensor)
- Display the alert message and location on the map in the Node-RED dashboard

### End-to-end connection test
1. To begin, tap your screen once to simulate motion detected by the proximity sensor (and to kickstart the countdown for the alert trigger).
2. Tap your screen repeatedly at an interval of roughly three seconds. When this is ongoing, there should not be any alert messages appearing on the dashboard.
3. Whenever you feel like it, stop tapping the screen to simulate inactivity.
4. After ten seconds, there should be an alert message appearing on the dashboard.

If everything ran smoothly, the end-to-end connection is established.

## <a name="bwith"></a>Built With
- Node-RED - Flow editor
- IBM Watsons IoT Platform - Application and server
