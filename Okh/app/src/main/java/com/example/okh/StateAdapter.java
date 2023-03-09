package com.example.okh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

public class StateAdapter extends ArrayAdapter<Human> {
    private LayoutInflater inflater;
    private int layout;
    private List<Human> humans;
    public StateAdapter(Context context, int resource, List<Human> hum) {
        super(context,resource,hum);
        this.humans=resource;
        this.layout=resource;
        this.inflater=LayoutInflater.from(context);
    }
    public View getView(int position, View converView, ViewGroup parent){
        View view=inflayer.inflate(this.layout,parent,attachToRoot false);
        ImageView photView=view.findViewById(R.id.imageView);
        TextView famView=view.findViewById(R.id.fio);
        TextView namView=view.findViewById(R.id.fio2);
        TextView otchView=view.findViewById(R.id.fio3);
        Human human=humans.get(position);
        photView.set
    }
}
