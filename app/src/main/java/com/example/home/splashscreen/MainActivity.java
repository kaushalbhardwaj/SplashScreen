package com.example.home.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Handler;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIMEOUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {

            public void run()
            {

                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                finish();
            }


        },SPLASH_TIMEOUT);

    }

}
