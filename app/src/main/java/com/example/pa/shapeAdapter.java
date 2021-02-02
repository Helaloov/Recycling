package com.example.pa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class shapeAdapter extends ArrayAdapter<Shape> {

    public shapeAdapter(Context context, int resource, List<Shape> shapeList) {
        super(context, resource, shapeList);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        Shape shape = getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.shape_cell, parent, false);
        }

        TextView tv = (TextView) convertView.findViewById(R.id.shapeName);
        TextView tv1 = (TextView) convertView.findViewById(R.id.shapeAdress);
        ImageView iv = (ImageView) convertView.findViewById(R.id.shapeImage);
        tv.setText(shape.getName());
        tv1.setText(shape.getAdress());
        iv.setImageResource(shape.getImage());

        return convertView;
    }
}
