package com.example.myq.money;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myq.money.pojo.Goods;
import com.example.myq.money.pojo.Loans;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public class Money extends AppCompatActivity {

//    public String[] data = {"暹罗猫", "布偶猫", "折耳猫", "短毛猫", "波斯猫", "蓝猫", "森林猫", "孟买猫","缅因猫","埃及猫","伯曼猫","缅甸猫","新加坡猫","美国短尾猫","巴厘猫"};



    private List<Goods> good = new ArrayList<>();

    private List<Goods> good1 = new ArrayList<>();

    private List<Loans> loan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        init();

        CatAdapter adapter = new CatAdapter(Money.this,R.layout.good_item,good);
        ((ListView) findViewById(R.id.list)).setAdapter(adapter);

        CatAdapter adapter1 = new CatAdapter(Money.this,R.layout.good_item,good1);
        ((ListView) findViewById(R.id.list1)).setAdapter(adapter1);

        Category category = new Category(Money.this,R.layout.loan_item,loan);
        ((ListView) findViewById(R.id.loanlist)).setAdapter(category);

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





