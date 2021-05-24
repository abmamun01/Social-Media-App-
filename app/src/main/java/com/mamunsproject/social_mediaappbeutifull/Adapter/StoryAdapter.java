package com.mamunsproject.social_mediaappbeutifull.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mamunsproject.social_mediaappbeutifull.Model.Story_Model;
import com.mamunsproject.social_mediaappbeutifull.R;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryHolder> {


    ArrayList<Story_Model> list;
    Context context;

    public StoryAdapter(ArrayList<Story_Model> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public StoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.story_rv_design,parent,false);
        return new StoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryHolder holder, int position) {

        Story_Model model=list.get(position);

        holder.storyImage.setImageResource(model.getStory());
        holder.profileImage.setImageResource(model.getProfile());
        holder.storyType.setImageResource(model.getStoryType());
        holder.name.setText(model.getName());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StoryHolder extends RecyclerView.ViewHolder {

        ImageView storyImage,profileImage,storyType;
        TextView name;

        public StoryHolder(@NonNull View itemView) {
            super(itemView);

            storyImage=itemView.findViewById(R.id.postImage);
            profileImage=itemView.findViewById(R.id.profile_image);
            storyType=itemView.findViewById(R.id.story_type);
            name=itemView.findViewById(R.id.name);


        }
    }
}
