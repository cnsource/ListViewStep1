package com.listview.demo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] city={"河北","湖南","北京","南宁","山东"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);*/
        ListView listView=findViewById(R.id.listview);
        final UserContent[] userContents={
                new UserContent(R.drawable.img1,"小明",18,"男"),
                new UserContent(R.drawable.img2,"小张",18,"男"),
                new UserContent(R.drawable.img3,"小莉",18,"女"),
                new UserContent(R.drawable.img1,"小明",18,"男"),
                new UserContent(R.drawable.img2,"小张",18,"男"),
                new UserContent(R.drawable.img3,"小莉",18,"女"),
                new UserContent(R.drawable.img1,"小明",18,"男"),
                new UserContent(R.drawable.img2,"小张",18,"男"),
                new UserContent(R.drawable.img3,"小莉",18,"女"),
                new UserContent(R.drawable.img1,"小明",18,"男"),
                new UserContent(R.drawable.img2,"小张",18,"男"),
                new UserContent(R.drawable.img3,"小莉",18,"女"),
                new UserContent(R.drawable.img1,"小明",18,"男"),
                new UserContent(R.drawable.img2,"小张",18,"男"),
                new UserContent(R.drawable.img3,"小莉",18,"女"),
                new UserContent(R.drawable.img1,"小明",18,"男"),
                new UserContent(R.drawable.img2,"小张",18,"男"),
                new UserContent(R.drawable.img3,"小莉",18,"女")
        };
        MyAdapter myAdapter=new MyAdapter(MainActivity.this,userContents);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, userContents[position].name+userContents[position].sex+userContents[position].age, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
