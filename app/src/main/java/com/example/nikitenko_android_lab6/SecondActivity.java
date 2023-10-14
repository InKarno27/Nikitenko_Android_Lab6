package com.example.nikitenko_android_lab6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);
        Bundle arguments = getIntent().getExtras();
        Student student1;
        if (arguments != null) {
            student1 = (Student)
                    arguments.getSerializable(Student.class.getSimpleName());
            textView.setText("Имя: " + student1.getFirstName() + " "
                    + student1.getLastName()
                    + "\nГруппа: "
                    + student1.getGroup() +
                    "\nВозраст: " + String.valueOf(student1.getAge()));
        }
        setContentView(textView);
    }
}

