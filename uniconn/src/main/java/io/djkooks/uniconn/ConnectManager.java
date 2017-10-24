package io.djkooks.uniconn;

import android.content.Context;

/**
 * Created by kwangin on 2017/10/10.
 */

public class ConnectManager {

    private static ConnectManager sInstance;
    private ConnectionPreference connectionPref;

    private ConnectManager(Context context) {
        connectionPref = new ConnectionPreference(context);
    }

    public static ConnectManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new ConnectManager(context);
        }

        return sInstance;
    }

    public void registerConnection(String switchKey, String url) {
        connectionPref.setConnection(switchKey, url);
    }

    public String getConnectedUrlWithKey(String key) {
        return connectionPref.getConnectionUrl(key);
    }
}
