package com.example.georg.appb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivityTwoFromAppOne(View view) {


        //copy intentfilter name from AppA activity2 x
        Intent intent=new Intent( "com.example.georg.appa.Activity");
        startActivity(intent);
    }
}
