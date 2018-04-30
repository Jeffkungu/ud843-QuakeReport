package com.example.android.quakereport.ui;

import com.example.android.quakereport.data.Earthquake;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffkungu on 30/04/2018.
 */

public interface EarthquakeContract {

    interface View {
        void displayEarthquake(List<Earthquake> earthquakes);
        void clearAdapter();

    }

    interface UserActionListener {
        ArrayList<Earthquake> extractEarthquakes(String earthquakeJSON);
        void openEarthquakePage();
    }
}
