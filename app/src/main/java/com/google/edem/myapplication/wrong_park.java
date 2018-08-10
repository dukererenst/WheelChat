package com.google.edem.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class wrong_park extends AppCompatActivity {
    private Button btn_cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_park);

        btn_cancel = (Button) findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openalerts();
            }
        });

    }

    public void openalerts() {
        Intent intent = new Intent(this, alerts.class);
        startActivity(intent);
    }


}
