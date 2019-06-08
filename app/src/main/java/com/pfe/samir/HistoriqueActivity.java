package com.pfe.samir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pfe.samir.model.AdapterTag;
import com.pfe.samir.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class HistoriqueActivity extends AppCompatActivity {
    RecyclerView Tags;
    AdapterTag mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historique);

        Tags=(RecyclerView)findViewById(R.id.tag_list) ;
        Tags.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Tag> list = new ArrayList();
        list.add(new Tag("T001","1","Colis Samir"));
        list.add(new Tag("T002","2","Colis Ib"));
        list.add(new Tag("T003","3","Colis Majid"));
        list.add(new Tag("T004","4","Colis Mahamed"));
        mAdapter = new AdapterTag(this, list);
        Tags.setAdapter(mAdapter);
    }
}
