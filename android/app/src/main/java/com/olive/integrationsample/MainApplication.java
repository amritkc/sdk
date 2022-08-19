package com.olive.integrationsample;

import com.facebook.react.PackageList;
import com.facebook.react.ReactPackage;
import com.olive.olivesdk.OliveApplication;
import com.olive.olivesdk.sdk.OlivePackage;

import java.util.List;

public class MainApplication extends OliveApplication {

    @Override
    public void onCreate() {
        super.onCreate();
//        initialisePackages(new PackageList(this).getPackages());
        List<ReactPackage> mPackages = new PackageList(this).getPackages();
        mPackages.add(new OlivePackage());
        initialisePackages(mPackages);
    }
}
