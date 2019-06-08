package com.pfe.samir.model;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.pfe.samir.R;
import java.util.List;

/**
 * Created by Etudiant RSD on 08/06/2019.
 */
public class AdapterTag extends RecyclerView.Adapter<BiblioViewHolder>{
    public static Context context;
    private List<Tag> tags;

    // public static tagBD tagbd;
    public static View view;


    public AdapterTag(Context context, List<Tag> tags) {
        this.context = context;
        this.tags = tags;
        //   tagbd = new tagBD(context);
    }
    @Override
    public BiblioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_j, parent, false);
        return new BiblioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final BiblioViewHolder holder, final int position) {
        final Tag j = tags.get(position);

        holder.description.setText( j.getDescription());
        holder.numerotation.setText(String.valueOf(position+1));
        holder.code.setText(j.getCode());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // InfosJ(position);
            }
        });

        holder.action_document.setVisibility(View.VISIBLE);
        holder.action_document.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public List<Tag> gettags() {
        return tags;
    }

    public void settags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public int getItemCount() {
        return tags.size();
    }
}
