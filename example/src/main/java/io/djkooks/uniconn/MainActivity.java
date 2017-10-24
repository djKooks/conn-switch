package io.djkooks.uniconn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectManager connManager = ConnectManager.getInstance(this);
        connManager.registerConnection("CONNECTION_1", "https://www.google.com");
        connManager.registerConnection("CONNECTION_2", "https://stackoverflow.com/");
        connManager.registerConnection("CONNECTION_2", "https://github.com");



    }
}
