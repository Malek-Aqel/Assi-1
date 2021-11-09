package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("gk_id");

        goalKepper gk = goalKepper.goalKeppers[id];

        ImageView image = (ImageView)findViewById(R.id.gk_image);
        image.setImageResource(gk.getImageID());

        TextView txtName= (TextView)findViewById(R.id.txtName);
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);

        txtName.setText(gk.getName());
        txtDesc.setText(gk.getDescription());

    }
}