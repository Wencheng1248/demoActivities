package com.myapplicationdev.android.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the button and set the OnClickListener
        Button btnDone = (Button)findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Get the EditText that user keys in name
                EditText etName = (EditText) findViewById(R.id.editTextName);
                //Get the EditText that user keys in Age
                EditText etAge = (EditText) findViewById(R.id.editTextAge);
                //Put the name and age into and array
                String[] array = {etName.getText().toString(),etAge.getText().toString()};
                //Create an intent to start another activity called DemoActivites
                Intent i = new Intent(MainActivity.this,DemoActivities2.class);
                //Pass the String Array holding the name&Age to new activity
                i.putExtra("info",array);
                //Start the new activity
                startActivity(i);


            }
        });
    }
}
