package com.example.sprinkler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ManualControl extends AppCompatActivity {
    int teamPointsA = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_control);

        TextView zoneName = findViewById(R.id.zone_name);
        zoneName.setText(getIntent().getStringExtra("ZONE_NAME"));
        displayMessage(teamPointsA);

        Button stopRunView = findViewById(R.id.stop_run);
        stopRunView.setEnabled(false);
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

    public void save(View view) {
        // TODO: Save content and persist state
    }

    public void reset(View view) {
        teamPointsA = 5;
        displayMessage(teamPointsA);
        Button addButton = findViewById(R.id.add_minute);
        addButton.setEnabled(true);
        Button subtractButton = findViewById(R.id.subtract_minute);
        subtractButton.setEnabled(true);
        Switch enabledSwitch = findViewById(R.id.enabled);
        enabledSwitch.setChecked(true);
    }

    public void runOnce(View view){
        Button runOnceButton = findViewById(R.id.run_once);
        runOnceButton.setEnabled(false);

        Button stopRunButton = findViewById(R.id.stop_run);
        stopRunButton.setEnabled(true);
    }

    public void stopRun(View view){
        Button runOnceButton = findViewById(R.id.run_once);
        runOnceButton.setEnabled(true);

        Button stopRunButton = findViewById(R.id.stop_run);
        stopRunButton.setEnabled(false);
    }
}
