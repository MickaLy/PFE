package com.example.micha.permittowork.DocumentSection;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.micha.permittowork.Entity.Document;
import com.example.micha.permittowork.Entity.Type;
import com.example.micha.permittowork.R;

import java.util.ArrayList;
import java.util.List;


public class DocumentsFragment extends Fragment {

    private static final String TAG = "FragmentDocument";

    private List<Document> documentList;

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Documents");
        View view = inflater.inflate(R.layout.fragment_documents, container, false);

        //Initialize the list of documents
        initEntities();


        recyclerView = (RecyclerView)  view.findViewById(R.id.document_recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        recyclerView.setAdapter(new DocumentAdapter(documentList));

        // Inflate the layout for this fragment
        return view;
    }

    public void initEntities() {
        documentList = new ArrayList<>();
        documentList.add(new Document("Document 1", 23, Type.PDF));

        documentList.add(new Document("Document 2", 11, Type.PDF));
        documentList.add(new Document("Document 3", 98, Type.PDF));
        documentList.add(new Document("Document 4", 56, Type.PDF));
        documentList.add(new Document("Document 5", 77, Type.PDF));
        documentList.add(new Document("Document 6", 242, Type.PDF));
        documentList.add(new Document("Document 7", 128, Type.PDF));
        documentList.add(new Document("Document 8", 34, Type.PDF));
        documentList.add(new Document("Document 9", 99, Type.PDF));
        documentList.add(new Document("Document 10", 62, Type.PDF));
    }

}
