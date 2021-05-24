package com.mamunsproject.social_mediaappbeutifull.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.mamunsproject.social_mediaappbeutifull.Model.DashBoardModel;
import com.mamunsproject.social_mediaappbeutifull.R;

import java.util.ArrayList;

public class DeshboardAdapter extends RecyclerView.Adapter<DeshboardAdapter.DeshBoardHolder> {


    ArrayList<DashBoardModel>list;
    Context context;
    public DeshboardAdapter(ArrayList<DashBoardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public DeshBoardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.deshboard_rv_sample  ,parent,false);
        return new DeshBoardHolder(view );
    }

    @Override
    public void onBindViewHolder(@NonNull DeshBoardHolder holder, int position) {

        DashBoardModel model=list.get(position);

        holder.profileImage.setImageResource(model.getProflile());
        holder.postImage.setImageResource(model.getProflile());
        holder.name.setText(model.getName());
        holder.about.setText(model.getAbout());
        holder.like.setText(model.getLike());
        holder.comment.setText(model.getComment());
        holder.share.setText(model.getShare());




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DeshBoardHolder extends RecyclerView.ViewHolder {
        
        
        ImageView profileImage,postImage,saveImage;
        TextView name,about,like,comment,share;
        
        
        public DeshBoardHolder(@NonNull View itemView) {
            super(itemView);
            
            profileImage=itemView.findViewById(R.id.profile_image);
            postImage=itemView.findViewById(R.id.postImage);
            saveImage=itemView.findViewById(R.id.save);
            name=itemView.findViewById(R.id.user_name);
            about=itemView.findViewById(R.id.about);
            like=itemView.findViewById(R.id.like);
            comment=itemView.findViewById(R.id.comment);
            share=itemView.findViewById(R.id.share);
        }
    }
}
