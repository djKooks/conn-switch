package io.djkooks.uniconn;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/**
 * Created by kwangin on 2017/10/23.
 */

public class ConnectionPreference {

    private SharedPreferences sharedPreferences;
    private Context context;
    private static final String PREFERENCE = "io.djkooks.uniconn";

    public ConnectionPreference(Context context) {
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE);
    }

    public synchronized void setConnection(String key, String value) {
        if (value == null) {
            return;
        }

        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    protected String getConnectionUrl(String key) {
        return this.sharedPreferences.getString(key, "");
    }

    public void registerPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {
        this.sharedPreferences.registerOnSharedPreferenceChangeListener(listener);
    }

    public void unregisterPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {
        this.sharedPreferences.unregisterOnSharedPreferenceChangeListener(listener);
    }
}
