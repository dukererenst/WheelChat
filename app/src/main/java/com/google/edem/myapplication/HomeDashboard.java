package com.google.edem.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeDashboard extends AppCompatActivity implements View.OnClickListener {
    private CardView register_card, alert_card, notification_card, chat_card, friends_card, logout_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        //defining cards
        register_card = (CardView) findViewById(R.id.register_card);
        alert_card = (CardView) findViewById(R.id.alert_card);
        notification_card = (CardView) findViewById(R.id.notification_card);
        chat_card = (CardView) findViewById(R.id.chat_card);
        friends_card = (CardView) findViewById(R.id.friends_card);
        logout_card = (CardView) findViewById(R.id.logout_card);

        //adding click listerner to the cards
        register_card.setOnClickListener(this);
        alert_card.setOnClickListener(this);
        notification_card.setOnClickListener(this);
        chat_card.setOnClickListener(this);
        friends_card.setOnClickListener(this);
        logout_card.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.register_card:
                i = new Intent(this, register_vehicle.class);
                startActivity(i);
                break;
            case R.id.alert_card:
                i = new Intent(this, alerts.class);
                startActivity(i);
                break;
            case R.id.notification_card:
                i = new Intent(this, receive_notification.class);
                startActivity(i);
                break;
            case R.id.chat_card:
                i = new Intent(this, chat.class);
                startActivity(i);
                break;
            //case R.id.friends_card : i = new Intent(this,.class);startActivity(i); break;
            case R.id.logout_card:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }

    }
}
