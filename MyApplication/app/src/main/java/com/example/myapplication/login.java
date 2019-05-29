package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity implements View.OnClickListener{
    private EditText edit;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private EditText username;
    private EditText password;
    private Button register;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        username = (EditText)findViewById(R.id.user_name);
        password = (EditText)findViewById(R.id.pass_word);
        register = (Button)findViewById(R.id.register);
        login = (Button)findViewById(R.id.login);

        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
           case  R.id.register:
                Intent intent = new Intent(login.this,register.class);
                startActivity(intent);
           break;
        }
    }
}
