package io.djkooks.uniconn;

import android.content.Context;

/**
 * Created by kwangin on 2017/10/23.
 */

public class Connector {

    private static Connector sInstance;
    ConnectionPreference connectionPref;

    private Connector(Context context) {
        connectionPref = new ConnectionPreference(context);
    }

    public static Connector getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new Connector(context);
        }

        return sInstance;
    }

    public void get(String key) {
        String url = connectionPref.getConnectionUrl(key);
    }

    public void post(String key) {
        String url = connectionPref.getConnectionUrl(key);
    }
}
