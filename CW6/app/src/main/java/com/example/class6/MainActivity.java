package com.example.class6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students = new ArrayList<>();

    int muhamad =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView studentName;
        studentName = findViewById(R.id.StudentAge);
        TextView studentAge;
        studentAge = findViewById(R.id.StudentAge);
        ImageView studentPhoto;
        studentPhoto = findViewById(R.id.StudentImg);
        Button B1 =  findViewById(R.id.button);

        Student s1 = new Student("Yousef",20,R.drawable.qwe);
        Student s2 = new Student("Majed",17,R.drawable.qwe);
        Student s3 = new Student("Salman",23,R.drawable.qwe);
        Student s4 = new Student("Muhamad",16,R.drawable.qwe);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

    }
}
