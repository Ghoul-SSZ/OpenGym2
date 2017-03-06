package se.szhou.opengym2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //An EXTRA to take the device MAC to the next activity
    public static String EXTRA_DEVICE_ADDRESS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);

        System.out.println("Hello World!");
    }

}
