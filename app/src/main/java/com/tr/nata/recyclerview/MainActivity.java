package com.tr.nata.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.ActionBar;


public class MainActivity extends AppCompatActivity {

    Button buttonnew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        buttonnew = (Button) findViewById(R.id.button1);

        buttonnew.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Start = new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(Start);
            }
        });
    }
}
