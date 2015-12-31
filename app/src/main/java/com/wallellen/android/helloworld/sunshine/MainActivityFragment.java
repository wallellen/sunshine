package com.wallellen.android.helloworld.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        List<String> values = new ArrayList<>();
        values.add("Today - Sunny - 88/63");
        values.add("Tomorrow - Foggy - 70/46");
        values.add("Weds - Cloudy - 72/63");
        values.add("Thurs - Rainy - 64/51");
        values.add("Fri - Foggy - 70/46");
        values.add("Sat - Sunny -  76/68");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview, values);
        ListView view1 = (ListView) view.findViewById(R.id.listview_forecast);
        view1.setAdapter(arrayAdapter);

        return view;
    }
}
