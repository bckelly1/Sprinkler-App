package com.example.sprinkler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView zone1 = findViewById(R.id.zone_1);
        zone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zone1Intent = new Intent(MainActivity.this, ZoneControl.class);

                startActivity(zone1Intent);
            }
        });
    }
}
