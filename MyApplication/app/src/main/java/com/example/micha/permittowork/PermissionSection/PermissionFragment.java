package com.example.micha.permittowork.PermissionSection;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.micha.permittowork.DocumentSection.DocumentAdapter;
import com.example.micha.permittowork.Entity.Document;
import com.example.micha.permittowork.Entity.Type;
import com.example.micha.permittowork.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PermissionFragment extends Fragment {

    private List<Document> documentList;

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Permissions");
        View view = inflater.inflate(R.layout.fragment_permisision, container, false);

        //Initialize the list of documents
        initEntities();


        recyclerView = (RecyclerView)  view.findViewById(R.id.permissions_recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        recyclerView.setAdapter(new DocumentAdapter(documentList));

        // Inflate the layout for this fragment
        return view;
    }

    public void initEntities() {
        documentList = new ArrayList<>();
        Random random = new Random();
        int maxRange = random.nextInt(40) + 1;
        documentList = new ArrayList<>();
        for (int i = 0; i < maxRange; i++) {
            documentList.add(new Document("Document " + i, 0, Type.PDF));
        }
    }
}
