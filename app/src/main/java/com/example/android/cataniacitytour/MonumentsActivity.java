package com.example.android.cataniacitytour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by casab on 18/05/2017.
 */

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Benedettini), getString(R.string.WeekEnd),getString(R.string.FreeAccess), R.drawable.monument_benedettini));
        places.add(new Place(getString(R.string.Museo_C_Ursino),getString(R.string.WorkingDays),getString(R.string.LowPrice), R.drawable.monument_museo_cursino));
        places.add(new Place(getString(R.string.PalazzoChierici),getString(R.string.Benedettini), getString(R.string.LowPrice), R.drawable.monument_palazzo_chierici));
        places.add(new Place(getString(R.string.PalazzoElefanti), getString(R.string.WorkingDays), getString(R.string.LowPrice), R.drawable.monument_palazzo_elefanti));
        places.add(new Place(getString(R.string.ChiesaDuomo),getString(R.string.EveryDay),getString(R.string.FreeAccess), R.drawable.monument_chiesa_duomo));
        places.add(new Place(getString(R.string.PiazzaDuomo),getString(R.string.EveryDay),getString(R.string.FreeAccess), R.drawable.monument_piazza_duomo));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_monumnets.xml layout file.
        ListView listView = (ListView) findViewById(R.id.activity_monuments);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

    }
}
