package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class attack_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attack_details);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("att_id");

        attack att = attack.attackers[id];

        ImageView image = (ImageView)findViewById(R.id.att_image);
        image.setImageResource(att.getImageID());

        TextView txtName1= (TextView)findViewById(R.id.txtName1);
        TextView txtDesc1= (TextView)findViewById(R.id.txtDesc1);

        txtName1.setText(att.getName());
        txtDesc1.setText(att.getDescription());

    }
}