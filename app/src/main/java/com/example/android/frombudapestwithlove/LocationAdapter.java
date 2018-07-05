package com.example.android.frombudapestwithlove;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    /**
     * Resource ID for the background color for this list of words
     */
    private int colorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        this.colorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Checking if the existing view is being reused; if not then inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location current_location = getItem(position);

        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        locationNameTextView.setText(current_location.getName());

        TextView locationAddressTextView = (TextView) listItemView.findViewById(R.id.location_address);
        locationAddressTextView.setText(current_location.getAddress());

        ImageView locationImageView = (ImageView) listItemView.findViewById((R.id.location_image));

        if (current_location.hasImage()) {
            locationImageView.setImageResource(current_location.getLocationImageId());
            locationImageView.setVisibility(View.VISIBLE);
        } else {
            locationImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the given fragment's background colour
        int fragmentBackgroundColor = ContextCompat.getColor(getContext(), colorResourceId);
        // Set layout's  background color to fragment's colour
        textContainer.setBackgroundColor(fragmentBackgroundColor);

        return listItemView;
    }
}
