package com.mamunsproject.social_mediaappbeutifull.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mamunsproject.social_mediaappbeutifull.Model.Friend_model;
import com.mamunsproject.social_mediaappbeutifull.R;

import java.util.ArrayList;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendHolder> {

    ArrayList<Friend_model> list;
    Context context;

    public FriendAdapter(ArrayList<Friend_model> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public FriendHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.friend_rv_sample,parent,false);

        return new FriendHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendHolder holder, int position) {


        holder.profile.setImageResource(list.get(position).getProfile());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FriendHolder extends RecyclerView.ViewHolder {

        ImageView profile;
        public FriendHolder(@NonNull View itemView) {
            super(itemView);

            profile=itemView.findViewById(R.id.profile_image);

        }
    }
}
