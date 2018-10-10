package com.example.myq.money;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myq.money.fragment.IndexFragment;
import com.example.myq.money.pojo.Loans;

import java.util.List;

public class Category extends ArrayAdapter<Loans> {

    private int resourceId;

    public Category(Context context, int resource, List<Loans> objects) {
        super(context,resource,objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Loans loan = getItem(position);//获取当前项的实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ((ImageView) view.findViewById(R.id.image)).setImageResource(loan.getImageId());
        ((TextView) view.findViewById(R.id.name)).setText(loan.getName());
        return view;
    }
}
