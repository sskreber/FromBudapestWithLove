package com.example.android.frombudapestwithlove;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationDetailsActivity extends AppCompatActivity {

    private static final int NO_PHOTO_AVAILABLE = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.individual_location_details);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int fragmentBackgroundColorId = extras.getInt("fragmentBackgroundColorId");
            String currentLocationName = extras.getString("locationName");
            String currentLocationAddress = extras.getString("locationAddress");
            String currentLocationDescription = extras.getString("locationDescription");
            int currentLocationImage = extras.getInt("locationHugeImage");

            View activityLayout = findViewById(R.id.individual_location_container);
            activityLayout.setBackgroundColor(fragmentBackgroundColorId);

            TextView currentLocationNameView = findViewById(R.id.location_name);
            currentLocationNameView.setText(currentLocationName);
            TextView currentLocationAddressView = findViewById(R.id.location_address);
            currentLocationAddressView.setText(currentLocationAddress);
            TextView currentLocationDescriptionView = findViewById(R.id.location_description);
            currentLocationDescriptionView.setText(currentLocationDescription);

            ImageView currentLocationImageView = (ImageView) findViewById((R.id.location_image));
            if (currentLocationImage != NO_PHOTO_AVAILABLE) {
                currentLocationImageView.setImageResource(currentLocationImage);
                currentLocationImageView.setVisibility(View.VISIBLE);
            } else {
                currentLocationImageView.setVisibility(View.GONE);
            }
        }


    }
}
