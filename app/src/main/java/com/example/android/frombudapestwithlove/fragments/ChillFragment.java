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


public class ChillFragment extends Fragment {

    public ChillFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.chill_fragment_loc_name01),
                getResources().getString(R.string.chill_fragment_loc_address01), R.drawable.chill_lukacs_thermal_bath_small, R.drawable.chill_lukacs_thermal_bath, getResources().getString(R.string.chill_fragment_loc_description01)));
        locations.add(new Location(getResources().getString(R.string.chill_fragment_loc_name02),
                getResources().getString(R.string.chill_fragment_loc_address02), R.drawable.chill_gellert_thermal_baths_small, R.drawable.chill_gellert_thermal_baths, getResources().getString(R.string.chill_fragment_loc_description02)));
        locations.add(new Location(getResources().getString(R.string.chill_fragment_loc_name03),
                getResources().getString(R.string.chill_fragment_loc_address03), R.drawable.chill_szechenyi_medicinal_bath_small, R.drawable.chill_szechenyi_medicinal_bath, getResources().getString(R.string.chill_fragment_loc_description03)));
        locations.add(new Location(getResources().getString(R.string.chill_fragment_loc_name04),
                getResources().getString(R.string.chill_fragment_loc_address04), R.drawable.chill_capital_circus_of_budapest_small, R.drawable.chill_capital_circus_of_budapest, getResources().getString(R.string.chill_fragment_loc_description04)));
        locations.add(new Location(getResources().getString(R.string.chill_fragment_loc_name05),
                getResources().getString(R.string.chill_fragment_loc_address05), R.drawable.chill_budapest_zoo_small, R.drawable.chill_budapest_zoo, getResources().getString(R.string.chill_fragment_loc_description05)));
        locations.add(new Location(getResources().getString(R.string.chill_fragment_loc_name06),
                getResources().getString(R.string.chill_fragment_loc_address06), R.drawable.chill_tropicarium_small, R.drawable.chill_tropicarium, getResources().getString(R.string.chill_fragment_loc_description06)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.fragment_chill);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Location location = locations.get(position);
                int fragmentBackgroundColorId = ContextCompat.getColor(getContext(), R.color.fragment_chill);

                DetailsActivityExtraProvider detailsActivityExtraProvider = new DetailsActivityExtraProvider();
                detailsActivityExtraProvider.provideExtraForDetailsActivity(getContext(), fragmentBackgroundColorId, location.getName(), location.getAddress(), location.getDescription(), location.getLocationHugeImageId());
            }
        });
        return rootView;
    }
}