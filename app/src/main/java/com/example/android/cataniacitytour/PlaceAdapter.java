package com.example.android.cataniacitytour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by casab on 18/05/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.item_title);
        // Get the version title from the current object and
        // set this text on the name TextView
        titleTextView.setText(currentPlace.getTitle());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView daysTextView = (TextView) listItemView.findViewById(R.id.item_days);
        // Get the version title from the current object and
        // set this text on the name TextView
        daysTextView.setText(currentPlace.getDays());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.item_price);
        // Get the version title from the current object and
        // set this text on the name TextView
        priceTextView.setText(currentPlace.getPrice());

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView imageView = (ImageView) listItemView.findViewById((R.id.item_image));
        // Get the version title from the current object and
        // set this image on the TextView
        imageView.setImageResource(currentPlace.getImageResourceID());

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
