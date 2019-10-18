package com.example.drawer.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.drawer.Entities.InformationProject;
import com.example.drawer.Entities.UITacheDashboard;
import com.example.drawer.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private List<UITacheDashboard> list;
    public CustomAdapter(Context context, List<UITacheDashboard>listUi) {
        this.context = context;
        this.list = listUi;
    }



    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.customlistview, viewGroup, false);
        TextView client = row.findViewById(R.id.TextView_sujet_dialog);
        TextView projet = row.findViewById(R.id.TextView_projet_dialog);
        TextView tache = row.findViewById(R.id.TextView_tache_dialog);
        UITacheDashboard uiTacheDashboard = (UITacheDashboard) getItem(i);
        client.setText(uiTacheDashboard.getClient());
        projet.setText(uiTacheDashboard.getProjet());
        tache.setText(uiTacheDashboard.getTache());
        return row;
    }
}
