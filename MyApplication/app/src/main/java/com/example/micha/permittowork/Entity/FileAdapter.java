package com.example.micha.permittowork.Entity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.micha.permittowork.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by micha on 11/01/2018.
 */

public class FileAdapter extends ArrayAdapter<FileBean> {

    private Context context;
    private int resources;
    private ArrayList<FileBean> fileList;

    public FileAdapter(Context context, int resource, ArrayList<FileBean> fileList) {
        super(context, resource, fileList);
        this.context = context;
        this.resources = resource;
        this.fileList = fileList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(resources, parent, false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(fileList.get(position).getFileName());

        return view;
    }
}
