package com.google.edem.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button_login_login;
    private EditText editText_login_username;
    private EditText editText_login_password;
    private String username;
    private String password;
    private String baseUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button_login_login = (Button) findViewById(R.id.button_login_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignup();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_learn_more();
            }
        });

        button_login_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_home_dashboard();
            }
        });

    }


    public void opensignup() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

    public void open_learn_more() {
        Intent intent = new Intent(this, learn_more.class);
        startActivity(intent);
    }

    public void open_home_dashboard() {
        Intent intent = new Intent(this, HomeDashboard.class);
        startActivity(intent);
    }


}

