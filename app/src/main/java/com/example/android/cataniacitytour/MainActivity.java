package com.example.android.cataniacitytour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the monumnets category
        TextView monuments = (TextView) findViewById(R.id.monuments);

        // Set a click listener on that View
        monuments.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the monuments category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentsActivity.class);

                // Start the new activity
                startActivity(monumentsIntent);
            }
        });

        // Find the View that shows the rastaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the NightLIfe category
        TextView nightlife = (TextView) findViewById(R.id.nightLife);

        // Set a click listener on that View
        nightlife.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors NightLIfe is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent nightlifeIntent = new Intent(MainActivity.this, NightLIfe.class);

                // Start the new activity
                startActivity(nightlifeIntent);
            }
        });

        // Find the View that shows the typicalfood category
        TextView typicalfood = (TextView) findViewById(R.id.typicalFood);

        // Set a click listener on that View
        typicalfood.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the typicalfood category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent typicalfoodIntent = new Intent(MainActivity.this, TypicalFood.class);

                // Start the new activity
                startActivity(typicalfoodIntent);
            }
        });
    }
}
