package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText studentname = findViewById(R.id.studentname);
        EditText studentage = findViewById(R.id.studentage);
        Button button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = studentname.getText().toString();
                int age = Integer.parseInt(studentage.getText().toString());



                Intent student = new Intent (MainActivity.this, MainActivity2.class);
                student.putExtra("name",name);
                student.putExtra("age",age);




                startActivity(student);






            }
        });






    }
}