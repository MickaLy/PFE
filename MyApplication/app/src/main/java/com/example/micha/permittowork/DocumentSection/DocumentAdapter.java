package com.example.micha.permittowork.DocumentSection;

import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.micha.permittowork.Entity.Document;
import com.example.micha.permittowork.R;

import java.util.List;

/**
 * Created by micha on 22/11/2017.
 */
public class DocumentAdapter extends RecyclerView.Adapter<DocumentAdapter.CellViewHolder> {

    private List<Document> documentList;

    public DocumentAdapter(List<Document> documentList) {
        this.documentList = documentList;
    }

    @Override
    public CellViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cell_layout, parent, false);

        return new CellViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CellViewHolder holder, int position) {
        holder.display(documentList.get(position));
    }

    @Override
    public int getItemCount() {
        return documentList.size();
    }

    public class CellViewHolder extends RecyclerView.ViewHolder {

        private final ImageView icon;
        private final TextView title;

        private Document document;

        public CellViewHolder(final View itemView) {
            super(itemView);

            icon = (ImageView) itemView.findViewById(R.id.imageView);
            title = (TextView) itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new AlertDialog.Builder(itemView.getContext())
                    .setTitle("Item clicked")
                    .setMessage(document.getName() + " has been touched")
                    .show();
                }
            });
        }

        public void display(Document document) {
            this.document = document;
            title.setText(document.getName());
        }
    }
}
