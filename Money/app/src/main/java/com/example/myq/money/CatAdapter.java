package com.example.myq.money;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myq.money.pojo.Goods;

import java.util.List;

public class CatAdapter extends ArrayAdapter<Goods> {

    private int resourceId;

    public CatAdapter(Context context, int resource, List<Goods> objects) {
        super(context,resource,objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Goods good = getItem(position);//获取当前项的实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ((ImageView) view.findViewById(R.id.image)).setImageResource(good.getImageId());
        ((TextView) view.findViewById(R.id.name)).setText(good.getName());
        ((TextView) view.findViewById(R.id.price)).setText(good.getPrice());
        ((TextView) view.findViewById(R.id.time)).setText(good.getTime());
        return view;
    }
}
