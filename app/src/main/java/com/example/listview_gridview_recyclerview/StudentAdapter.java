package com.example.listview_gridview_recyclerview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {


    TextView tvName;
    TextView tvRollNo;
    TextView tvAddress;

    public StudentAdapter(Context context, List<Student> students) {
        super(context, 0, students);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_student, parent, false);
        }

        Student student = getItem(position);

         tvRollNo = convertView.findViewById(R.id.tvRollNo);
         tvName = convertView.findViewById(R.id.tvName);
         tvAddress = convertView.findViewById(R.id.tvAddress);


        tvName.setText("Name:" +student.getName());
        tvRollNo.setText("Roll No:" + student.getRoll_no());
        tvAddress.setText("Address:" + student.getAddress());

        return convertView;
    }
}
