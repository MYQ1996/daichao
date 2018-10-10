package com.example.myq.money.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.myq.money.CatAdapter;
import com.example.myq.money.Category;
import com.example.myq.money.R;
import com.example.myq.money.pojo.Goods;
import com.example.myq.money.pojo.Loans;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class IndexFragment extends Fragment {

    //    public String[] data = {"暹罗猫", "布偶猫", "折耳猫", "短毛猫", "波斯猫", "蓝猫", "森林猫", "孟买猫","缅因猫","埃及猫","伯曼猫","缅甸猫","新加坡猫","美国短尾猫","巴厘猫"};



    private List<Goods> good = new ArrayList<>();

    private List<Goods> good1 = new ArrayList<>();

    private List<Loans> loan = new ArrayList<>();


    public IndexFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        init();
        View v = inflater.inflate(R.layout.fragment_index, container, false);
        CatAdapter adapter = new CatAdapter(v.getContext(),R.layout.good_item,good);
        ((ListView) v.findViewById(R.id.list)).setAdapter(adapter);

        CatAdapter adapter1 = new CatAdapter(v.getContext(),R.layout.good_item,good1);
        ((ListView) v.findViewById(R.id.list1)).setAdapter(adapter1);

        Category category = new Category(v.getContext(),R.layout.loan_item,loan);
        ((ListView) v.findViewById(R.id.loanlist)).setAdapter(category);

        return v;
    }

    private void init() {
        good.add(new Goods("来一贷","可贷:5000-100000","贷款期限:3-24月", R.mipmap.zqh));
        good.add(new Goods("找钱花","可贷:5000-100000","贷款期限:3-24月", R.mipmap.zqh));
        good.add(new Goods("在线贷","可贷:5000-100000","贷款期限:3-24月",R.mipmap.zqh));
        good.add(new Goods("宜人贷","可贷:5000-100000","贷款期限:3-24月",R.mipmap.zqh));

        loan.add(new Loans("手机号就能贷",R.mipmap.sjh));
        loan.add(new Loans("身份证就能贷",R.mipmap.sfz));
        loan.add(new Loans("黑户也能贷",R.mipmap.hh));
        loan.add(new Loans("新品口子",R.mipmap.xp));

        good1.add(new Goods("爱借钱","可贷:5000-100000","贷款期限:3-24月", R.mipmap.zqh));


    }

}
