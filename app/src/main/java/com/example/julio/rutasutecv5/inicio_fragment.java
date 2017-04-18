package com.example.julio.rutasutecv5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by julio on 04-18-17.
 */

public class inicio_fragment extends Fragment {
    private static final String TAG = "inicio_fragment";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.inicio_fragment,container,false);


        return view;
    }
}
