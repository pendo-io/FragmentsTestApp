package com.example.mysdktest;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import java.util.HashMap;
import java.util.Map;

import sdk.pendo.io.Pendo;

public class App extends Application {
    @Override
    public void onCreate() {
        Pendo.PendoInitParams pendoParams = new Pendo.PendoInitParams();
        pendoParams.setVisitorId("John Smith");
        pendoParams.setAccountId("Acme Inc");

//send Visitor Level Data
        Map<String, Object> visitorData = new HashMap<>();
        visitorData.put("age", 27);
        visitorData.put("country", "USA");
        pendoParams.setUserData(visitorData);

//send Account Level Data
        Map<String, Object> accountData = new HashMap<>();
        accountData.put("Tier", 1);
        accountData.put("Size", "Enterprise");
        pendoParams.setAccountData(accountData);
        super.onCreate();
        // DavidApp mobile plat
      /*Pendo.initSDK(
              this,
              "eyJhbGciOiJSUzI1NiIsImtpZCI6IiIsInR5cCI6IkpXVCJ9.eyJkYXRhY2VudGVyIjoidXMiLCJrZXkiOiJmODQyZjQwOTA1MmVmYTgzNzU5Y2I4ZjVlYjA1YmFiZDBjZmIxZTJiZWE4MTVhYmFkYzc2MzBkNWI2ZmYzMWMwMTlkNWM3OTNiZWQ2MzgwM2I4YmNhYzBiMWFmY2ExZTk3MDJlYWIxMTgzNDk2OWI0NzI0MGFkZGE2ZDZjZDQ2MDQwZTc3MDBiNWIzM2E4MzQ3Y2IxZDJmODBmMzA3NTUzLjc1MTcxYjBlODZiMjNhYzdiNzgzOWZkZTY1NWFmOGRhLjgxMmUzMjFkM2JkZGIwYTkyZGU4MmRlZTY0MjllNDg5ZWY0MjU2MDY5ODU3MjNhYThkNGE2ZDZiNDhmMjJiMzkifQ.PAQG01FlxL4eCP9YgZcMJobez3vDeOKnpbD8VFHVZ9bKqh9vzRHqdLeEeIF1A2QBYjI7PiMXr2Hj0w7IOd3XNBPlMooS36JkpUtea-vUQwcBSF_zOj-LsqDBBmsHaaqws7R8CvCWstHwmVSqIafBJoBcEWsQWvwh_5bP1-czF-Q",
              pendoInitParams.setPendoOptions(options)
              // use this to add certificate pinning to pendo-test for the SDK that needed it
//              .setPendoOptions(new Pendo.PendoOptions.Builder()
//                     .addPinDebugOnly("us.device.stage.insert.io","sha256/X2g/8O8al2M2CyehYrCEdwsuBOn4N6uhgPiJtl2xzt8=")
//                      .addPinDebugOnly("us.data.stage.insert.io","sha256/Y/0RvYyhSUIvKhShNHA1jd9lLTJeZLPjyYb4d4fx7Xc=")
//                      .addPinDebugOnly("ws.stage.insert.io","sha256/qX5cmooI2z5W4ij8QJxiaNy3nt0N3nqRohiyqx9M1og=")
//                     .build())
//                      .setUserData(userAttributes)
//                      .setAccountData(userAttributes)
//                      .setVisitorId("222")
//                      .setAccountId("Pendo")
      );*/
        // Test app
      /*Pendo.initSDK(
              this,
              "eyJhbGciOiJSUzI1NiIsImtpZCI6IiIsInR5cCI6IkpXVCJ9.eyJkYXRhY2VudGVyIjoidXMiLCJrZXkiOiIyOTM0MTI3ZWU1ODc5NDYwYzg3ZjRkMWYzODIxZWRhZDZkYzFhOWU4NDVmZDJjOTE5OTE5YWY2ZmNjNmRiM2I3MDVmNmNjNjhiNzhhOGYzNWFlZDYwMWFmY2FiNDBkZTQxNzQ2NjdjMzgxOTQ1MWY0MDZjNTRjODMzZmMyNWVkNjBlM2ViNWNhZWY2ZGRkZDMwNjE4MzQxNGJiOTA0NWFlLjE3MWE0MzczZjEwMGQyYzE4OWRlMGJmZDk3ZmRlMmIwLmY4YjU3YjllZjFkMDY2M2YzNmMxMWQ1ZjA0NjNhMDQzODFhOTE3Y2QwMWY2MTgzNTcwOWEyMzJmYTIyNjM1YTEifQ.gP4E--TSOfCy82eJwO3qWTQPypegEET2qcg7Jc630QN3Yd2mkYVbEWBD1yGauKdLYfJqZgUkmhh7SSSkgMv4zN6iH5Tm4f97uT2P4hbkKgG1ZpsDwciIR64G8ez2aO9UeXtpNDY7GCIYf535FkVG7TeWYSw1sCWVZIcgHPWxoWk",
              pendoInitParams.setPendoOptions(options)
              // use this to add certificate pinning to pendo-test for the SDK that needed it
//              .setPendoOptions(new Pendo.PendoOptions.Builder()
//                     .addPinDebugOnly("us.device.stage.insert.io","sha256/X2g/8O8al2M2CyehYrCEdwsuBOn4N6uhgPiJtl2xzt8=")
//                      .addPinDebugOnly("us.data.stage.insert.io","sha256/Y/0RvYyhSUIvKhShNHA1jd9lLTJeZLPjyYb4d4fx7Xc=")
//                      .addPinDebugOnly("ws.stage.insert.io","sha256/qX5cmooI2z5W4ij8QJxiaNy3nt0N3nqRohiyqx9M1og=")
//                     .build())
//                      .setUserData(userAttributes)
//                      .setAccountData(userAttributes)
//                      .setVisitorId("222")
//                      .setAccountId("Pendo")
      );*/
        // Roi test IraAndroid2
        String pendoAppKey = "eyJhbGciOiJSUzI1NiIsImtpZCI6IiIsInR5cCI6IkpXVCJ9.eyJkYXRhY2VudGVyIjoidXMiLCJrZXkiOiJlN2JhYTI1NjBlMzM0NGZkYWMzNzEyNDhjZTc2YmZjNjFkYWRlNzM4Y2FiM2NmMTliNzhmN2VmOGRmZTE5ZTI3Yzc2YzQ1MDBlOTNlYmI4YzA3YWNkY2YzMGFiNjUxMWEyNTJmNGUwNGU1NWEwZTMxMmJiYTFmYWI5NGM2ZDM2YzEzODExMGIwYWVlZjExYTM4NjhiMDkzMmUwZjQ1YzY3LjNmMjVhMmFjMmE0ZmU5MjJhZDY5Yzk3YTliNWEzNGFlLmM0ZWRiY2ZiMWQ2M2Y0OWYyMjdlNzZmZjI4ZjMzNDljNWFmMWNiMjJmNmEwMzM3M2UzNThkNmNmZTFiNDg2NzQifQ.mho2Rrfk089K6HeCSOMFVc_1xyQzUPoRYUXtAbFyTFLJAaVnV_NA5XjVBBN6G9ZeC2Mtn7jGRskOLcsqG99XX3TByHdVjOc7Gv0kMOg6BCaD1zIjRha4t6e7q5KznQRZnF3_KBghC7Phu9rNseunhjzMKMTVo4Z5Algnh0JrEH8";
        Pendo.initSDK(
                this,
                pendoAppKey,
                null);
    }



    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
