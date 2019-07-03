package com.example.sprinkler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView zones = findViewById(R.id.zones);
        zones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zone1Intent = new Intent(MainActivity.this, SprinklerZones.class);

                startActivity(zone1Intent);
            }
        });

        TextView history = findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zone1Intent = new Intent(MainActivity.this, SprinklerHistory.class);

                startActivity(zone1Intent);
            }
        });
    }

    public void manualRunAll(View view) {
        Button runAllButton = findViewById(R.id.manual);
        // TODO: check status of running state
        if (runAllButton.getText().equals("Run All")) {
            runAllButton.setText("Stop run");
        }
        else {
            runAllButton.setText("Run All");
        }
    }
}
