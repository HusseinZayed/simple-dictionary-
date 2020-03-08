package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNumber = findViewById(R.id.btnNumber);
        Button btnColor = findViewById(R.id.btnColor);
        Button btnFamily = findViewById(R.id.btnFamily);
        Button btnPhrases = findViewById(R.id.btnPhrases);

        //open number activity
        btnNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,number.class);
                startActivity(i);
                Toast.makeText(v.getContext(),"open numbers",Toast.LENGTH_SHORT).show();

            }
        });

        //open color activity
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Color.class);
                startActivity(i);

            }
        });

        //open family activity
        btnFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,family.class);
                startActivity(i);

            }
        });

        //open phrases activity
        btnPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,phrases.class);
                startActivity(i);

            }
        });
    }

   }
