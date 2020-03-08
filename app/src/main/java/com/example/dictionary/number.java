package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class number extends AppCompatActivity {
    RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        //RecycleView
        recyclerView = findViewById(R.id.layout_number);

        //ArrayList
        ArrayList<Word> number = new ArrayList<>();
        number.add( new Word("Zero","صفر",R.drawable.number_one) );
        number.add(new Word("one","واحد",R.drawable.number_two));
        number.add(new Word("two","اتنين",R.drawable.number_three));
        number.add(new Word("three","ثلاثه",R.drawable.number_four));
        number.add(new Word("four","اربعه",R.drawable.number_five));
        number.add(new Word("five","خمسه",R.drawable.number_six));
        number.add(new Word("six","سته",R.drawable.number_seven));
        number.add(new Word("seven","سبعه",R.drawable.number_eight));
        number.add(new Word("eight","ثمانيه",R.drawable.number_nine));
        number.add(new Word("nine","تسعه",R.drawable.number_nine));
        number.add(new Word("ten","عشره",R.drawable.number_ten));




      myAdapter_Number adapter_number = new myAdapter_Number(number);
      RecyclerView.LayoutManager lm = new LinearLayoutManager(this);

      recyclerView.setLayoutManager(lm);
      recyclerView.setHasFixedSize(true);
      recyclerView.setAdapter(adapter_number);



    }
}
