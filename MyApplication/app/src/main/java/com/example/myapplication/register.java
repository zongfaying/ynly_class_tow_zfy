package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity implements View.OnClickListener {
    private Button sure;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_view);
        Button sure = (Button)findViewById(R.id.sure);
        sure.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sure:
                Intent intent = new Intent(register.this,login.class);
                startActivity(intent);
                break;
        }

    }
}

