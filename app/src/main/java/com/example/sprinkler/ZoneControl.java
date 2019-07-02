package com.example.sprinkler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ZoneControl extends AppCompatActivity {
    int teamPointsA = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zone_control);
        displayMessage(teamPointsA);
    }

    private void displayMessage(int points) {
        TextView priceTextView = findViewById(R.id.duration);
        priceTextView.setText(""+points);
    }

    public void addMinute(View view) {
        if (teamPointsA + 1 >= 60) {
            Button addButton = findViewById(R.id.add_minute);
            addButton.setEnabled(false);
        }
        teamPointsA = teamPointsA + 1;
        displayMessage(teamPointsA);
        Button subtractButton = findViewById(R.id.subtract_minute);
        subtractButton.setEnabled(true);
    }

    public void subtractMinute(View view) {
        if (teamPointsA - 1 <= 0) {
            Button subtractButton = findViewById(R.id.subtract_minute);
            subtractButton.setEnabled(false);
        }
        teamPointsA = teamPointsA - 1;
        displayMessage(teamPointsA);
        Button addButton = findViewById(R.id.add_minute);
        addButton.setEnabled(true);

    }

    public void reset(View view) {
        teamPointsA = 5;
        displayMessage(teamPointsA);
        Button addButton = findViewById(R.id.add_minute);
        addButton.setEnabled(true);
        Button subtractButton = findViewById(R.id.subtract_minute);
        subtractButton.setEnabled(true);
    }
}
