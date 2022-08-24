package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
/////////////////////////////////تعريف


        TextView nameTextView = findViewById(R.id.nametext);
        TextView ageTextView = findViewById(R.id.agetext);


///////////////////////////////////// name
        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        nameTextView.setText(name);


////////////////////////////////////////// age
        int age = bundle.getInt("age");
        ageTextView.setText(String.valueOf(age));










    }
}