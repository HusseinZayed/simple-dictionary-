package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Color extends AppCompatActivity {


    MediaPlayer mMediaPlayer;
    RecyclerView recyclerView,layout_recycleview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        //RecycleView
        recyclerView = findViewById(R.id.layout_color);

        //ArrayList
        ArrayList<Word> color = new ArrayList<>();
        color.add( new Word("black","أسود",R.drawable.color_black) );
        color.add(new Word("brown","بنى",R.drawable.color_brown));
        color.add(new Word("gray","رمادى",R.drawable.color_gray));
        color.add(new Word("green","أخضر",R.drawable.color_green));
        color.add(new Word("white","أبيض",R.drawable.color_white));
        color.add(new Word("red","أحمر",R.drawable.color_red));
        color.add(new Word("dusty yellow","اصفر غامق",R.drawable.color_dusty_yellow));
        color.add(new Word("mustard yellow","اصفر فاتح",R.drawable.color_mustard_yellow));





        myAdapter_Number adapter_number = new myAdapter_Number(color);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(lm);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter_number);

        recyclerView.addOnItemTouchListener(
                new myAdapter_Number.RecyclerItemClickListener(this, recyclerView ,new myAdapter_Number.RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        mMediaPlayer = MediaPlayer.create(Color.this, R.raw.number_one);
                        mMediaPlayer.start();
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );



    }}
