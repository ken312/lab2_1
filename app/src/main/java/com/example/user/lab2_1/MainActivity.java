package com.example.user.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMessage;
    private EditText editName;
    private EditText editAge;

    public static final String MSG_EXTRA = "MSG";
    public static final String MSG_NAME = "NAME";
    public static final String MSG_AGE = "AGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMessage = (EditText) findViewById(R.id.editTextMessage);
        editName = (EditText) findViewById(R.id.editName);
        editAge = (EditText) findViewById(R.id.editText);


    }

    public void send(View view) {
        String message, name;

        Integer age;

        message = editTextMessage.getText().toString();
        name = editName.getText().toString();
        age = Integer.parseInt(editAge.getText().toString());


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MSG_EXTRA, message);
        intent.putExtra(MSG_NAME, name);
        intent.putExtra(MSG_AGE, age);
        startActivity(intent);
    }
}
