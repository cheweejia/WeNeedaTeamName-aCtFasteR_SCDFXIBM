# WeNeedaTeamName-aCtFasteR_SCDFXIBM
## Contents
1. [Short Description](#shortd)
2. [Pitch Video](#pv)
3. [Architecture](#archi)
4. [Long Description](#longd)
5. [Project Roadmap](#proad)
6. [Getting Started](#gstart)
7. [Test Runs](#trun)
8. [Live Demo](#ldemo)
9. [Built With](#bwith)

## <a name="shortd"></a>Short Description
### What's the problem?
Singapore is expected to become a 
<a href="https://www.rsis.edu.sg/rsis-publication/rsis/co15193-a-super-aged-singapore-policy-implications-for-a-smart-nation/#.XuOL8IHEmhA">“Super-Aged” country</a>
in 2025, with the number of 
<a href="https://www.todayonline.com/voices/more-seniors-living-alone-knowing-and-caring-our-neighbours-should-be-norm">elderly living alone in housing estates rising</a> 
over the years. As the over-stretched emergency resources shrink due to reduced manpower, the country becomes increasingly dependent on Community First Responders (CFRs) to provide early intervention in emergency situations. For the elderly who lives alone at home, there is a potential risk that they are unable to receive medical assistance in times of need. This poses an issue for emergency response. Hence, to cope with the rising number of elderly and limited medical resources, there is a need for early detection with reduced false alarms for incidents involving the elderly.
### How can technology help?
Technology can assist to provide early detection for any incidents within homes of the elderly, especially those who live alone. It can be tapped upon to notify the CFRs to check in with the elderly in the event of a suspected incident, before raising the issue to higher authorities such as the SCDF. This can help provide more timely medical assistance to the elderly and reduce false alarms.
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
Optional

## <a name="gstart"></a>Getting Started
### Prerequisites
what 
### Installing

## <a name="trun"></a>Test Runs
Instructions on how to run the tests for the system (if possible)

## <a name="ldemo"></a>Live Demo
Link to a working demo (if possible)

## <a name="bwith"></a>Built With
- Node-RED - Flow editor
- IBM IoT
