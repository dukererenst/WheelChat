package com.google.edem.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class alerts extends AppCompatActivity implements View.OnClickListener {
    ImageView close_wrongpark;
    private CardView wrong_park, fire, light, theft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);

        //defining cards
        wrong_park = (CardView) findViewById(R.id.wrong_park);
        fire = (CardView) findViewById(R.id.fire);
        light = (CardView) findViewById(R.id.light);
        theft = (CardView) findViewById(R.id.theft);

        //adding click listerner to the cards
        wrong_park.setOnClickListener(this);
        fire.setOnClickListener(this);
        light.setOnClickListener(this);
        theft.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.wrong_park:
                i = new Intent(this, wrong_park.class);
                startActivity(i);
                break;
            case R.id.fire:
                i = new Intent(this, fire.class);
                startActivity(i);
                break;
            case R.id.light:
                i = new Intent(this, light.class);
                startActivity(i);
                break;
            case R.id.theft:
                i = new Intent(this, theft.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
