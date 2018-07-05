package com.example.android.frombudapestwithlove;


import android.content.Context;
import android.content.Intent;

import com.example.android.frombudapestwithlove.fragments.CastlesFragment;
import com.example.android.frombudapestwithlove.fragments.ChillFragment;
import com.example.android.frombudapestwithlove.fragments.EateriesFragment;
import com.example.android.frombudapestwithlove.fragments.LibrariesFragment;

public class DetailsActivityExtraProvider {

    CastlesFragment castlesFragment;
    ChillFragment chillFragment;
    EateriesFragment eateriesFragment;
    LibrariesFragment librariesFragment;

    public DetailsActivityExtraProvider() {
    }

    public DetailsActivityExtraProvider(CastlesFragment castlesFragment, ChillFragment chillFragment,
                                        EateriesFragment eateriesFragment, LibrariesFragment librariesFragment) {
        this.castlesFragment = castlesFragment;
        this.chillFragment = chillFragment;
        this.eateriesFragment = eateriesFragment;
        this.librariesFragment = librariesFragment;
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