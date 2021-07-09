package com.example.recycleview2we;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvStudentImg;
    private TextView mTvName;
    private  TextView mTvAge;
    private TextView mTvDob;
    private TextView mTvAddress;
    private RelativeLayout relativeLayout;
    private  itemclickListner itemClickListner;

    public StudentViewHolder(@NonNull  View itemView, itemclickListner itemClickListner) {
        super(itemView);
        initViews(itemView);
        this.itemClickListner= itemClickListner;
    }
    private void initViews(View itemView){
        mIvStudentImg=itemView.findViewById(R.id.ivStudentImg);
        mTvAddress=itemView.findViewById(R.id.tvAddress);
        mTvAge=itemView.findViewById(R.id.tvAge);
        mTvDob=itemView.findViewById(R.id.tvDob);
        mTvName=itemView.findViewById(R.id.tvName);
        relativeLayout=itemView.findViewById(R.id.rlativelayout);
    }
    public void setData(StudentModel studentModel){
        mIvStudentImg.setImageResource(studentModel.getImageid());
        mTvName.setText(studentModel.getName());
       mTvAge.setText(studentModel.getAge()+"");
        mTvAddress.setText(studentModel.getAddress());
        mTvDob.setText(studentModel.getDob());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListner.onItemClicked(studentModel,getAdapterPosition());

            }
        });

    }
}
