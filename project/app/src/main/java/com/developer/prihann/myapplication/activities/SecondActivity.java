package com.developer.prihann.myapplication.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developer.prihann.myapplication.R;
import com.developer.prihann.myapplication.models.Student;

public class SecondActivity extends AppCompatActivity {


    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        context = getApplicationContext();

//        Intent intent = getIntent();
//        Integer age = intent.getIntExtra("age",0);
//        String name = intent.getStringExtra("name");

//        Intent intent = getIntent();
//        Student student = (Student) intent.getSerializableExtra("custom_object");
//        Integer age = student.getAge();
//        String name = student.getName();

//        Intent intent = getIntent();
//        Student student = (Student) intent.getParcelableExtra("custom_object");
//        Integer age = student.getAge();
//        String name = student.getName();


        Toast.makeText(context, "My name is " + name + " and age is " + Integer.toString(age), Toast.LENGTH_SHORT).show();

    }
}
