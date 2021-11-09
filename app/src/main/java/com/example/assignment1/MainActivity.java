package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText name = (EditText)findViewById(R.id.name);
        final EditText passwd = (EditText)findViewById(R.id.pass);
        Button logbtn = (Button)findViewById(R.id.login);

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = name.getText().toString();
                String pass = passwd.getText().toString();

                SharedPreferences prefs = getSharedPreferences("PREFS", MODE_PRIVATE);

                String userInfo = prefs.getString(user + pass + "data" + "/n","Invalid LogIn");

                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("print",userInfo);
                editor.commit();

                Intent displaysSreen = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(displaysSreen);
            }
        });

    }

    public void btnshow_click(View view) {

        String title = "";

        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("DATA",title);
        startActivity(intent);
    }
}