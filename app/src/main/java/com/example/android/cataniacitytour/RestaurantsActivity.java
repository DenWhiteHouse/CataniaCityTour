package com.example.android.cataniacitytour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by casab on 19/05/2017.
 */

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Cuore), getString(R.string.WorkingDays),getString(R.string.HighPrice), R.drawable.rest_cuore));
        places.add(new Place(getString(R.string.EtnaFood), getString(R.string.WorkingDays), getString(R.string.HighPrice), R.drawable.rest_etnafood));
        places.add(new Place(getString(R.string.KMZero), getString(R.string.WorkingDays), getString(R.string.HighPrice), R.drawable.rest_kmzero));
        places.add(new Place(getString(R.string.Oxidiana), getString(R.string.WorkingDays), getString(R.string.HighPrice), R.drawable.rest_oxidiana));
        places.add(new Place(getString(R.string.Scirocco), getString(R.string.WorkingDays), getString(R.string.HighPrice), R.drawable.rest_scirocco));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_monumnets.xml layout file.
        ListView listView = (ListView) findViewById(R.id.activity_restaurants);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

    }
}
