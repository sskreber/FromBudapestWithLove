package com.example.android.frombudapestwithlove.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.frombudapestwithlove.DetailsActivityExtraProvider;
import com.example.android.frombudapestwithlove.Location;
import com.example.android.frombudapestwithlove.LocationAdapter;
import com.example.android.frombudapestwithlove.R;

import java.util.ArrayList;

public class CastlesFragment extends Fragment {

    public CastlesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.castles_fragment_loc_name01),
                getResources().getString(R.string.castles_fragment_loc_address01), R.drawable.castles_royal_palace_of_godollo_small, R.drawable.castles_royal_palace_of_godollo, getResources().getString(R.string.castles_fragment_loc_description01)));
        locations.add(new Location(getResources().getString(R.string.castles_fragment_loc_name02),
                getResources().getString(R.string.castles_fragment_loc_address02), R.drawable.castles_budavar_palace_small, R.drawable.castles_budavar_palace, getResources().getString(R.string.castles_fragment_loc_description02)));
        locations.add(new Location(getResources().getString(R.string.castles_fragment_loc_name03),
                getResources().getString(R.string.castles_fragment_loc_address03), R.drawable.castles_vajdahunyad_castle_small, R.drawable.castles_vajdahunyad_castle, getResources().getString(R.string.castles_fragment_loc_description03)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.fragment_castles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Location location = locations.get(position);
                int fragmentBackgroundColorId = ContextCompat.getColor(getContext(), R.color.fragment_castles);

                DetailsActivityExtraProvider detailsActivityExtraProvider = new DetailsActivityExtraProvider();
                detailsActivityExtraProvider.provideExtraForDetailsActivity(getContext(), fragmentBackgroundColorId, location.getName(), location.getAddress(), location.getDescription(), location.getLocationHugeImageId());
            }
        });
        return rootView;
    }
}
