package com.listview.demo.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater l;
    private UserContent[] users;
    MyAdapter(Context context,UserContent[] userContents){
        l=LayoutInflater.from(context);
        users=userContents;
    }
    @Override
    public int getCount() {
        return users.length;
    }

    @Override
    public UserContent getItem(int position) {
        return users[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout layout;
        if (convertView!=null){
            layout= (LinearLayout) convertView;
        } else {
            layout= (LinearLayout) l.inflate(R.layout.item,null);
        }
        UserContent userContent=getItem(position);
        ImageView icon=layout.findViewById(R.id.icon);
        TextView name =layout.findViewById(R.id.name);
        TextView sex =layout.findViewById(R.id.sex);
        TextView age =layout.findViewById(R.id.age);
        icon.setImageResource(userContent.iconId);
        name.setText(userContent.name);
        sex.setText(userContent.sex);
        Object obj=new Object();
        obj=userContent.age;
        age.setText(obj.toString());

        return layout;
    }
}
