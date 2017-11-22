package com.example.micha.permittowork.MaterialSection;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.micha.permittowork.R;


public class MaterialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Matériels");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materiel, container, false);
    }
}
