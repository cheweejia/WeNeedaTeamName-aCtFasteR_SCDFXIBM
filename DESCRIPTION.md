# Solution: aCtFasteR
aCtFasteR aims to target the elderly who lives alone at home. They are most vulnerable to the risk of not receiving timely medical assistance after an incident has occurred, since there is no one around to help them and they may not be physically abled to notify anyone for help. The basis of our solution is that the elderly will be moving around the house to carry out their daily activities, such as going to the toilet, having a meal, taking a nap etc. Hence, in the unfortunate event when the elderly has met an incident and is unable to notify anyone, there will be inactivity in the house for an extended period of time. We hope to be able to integrate aCtFasteR to the MyResponders App, so that we can tap on nearby CFRs to respond quickly in the event of inactivity. Detecting an elderly in distress earlier can save another life.

## Considerations
### 1. Privacy 
Privacy is a prominent issue with regards to the use of technology in today's world. Though visual and voice surveillance offer a more comprehensive monitoring of the elderly's well-being, it is often too intrusive and results in both privacy and security concerns, especially if the data is not stored properly. Hence, our goal is to implement an innovative monitoring system without infringing on one's privacy at all. To achieve this, we have decided to only make use of proximity sensors to track the activity in one's household. 
### 2. False Alarm
There is a wide range of scenarios that can result in inactivity in the house, for example the elderly could have been spending time outside of the house or they could have been asleep. Our solution has thus implemented 2 measures to reduce the rates of false positives.
1) With a database of the elderly's details, a call will be made to the elderly to confirm his/her well-being. If the elderly cannot be reached, a call will be made to the elderly's next-of-kin if any.
2) The limit for the duration of inactivity will be extended at night to account for the time that the elderly is asleep. With these meaasures, our team aims to reduce the chances of false detection by aCtFasteR.
Note: The exact time whereby the duration of inactivity is extended may be customised depending on one's sleep habits.
### 3. Speed
In the event of a suspected incident, time is of the essence to ensure that the elderly receives timely medical assistance. The process to deploy a CFR to the elderly's location has to be expedited. Hence, we have to propose a trigger of an appropriate sensitivity, so that we can render aid to the elderly in distress early. In the event that we are unable to verify an elderly's well-being within 15 minutes (the esimated time for a few phone calls to verify the elderly's well-being), CFRs nearby will be activated to check in with the elderly. This is a fail-safe measure.

## Breakdown
1. When a user signs up for aCtFasteR, they will be required to enter their details, which includes their phone number, address, next-of-kin details. These data will be stored in a database in the event of an activation.

2. Proximity sensors will be installed in the house at multiple doorways. Using the proximity sensors to detect motion, data will be sent out to a cloud system whenever the elderly walks past the sensor. This data is processed as activity.  In the event the elderly has to leave the house for an extended period of time, a button will be installed in the house at the main door as well to allow the elderly to halt the detection system. When the proximity sensor near the main door detects motion will trigger the system will go back online. The detection system will be turned off 1 minute after the button is activated, this prevents the proximity sensor from triggering the system when the elderly exits their home. 
3. The system is triggered by a timer which will start counting down when there is inactivity. Whenever an activity is detected in daytime (7am to 7pm), the timer will be resetted to six hours and restarts the countdown. The rationale for six hours as our threshold is that as long as the elderly is at home, he/she will have to go through their daily routine and move at least twice during the day. During the night (7pm to 7am), the timer will be resetted to twelve hours to account for sleep.
4. In the event of an incident and the elderly is unable to move to request for help, the proximity sensors will not detect any activity and hence no data will be sent out to the cloud system. After the countdown duration, the trigger will be set off to attempt to contact the elderly or their next-of-kin through a phone call.
5. If the elderly was verified to be safe, CFRs will not be alerted and the system will be reset.
6. Else, an alert will be sent out via the MyResponders App to nearby CFRs. Along with the alert, the address of the elderly will be sent to the CFRs from the database.
7. Upon arriving at the elderly's apartment, the CFR will access the situation and determine if there is a need to contact emergency services. This will help with early intervention as compared to if the elderly-in-distress was waiting to be discovered.

For the purpose of our demonstration:
- An IoT application will be used on an android phone to simulate the proximity sensor. The flow of the data will be represented by a flow on Node-RED. 
- The threshold duration will be reduced to seconds for us to test out the system easily in real time. 
- Once the app stops sending positive data (no movement recorded by proximity sensor) for the threshold duration, an alert message will be sent out which will appear on the debug node. 
- The checking of false alarm will not be depicted in the flow as the process will be running on the MyResponders App and there is no database set up for now. Similarly, the alert message will not be shown on the MyResponders App itself, but rather on the debug node.

Further improvements
- Number of hours stated in our solution is arbituary and subjected to changes according to our trial tests
- Caretakers and Next of Kin of elderly have access rights to overwrite and switch off the aCtFasteR system through the Internet based app
- Coloured-lights can be installed on the front doors that lights up if the elderly is in distress
