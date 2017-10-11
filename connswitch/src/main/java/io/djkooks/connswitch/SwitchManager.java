package io.djkooks.connswitch;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by kwangin on 2017/10/10.
 */

public class SwitchManager {

    private static SwitchManager sInstance;
    private SharedPreferences sp;

    private SwitchManager(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static SwitchManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new SwitchManager(context);
        }

        return sInstance;
    }

    public boolean addSwitch(String switchKey, String url) {
        sp.edit().putString(switchKey, url).apply();
        return true;
    }
}
