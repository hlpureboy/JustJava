package com.example.administrator.dialectdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NumberSound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //增加一个新功能
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_sound);
//        ArrayList<String>number=new ArrayList<>();
//        number.add("one");
//        number.add("two");
//        number.add("three");
//        number.add("four");
//        number.add("five");
       ListView ROOT=(ListView)findViewById(R.id.NumberRoot);
//        for (int i =0;i<5;i++){
//            TextView NumberView=new TextView(this);
//            NumberView.setText(number.get(i));
//            ROOT.addView(NumberView);
//        }
        String[] number1={"one","two","three","four","five"};
        ArrayAdapter<String> a=new ArrayAdapter<String>(NumberSound.this,android.R.layout.simple_list_item_activated_1,number1);
        ROOT.setAdapter(a);
    }

}
