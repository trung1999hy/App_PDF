package com.hst.pdfcreator;

import androidx.multidex.MultiDexApplication;

import com.hst.pdfcreator.util.Preference;

public class MyApplication extends MultiDexApplication {
    private static Preference preference = null;
    private static MyApplication application = null;
    public static Preference getInstance() {
        if (preference == null) {
            preference = Preference.buildInstance(application);
        }
        preference.isOpenFirst();
        return preference;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}
