package com.google.edem.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class send_alert extends AppCompatActivity {
    private static ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_alert);
    }

    public void click() {

        img = (ImageView) findViewById(R.id.wrongpark);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.google.edem.myapplication.HomeDashboard");
                startActivity(intent);


            }
        });
    }
}
