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
        Map userData = new HashMap();
        userData.put("UserCountry", "Bulgaria");
        userData.put("UserGender", "Female");

        Map accountData = new HashMap<String, String>();
        accountData.put("accountCountry", "Israel");
        accountData.put("Version", "7");

        Pendo.PendoInitParams pendoInitParams  = new Pendo.PendoInitParams();
        pendoInitParams.setVisitorId("DavidTest58");
        pendoInitParams.setAccountId("DavidTest58");
        Pendo.PendoOptions options = new Pendo.PendoOptions.Builder().setEnvironmentDebugOnly("staging").build();
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
        Pendo.initSDK(
                this,
                "eyJhbGciOiJSUzI1NiIsImtpZCI6IiIsInR5cCI6IkpXVCJ9.eyJkYXRhY2VudGVyIjoidXMiLCJrZXkiOiI3NzUzYTk4NTAwMTQxYWU3OGIyODAwMTJiYzY0NmQwMmZkZjQzODQ2ZGRmMWQzNGI4ZDRiNjAwOWNkY2E5NGNkODk5ZmRmNDMwYjBkZWMwZDFhYWIxZTc2NjZhZjE1ZDE5MWMwNTI5ZmQ2M2Q3NjFkN2JjZjhmZjcxZmE4ZTJjM2I1Y2E3MjEzODY5NWU0ZWZhZjY5ZGE4YTA0NDlkMDEwLjE4M2IxZmQzYjYzZDA1ZmIzYmVhNDc3MTRkZjRkYzRkLjMxMjc1YmNjZDljMWY5YTM0NTE5ZWM3OTY4MmM1YWNlNzQyNDJkNjEzNGQ4M2M4YmQyYWUzM2ZhYTRkN2E2MTUifQ.ZCyl4lhDHNPLbjdxGF-5tA3pVv7fbJ1PKu_u4dFM6Lz_tv-DzfIM8KGF-X5mfHi_SHKk-4g-OqUeitW2P3SVVe4zq9fXt40vVNyYoLUY_GxAVJRzIaHvsA97woFIh6hKHfEWhI-OXCqSAfMtZfGnuDHrqD2NAEp_qJ2SPBT2mzM",
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
        );
//        Pendo.switchVisitor("Visitor1", "Yo", userData, accountData);
//        Pendo.setAccountData(accountData);
//        Pendo.setUserData(userData);
//        Pendo.clearVisitor();


    }



    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
