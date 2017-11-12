package com.example.administrator.dialectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SomeOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_one);
        String[] some={"爸爸","妈妈","儿子","闺女","爷爷","奶奶"};
        ListView someone=(ListView)findViewById(R.id.root);
        ArrayAdapter<String> a=new ArrayAdapter<String>(SomeOne.this,android.R.layout.simple_list_item_activated_1,some);
        someone.setAdapter(a);
    }
}
