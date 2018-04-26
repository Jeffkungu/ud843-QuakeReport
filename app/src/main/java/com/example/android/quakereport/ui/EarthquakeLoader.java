package com.example.android.quakereport.ui;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.android.quakereport.data.Earthquake;
import com.example.android.quakereport.utils.QueryUtils;

import java.util.List;

/**
 * Created by jeffkungu on 25/04/2018.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String Url;

    public EarthquakeLoader(Context context, String Url) {
        super(context);
        this.Url = Url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(Url);
        return earthquakes;
    }
}
