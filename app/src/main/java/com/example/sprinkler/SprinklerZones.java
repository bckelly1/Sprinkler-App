package com.example.sprinkler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SprinklerZones extends AppCompatActivity {
//public class SprinklerZones extends ArrayAdapter<SprinklerZone> {
//    /**
//     * Constructs a new {@link SprinklerZoneAdapter}.
//     *
//     * @param context of the app
//     * @param zones is the list of zones, which is the data source of the adapter
//     */
//    public SprinklerZones(Context context, List<SprinklerZone> zones) {
//        super(context, 0, zones);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sprinkler_zones);

        TextView zone1 = findViewById(R.id.zone_1);
        zone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zone1Intent = new Intent(SprinklerZones.this, ManualControl.class);
                zone1Intent.putExtra("ZONE_NAME", "Brian Zone");

                startActivity(zone1Intent);
            }
        });
    }

//    /**
//     * Returns a list item view that displays information about the earthquake at the given position
//     * in the list of earthquakes.
//     */
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        // Check if there is an existing list item view (called convertView) that we can reuse,
//        // otherwise, if convertView is null, then inflate a new list item layout.
//        View listItemView = convertView;
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.zone_list_item, parent, false);
//        }
//
//        // Find the TextView with view ID date
//        TextView nameView = listItemView.findViewById(R.id.zone_name);
//        // Display the date of the current earthquake in that TextView
//        nameView.setText("");
//
//        // Return the list item view that is now showing the appropriate data
//        return listItemView;
//    }
}
