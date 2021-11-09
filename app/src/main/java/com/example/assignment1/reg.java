package com.example.assignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);


        final EditText userName = (EditText)findViewById(R.id.namereg);
        final EditText passwd = (EditText)findViewById(R.id.passreg);
        Button regBtn = (Button)findViewById(R.id.regbtn);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences prefs = getSharedPreferences("PREFS", MODE_PRIVATE);
                String newU = userName.getText().toString();
                String newP = passwd.getText().toString();

                SharedPreferences.Editor editor = prefs.edit();
                editor.putString(newU + newP + "data" +"/n", newU + "/n");
                editor.commit();

                Intent back = new Intent(reg.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}