package com.example.micha.permittowork.HomeSection;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.micha.permittowork.DocumentSection.DocumentsFragment;
import com.example.micha.permittowork.R;

import java.util.Calendar;


public class HomeFragment extends Fragment implements Button.OnClickListener {

    private TextView welcome, requestWait, requestDone;
    private Button button;
    private String actualTime, actualDate, request_in_wait, request_done;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Permit To Work");

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        init(view);
        return view;
    }

    private void init(View view) {

        welcome = (TextView) view.findViewById(R.id.welcome);
        requestWait = (TextView) view.findViewById(R.id.request_wait);
        requestDone = (TextView) view.findViewById(R.id.request_done);
        button = (Button) view.findViewById(R.id.button);

        actualDate = Integer.toString(Calendar.getInstance().get(Calendar.DATE)) + "/"
                + Integer.toString(Calendar.getInstance().get(Calendar.MONTH))
                + Integer.toString(Calendar.getInstance().get(Calendar.YEAR));

        actualTime = Integer.toString(Calendar.getInstance().get(Calendar.HOUR)) + "h"
                + Integer.toString(Calendar.getInstance().get(Calendar.MINUTE)) + "min.";
        welcome.setText("Nous sommes le " + actualDate + ", il est " + actualTime);


        requestWait.setText("6 requêtes en attente.");
        requestDone.setText("11 requêtes acceptées.");

        button.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        Class fragmentClass = DocumentsFragment.class;
        try {
            fragment = (DocumentsFragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_main, fragment).commit();
    }
}
