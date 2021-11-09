package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.position);

        String[] values = new String[]{"Goal Keeper","Defender","Midfielder","Attacker"};


        ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1,values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Intent intent = new Intent(view.getContext(), action.class);
                    startActivity(intent);
                }

                if (position == 1){
                    Intent intent = new Intent(view.getContext(), activity3.class);
                    startActivity(intent);
                }

                if (position == 2){
                    Intent intent = new Intent(view.getContext(), activity3.class);
                    startActivity(intent);
                }

                if (position == 3){
                    Intent intent = new Intent(view.getContext(), attack_action.class);
                    startActivity(intent);
                }

            }
        });


    }
    public void testThreadBtn_Click(View view) {


        Thread thread = new Thread(new MyTask(10));

        thread.start();
        Toast.makeText(this, "Thread Test !!", Toast.LENGTH_SHORT).show();
    }

    class MyTask implements Runnable{
        int seconds;

        public MyTask(int seconds){
            this.seconds = seconds;
        }
        @Override
        public void run() {

            for(int i = 0; i<seconds; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}