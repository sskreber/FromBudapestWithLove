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

public class EateriesFragment extends Fragment {

    public EateriesFragment() {
    }

    private static final int NO_PHOTO_AVAILABLE = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name01),
                getResources().getString(R.string. eateries_fragment_loc_address01),getResources().getString(R.string.eateries_fragment_loc_description01)));
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name02),
                getResources().getString(R.string. eateries_fragment_loc_address02), getResources().getString(R.string.eateries_fragment_loc_description02)));
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name03),
                getResources().getString(R.string. eateries_fragment_loc_address03),getResources().getString(R.string.eateries_fragment_loc_description02)));
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name04),
                getResources().getString(R.string. eateries_fragment_loc_address04), getResources().getString(R.string.eateries_fragment_loc_description04)));
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name05),
                getResources().getString(R.string. eateries_fragment_loc_address05), getResources().getString(R.string.eateries_fragment_loc_description05)));
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name06),
                getResources().getString(R.string. eateries_fragment_loc_address06), getResources().getString(R.string.eateries_fragment_loc_description06)));
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name07),
                getResources().getString(R.string. eateries_fragment_loc_address07),getResources().getString(R.string.eateries_fragment_loc_description07)));
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name08),
                getResources().getString(R.string. eateries_fragment_loc_address08), getResources().getString(R.string.eateries_fragment_loc_description08)));
        locations.add(new Location(getResources().getString(R.string.eateries_fragment_loc_name09),
                getResources().getString(R.string. eateries_fragment_loc_address09), getResources().getString(R.string.eateries_fragment_loc_description09)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.fragment_eateries);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Location location = locations.get(position);
                int fragmentBackgroundColorId = ContextCompat.getColor(getContext(), R.color.fragment_eateries);

                DetailsActivityExtraProvider detailsActivityExtraProvider = new DetailsActivityExtraProvider();
                detailsActivityExtraProvider.provideExtraForDetailsActivity(getContext(), fragmentBackgroundColorId, location.getName(), location.getAddress(), location.getDescription(), NO_PHOTO_AVAILABLE);
            }
        });
        return rootView;
    }
}
