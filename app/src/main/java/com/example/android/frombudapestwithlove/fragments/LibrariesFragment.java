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


public class LibrariesFragment extends Fragment {

    public LibrariesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.libraries_fragment_loc_name01),
                getResources().getString(R.string.libraries_fragment_loc_address01), R.drawable.libraries_national_szechenyi_library_small, R.drawable.libraries_national_szechenyi_library, getResources().getString(R.string.libraries_fragment_loc_description01)));
        locations.add(new Location(getResources().getString(R.string.libraries_fragment_loc_name02),
                getResources().getString(R.string.libraries_fragment_loc_address02), R.drawable.libraries_metropolitan_ervin_szabo_library_small, R.drawable.libraries_metropolitan_ervin_szabo_library, getResources().getString(R.string.libraries_fragment_loc_description02)));
        locations.add(new Location(getResources().getString(R.string.libraries_fragment_loc_name03),
                getResources().getString(R.string.libraries_fragment_loc_address03), R.drawable.libraries_national_library_of_foreign_literature_small, R.drawable.libraries_national_library_of_foreign_literature, getResources().getString(R.string.libraries_fragment_loc_description03)));
        locations.add(new Location(getResources().getString(R.string.libraries_fragment_loc_name04),
                getResources().getString(R.string.libraries_fragment_loc_address04), R.drawable.libraries_university_library_small, R.drawable.libraries_university_library, getResources().getString(R.string.libraries_fragment_loc_description04)));
        locations.add(new Location(getResources().getString(R.string.libraries_fragment_loc_name05),
                getResources().getString(R.string.libraries_fragment_loc_address05), R.drawable.libraries_the_japan_foundation_small, R.drawable.libraries_the_japan_foundation, getResources().getString(R.string.libraries_fragment_loc_description05)));
        locations.add(new Location(getResources().getString(R.string.libraries_fragment_loc_name06),
                getResources().getString(R.string.libraries_fragment_loc_address06), R.drawable.libraries_institut_francais_de_budapest_small, R.drawable.libraries_institut_francais_de_budapest, getResources().getString(R.string.libraries_fragment_loc_description06)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.fragment_libraries);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Location location = locations.get(position);
                int fragmentBackgroundColorId = ContextCompat.getColor(getContext(), R.color.fragment_libraries);

                DetailsActivityExtraProvider detailsActivityExtraProvider = new DetailsActivityExtraProvider();
                detailsActivityExtraProvider.provideExtraForDetailsActivity(getContext(), fragmentBackgroundColorId, location.getName(), location.getAddress(), location.getDescription(), location.getLocationHugeImageId());
            }
        });
        return rootView;
    }
}
