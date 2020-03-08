package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        //RecycleView
        recyclerView = findViewById(R.id.layout_family);

        //ArrayList
        ArrayList<Word> family = new ArrayList<>();
        family.add( new Word("father","أب",R.drawable.family_father) );
        family.add(new Word("mother","أم",R.drawable.family_mother));
        family.add(new Word("daughter","ابنه",R.drawable.family_daughter));
        family.add(new Word("son","ابن",R.drawable.family_son));
        family.add(new Word("old sister","الاخت الكبرى",R.drawable.family_older_sister));
        family.add(new Word("older brother","الاخ الاكبر",R.drawable.family_older_brother));
        family.add(new Word("younger sister","الاخت الصغرى",R.drawable.family_younger_sister));
        family.add(new Word("younger brother","الاخ الاصغر",R.drawable.family_younger_brother));
        family.add(new Word("grandfather","جد",R.drawable.family_grandfather));
        family.add(new Word("grandmother","جده",R.drawable.family_grandmother));




        myAdapter_Number adapter_number = new myAdapter_Number(family);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(lm);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter_number);


    }
}
