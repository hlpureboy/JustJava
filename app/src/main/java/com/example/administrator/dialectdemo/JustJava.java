package com.example.administrator.dialectdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JustJava extends AppCompatActivity implements View.OnClickListener {
    private Button jian;
    private Button jia;
    private Button sum;
    private TextView coffce_number;
    private TextView shuliang;
    private TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_java);
        jian = (Button) findViewById(R.id.jian);
        jian.setOnClickListener(this);
        jia = (Button) findViewById(R.id.jia);
        jia.setOnClickListener(this);
        sum = (Button) findViewById(R.id.jisuan);
        sum.setOnClickListener(this);
        coffce_number = (TextView) findViewById(R.id.coffce_number);
        //coffce_number.setOnClickListener(this);
        shuliang = (TextView) findViewById(R.id.shuliang);
        //shuliang.setOnClickListener(this);
        price = (TextView) findViewById(R.id.price);
        //price.setOnClickListener(this);
    }

    public void jian() {
        int number;
        number = Integer.parseInt(coffce_number.getText().toString());
        number = number - 1;
        if (number < 0) {
            Toast.makeText(JustJava.this, "数量小于0", Toast.LENGTH_SHORT).show();
        } else {
            coffce_number.setText("" + number);
        }
    }

    public void jia() {
        int number;
        number = Integer.parseInt(coffce_number.getText().toString());
        number = number + 1;
        if (number < 0) {
            Toast.makeText(JustJava.this, "数量小于0", Toast.LENGTH_SHORT).show();
        } else {
            coffce_number.setText("" + number);
        }
    }

    public void jisuan() {
        int n;
        n = Integer.parseInt(coffce_number.getText().toString());
        shuliang.setText("咖啡的数量:" + n);
        price.setText("总价:" + n * 5);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.jian:
                jian();
                break;
            case R.id.jia:
                jia();
                break;
            case R.id.jisuan:
                jisuan();
                break;
        }
    }
}
