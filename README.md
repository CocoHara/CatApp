# CatApp

## Running the App

To build and run the app I followed the documentation on the Android Developers website. There are two options to run the app: Run on a real device or run on an emulator. The app runs on both a real device and an emulator.

Here is a link to the Android Developers Documentation to Running the App:
https://developer.android.com/training/basics/firstapp/running-app

### Run on a real device

Set up your device as follows:
1.	Connect your device to your development machine with a USB cable. If you're developing on Windows, you might need to install the appropriate USB driver for your device.
2.	Enable **USB debugging** in the **Developer options** as follows. First, you must enable the developer options:
    -	Open the **Settings** app.
    -	(Only on Android 8.0 or higher) Select **System**.
    -	Scroll to the bottom and select **About phone**.
    -	Scroll to the bottom and tap **Build number** 7 times.
    -	Return to the previous screen to find **Developer options** near the bottom.

Open **Developer options**, and then scroll down to find and enable **USB debugging**.

Run the app on your device as follows:
1.	In Android Studio, click the **app** module in the **Project** window and then select **Run > Run** (or click **Run** in the toolbar). 
2.	In the **Select Deployment Target** window, select your device, and click **OK**.
 
Android Studio installs the app on your connected device and starts it.

### Run on an emulator

Run the app on an emulator as follows:
1.	In Android Studio, click the **app** module in the **Project** window and then select **Run > Run** (or click **Run** in the toolbar).
2.	In the **Select Deployment Target** window, click **Create New Virtual Device**. 
3.	In the **Select Hardware** screen, select a phone device, such as Pixel, and then click **Next**.
4.	In the **System Image** screen, select the version with the highest API level. If you don't have that version installed, a **Download** link is shown, so click that and complete the download.
5.	Click **Next**.
6.	On the **Android Virtual Device (AVD)** screen, leave all the settings alone and click **Finish**.
7.	Back in the **Select Deployment Target** dialog, select the device you just created and click **OK**.

Android Studio installs the app on the emulator and starts it.
