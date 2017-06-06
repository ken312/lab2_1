package com.example.user.lab2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewMessage = (TextView)findViewById(R.id.textViewMessage);


        Bundle extras = getIntent().getExtras();
        if(! extras.isEmpty()){
            String message = extras.getString(MainActivity.MSG_EXTRA);
            String name = extras.getString(MainActivity.MSG_NAME);
            Integer age = extras.getInt(MainActivity.MSG_AGE);

            textViewMessage.setText("Message =" + message + "\nName=" + name + "\nAge=" + age);


        }
    }
}
