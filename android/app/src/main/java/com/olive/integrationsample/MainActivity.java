package com.olive.integrationsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.olive.olivesdk.OliveUPISDKManager;
import com.olive.olivesdk.sdk.OliveEventListener;
import com.olive.olivesdk.sdk.OliveSDKConstants;
import com.olive.olivesdk.sdk.OliveSDKError;
import com.olive.olivesdk.sdk.OliveSdkParam;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements OliveEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startReactActivity();
    }


    public void startReactActivity(){
        OliveSdkParam param = new OliveSdkParam();
        param.setCustomerName("Atmaram");
        param.setCustomerType("ETB");
        param.setEmailId("atmaram.t@olivecrypto.com");
        param.setMerchId("AXISMOBILE");
        param.setMerchChanId("AXISMOBILE");
        param.setSubmerchantid("674545454");
        param.setMcccode("674545454");
        param.setUnqCustId("603AF40D5AFA936CCC740C8FF413B85C");
        param.setTimestamp(new Date().getTime() +"");
        param.setMobilenumber("918904706719");
        param.setUnqTxnId(new Date().getTime() +"");
//    param.setMerchToken("5vl47lyyx02p3o8giz5aqz00yeh7eccnhdykwy91hdljn6s8yafy8vxgdvwvwdyg8g81lnjhaiypvri4i9fu2m99qvxds6zj9iujpkusjwzh6sjfofy2ndhvf5jsqqil43lg0b9owp8kusg92rb4quukiyxz3b8j4ftc0nlx01s8sbsklyyk3t25dj23nr13q3z7vdta3a913b6d75ql9fpu2q233qo7zfeoulqkiozfkpuibmqh7fjbj32xl40v");
        param.setMerchToken("");
        param.setQrData("upi://pay?pa=yogesh2022@axis&cu=INR&am=200&pn=yogesh&tn=money");
        param.setIntentData("upi://pay?pa=yogesh2022@axis&cu=INR&am=200&pn=yogesh&tn=money");
        param.setNotificationData("notificationdata");
        param.setSubscriptionId("1");
        param.setAppVersion("2.0");
        param.setSlRegisteredTimeStamp("28/07/2022 12:32:22");
        param.setAppDeviceId("937323230612835");
        String mode = OliveSDKConstants.MODE_DEFAULT;
        OliveUPISDKManager.getInstance().initSDK(MainActivity.this, mode , param);
        OliveUPISDKManager.getInstance().setListener(this);
    }

    @Override
    public void onEventReceived(String mode, Object data) {
        Log.d("TAG", "onEventReceived: mode= "+mode+" with data "+data);
    }

    @Override
    public void onErrorReceived(String mode, OliveSDKError err) {
        Log.d("TAG", "onErrorReceived for: mode= "+mode+" with error "+err);
    }

}