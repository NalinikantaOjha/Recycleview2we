package com.example.recycleview2we;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder>{
    private ArrayList<StudentModel>studentList;
    private itemclickListner itemClickListner;




    public  StudentAdapter(ArrayList<StudentModel>studentList,
                           itemclickListner itemClickListner
                         ){
        this.studentList=studentList;
        this.itemClickListner=itemClickListner;


    }
    @NonNull

    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false);
        return new StudentViewHolder(view,itemClickListner);
    }


    @Override
    public void onBindViewHolder(@NonNull  StudentViewHolder holder, int position) {
        StudentModel student =studentList.get(position);
        holder.setData(student);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}

