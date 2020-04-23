package com.myapplicationdev.android.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivities2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities2);
        //Get the intent so as to get the "array info" inside the intent
        Intent i = getIntent();
        //Get the String array named "array" we passed in
        String[] array = i.getStringArrayExtra("info");
        //get the TextView object
        TextView tv1 = findViewById(R.id.textView1);
        //Display the name and the age on the textview
        tv1.setText("you are " + array[0]+" ,age "+ array[1]);
    }
}
