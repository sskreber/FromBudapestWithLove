package com.example.android.frombudapestwithlove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
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
            View scrollviewLayout = findViewById(R.id.scrollview_layout);
            scrollviewLayout.setBackgroundColor(fragmentBackgroundColorId);

            TextView currentLocationNameView = findViewById(R.id.location_name);
            currentLocationNameView.setText(currentLocationName);
            TextView currentLocationAddressView = findViewById(R.id.location_address);
            currentLocationAddressView.setText(currentLocationAddress);
            TextView currentLocationDescriptionView = findViewById(R.id.location_description);
            currentLocationDescriptionView.setText(currentLocationDescription);
//            currentLocationDescriptionView.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);

            ImageView currentLocationImageView = (ImageView) findViewById((R.id.location_image));
            if (currentLocationImage != NO_PHOTO_AVAILABLE) {
                currentLocationImageView.setImageResource(currentLocationImage);
                currentLocationImageView.setVisibility(View.VISIBLE);
            } else {
                currentLocationImageView.setVisibility(View.GONE);
            }
        }

        // Hooking up the return to menu button to get user back to main activity from currently played song
        Button returnToMenuButton = (Button) findViewById(R.id.button_return_to_menu);
        returnToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnToMainActivity = new Intent(LocationDetailsActivity.this, MainActivity.class);
                startActivity(returnToMainActivity);
            }
        });
    }
}