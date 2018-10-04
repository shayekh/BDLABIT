package com.example.android.navexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AboutUsAdapter extends ArrayAdapter<AboutUsFlavor> {


    public AboutUsAdapter(Activity context, ArrayList<AboutUsFlavor> wa) {
        super(context, 0, wa);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);

        }
        AboutUsFlavor e = getItem(position);
        TextView location=(TextView)listItemView.findViewById(R.id.name);
        location.setText(e.getName());
        TextView phoneNumber=(TextView)listItemView.findViewById(R.id.designation);
        phoneNumber.setText(e.getDesignation());
        ImageView image=(ImageView)listItemView.findViewById(R.id.image);
        image.setImageResource(e.getImageId());
        return listItemView;



    }
}
