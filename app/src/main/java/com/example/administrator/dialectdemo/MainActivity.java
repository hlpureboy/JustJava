package com.example.administrator.dialectdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button name;
    private Button number;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(Button)findViewById(R.id.name);
        name.setOnClickListener(this);
        number=(Button)findViewById(R.id.number);
        number.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.number:
                Intent intent=new Intent(MainActivity.this,NumberSound.class);
                startActivity(intent);
                break;
            case R.id.name:
                Intent intent1=new Intent(MainActivity.this,SomeOne.class);
                startActivity(intent1);
                break;
        }

    }
}
