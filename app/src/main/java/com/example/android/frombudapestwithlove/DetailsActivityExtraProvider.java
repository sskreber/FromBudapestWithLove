package com.example.android.frombudapestwithlove;

import android.content.Context;
import android.content.Intent;

public class DetailsActivityExtraProvider {

    public DetailsActivityExtraProvider() {
    }

    public void provideExtraForDetailsActivity(Context context, int fragmentBackgroundColorId, String locationNameExtra, String locationAddressExtra,
                                               String locationDescriptionExtra, int locationHugeImageExtra) {

        Intent currentLocationDetailsIntent = new Intent(context, LocationDetailsActivity.class);
        currentLocationDetailsIntent.putExtra("fragmentBackgroundColorId", fragmentBackgroundColorId);
        currentLocationDetailsIntent.putExtra("locationName", locationNameExtra);
        currentLocationDetailsIntent.putExtra("locationAddress", locationAddressExtra);
        currentLocationDetailsIntent.putExtra("locationDescription", locationDescriptionExtra);
        currentLocationDetailsIntent.putExtra("locationHugeImage", locationHugeImageExtra);

        context.startActivity(currentLocationDetailsIntent);
    }
}
