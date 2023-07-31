package com.example.listview_gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView student_list_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        student_list_view = findViewById(R.id.student_list_view);

        List<Student> students  = new ArrayList<>();
        students.add(new Student("Ram","1","Kathmandu"));
        students.add(new Student("Hari","2","Bhaktapur"));
        students.add(new Student("Sita","3","Lalitpur"));
        students.add(new Student("Gita","4","Kirtipur"));
        students.add(new Student("Sweta","5","Dolakha"));

        StudentAdapter adapter = new StudentAdapter(this,students);
        student_list_view.setAdapter(adapter);
    }
}