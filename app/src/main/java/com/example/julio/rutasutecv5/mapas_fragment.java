package com.example.julio.rutasutecv5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;

/**
 * Created by julio on 04-18-17.
 */

public class mapas_fragment extends Fragment  {

    private static final String Tag="mapas_fragment";



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.mapas_fragment,container,false);


        return view;
    }

}
