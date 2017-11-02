package com.example.micha.permittowork;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PermissionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Permissions");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_permisision, container, false);
    }
}
