package com.example.recycleview2we;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemclickListner {
    private RecyclerView recyclerView;
    private ArrayList<StudentModel>arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildsetData();
        setRecyclerView();
    }private void setRecyclerView(){
        StudentAdapter studentAdapter=new StudentAdapter(arrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }
    private  void initView(){
        recyclerView=findViewById(R.id.recycleView);
    }
    private void buildsetData(){
       for(int i =0;i<100;i++){
            StudentModel studentModel = new StudentModel("NALINI",18,"TANGI",R.drawable.skyobjecy,"2091");
       arrayList.add(studentModel);
        }

    }

    @Override
    public void onItemClicked(StudentModel model, int position) {
        new AlertDialog.Builder(this).setTitle("hEY THIS IS THE Data")
                .setMessage(model.getName()+"\n"
                +model.getDob()+"\n"
                +model.getAddress()).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                
            }
        })
                .show();

    }
}