package com.developer.prihann.myapplication.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developer.prihann.myapplication.R;
import com.developer.prihann.myapplication.models.Student;

public class FirstActivity extends AppCompatActivity {

    Button button;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        context = getApplicationContext();
        button = findViewById(R.id.button_one);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDataTwo();
            }
        });
    }

    private void setData(){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("age",20);
        intent.putExtra("name","prihan");
        startActivity(intent);
    }

    private void setDataOne(){
        Intent intent = new Intent(context,SecondActivity.class);

        Student student = new Student();
        student.setAge(20);
        student.setName("prihan");

        intent.putExtra("custom_object",student);
        startActivity(intent);
    }

    private void setDataTwo(){
        Intent intent = new Intent(context,SecondActivity.class);

        Student student = new Student();
        student.setAge(20);
        student.setName("prihan");

        intent.putExtra("custom_object",student);
        startActivity(intent);
    }
}
