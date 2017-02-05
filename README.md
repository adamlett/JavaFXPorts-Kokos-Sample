## Initial Setup

 1. Change the file `local.properties` to point to your android sdk location
 2. Un-zip the `dalvik-sdk-8.60.8.zip` into the C:/ drive, so that you have `C:/dalvik-sdk`
      * Alternatively, change the two dalvik-sdk references in `app/build.gradle` file to point to your own Dalvik SDK location
 3. In the `(Standalone) Android SDK manager` ensure you have the following downloaded:
    * `Android SDK Build-tools version 21.1.2`
    * `SDK Platform version 21`
    * `Android Support Respository`
    
## Running
* To run on an android device use:

      `gradlew installDebug`
