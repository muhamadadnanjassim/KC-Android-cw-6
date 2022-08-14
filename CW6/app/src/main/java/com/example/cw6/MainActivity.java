package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students = new ArrayList<>();
//    ArrayList<Student> students = new ArrayList<>();

    int muhamad =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            EditText studentName = findViewById(R.id.StudentName);
            EditText studentAge = findViewById(R.id.StudentAge);
            EditText studentGrade = findViewById(R.id.studentGrade);
            ImageView studentPhoto = findViewById(R.id.StudentImg);
            Button changeStudentBtn =  findViewById(R.id.B1);

            Student s1 = new Student("salman",23,70,R.drawable.qwe3);
            Student s2 = new Student("yousef",16,95,R.drawable.qwe2);
            Student s3 = new Student("majed",19,80,R.drawable.qwe1);
            Student s4 = new Student("muhamad",17,60,R.drawable.qwe4);

            students.add(s1);
            students.add(s2);
            students.add(s3);
            students.add(s4);

            studentName.setText(students.get(muhamad).getStudentName());
            studentAge.setText(String.valueOf(students.get(muhamad).getStudentAge()));
            studentGrade.setText(String.valueOf(students.get(muhamad).getStudentGrade()));
            studentPhoto.setImageResource(students.get(muhamad).getStudentImg());

        changeStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (muhamad+1 == 4) muhamad =0;
                else muhamad++;

            studentName.setText(students.get(muhamad).getStudentName());
            studentAge.setText(String.valueOf(students.get(muhamad).getStudentAge()));
            studentGrade.setText(String.valueOf(students.get(muhamad).getStudentGrade()));
            studentPhoto.setImageResource(students.get(muhamad).getStudentImg());

        }
    });
   }
}
