package com.example.micha.permittowork.PermissionSection;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.micha.permittowork.R;


public class PermissionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Permissions");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_permisision, container, false);
    }

}
