package com.example.administrator.dialectdemo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class SomeOne extends AppCompatActivity {
    private ArrayAdapter<String> a;
    private MediaPlayer mediaPlayer;
    private BaseAdapter adapter = new BaseAdapter() {
        private Someoncelldata[] data1 = new Someoncelldata[]{
                new Someoncelldata("爸爸", R.drawable.susu),
                new Someoncelldata("妈妈", R.drawable.susu),
                new Someoncelldata("儿子", R.drawable.susu),
                new Someoncelldata("闺女", R.drawable.susu),
                new Someoncelldata("爷爷", R.drawable.susu),
                new Someoncelldata("奶奶", R.drawable.susu),
        };

        @Override
        public int getCount() {
            return data1.length;
        }

        @Override
        public Someoncelldata getItem(int position) {
            return data1[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
//            TextView tv=null;
//            if(convertView!=null){
//                tv=(TextView) convertView;
//            }else {
//                tv=new TextView(SomeOne.this);
//            }
//            tv.setTextSize(50);
//            tv.setText(getItem(position));
//            return tv;
            /*
            * */
            LinearLayout ly = null;
            if (convertView != null) {
                ly = (LinearLayout) convertView;
            } else {
                ly = (LinearLayout) LayoutInflater.from(SomeOne.this).inflate(R.layout.activity_somone, null);
                //设置ly
            }
            Someoncelldata data = getItem(position);
            ImageView icon = (ImageView) ly.findViewById(R.id.icon_1);
            TextView dec = (TextView) ly.findViewById(R.id.dec);
            icon.setImageResource(data.icon_1);
            dec.setText(data.name);
            return ly;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_one);
        String[] some={"爸爸","妈妈","儿子","闺女","爷爷","奶奶"};
        ListView someone=(ListView)findViewById(R.id.root);
        a = new ArrayAdapter<String>(SomeOne.this, R.layout.allobject, some);
        someone.setAdapter(adapter);

//        ArrayAdapter<ALLObject>a=new ArrayAdapter<ALLObject>(this,android.R.layout.simple_list_item_1);
//        someone.setAdapter(a);
//        a.add(new ALLObject("我的爱人",1));
//        a.add(new ALLObject("我的男人",2));
//        a.add(new ALLObject("我的女人",3));
        someone.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String b=baseAdapter.getItem(position).toString();
//                Log.d("testing.........",b);
//                System.out.print("testing........."+b);
//                switch (b){
//                    case "爸爸":
//                        MediaPlayer mediaPlayer=MediaPlayer.create(SomeOne.this,R.raw.music_dad);
//                        mediaPlayer.start();
//                        break;
//                }
                //d=baseAdapter.getItem(position).toString();
                //Toast.makeText(SomeOne.this,b,Toast.LENGTH_SHORT).show();
                Someoncelldata d = (Someoncelldata) adapter.getItem(position);
                switch (d.name) {
                    case "爸爸":
                        MediaPlayer mediaPlayer = MediaPlayer.create(SomeOne.this, R.raw.music_dad);
                        mediaPlayer.start();
                        break;
                }
            }
        });

    }
}
