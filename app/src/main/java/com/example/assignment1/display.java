package com.example.assignment1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        SharedPreferences prefs = getSharedPreferences("PREFS", MODE_PRIVATE);
        String print = prefs.getString("print","");

        TextView displayInfo = findViewById(R.id.textView);
        displayInfo.setText(print);
    }
}

