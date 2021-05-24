package com.mamunsproject.social_mediaappbeutifull.Adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mamunsproject.social_mediaappbeutifull.Model.NotificationModel;
import com.mamunsproject.social_mediaappbeutifull.R;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificaitonHolder> {

    ArrayList<NotificationModel> list;
    Context context;

    public NotificationAdapter(ArrayList<NotificationModel> list, Context context) {
        this.list = list;
        this.context = context;
    }



    @NonNull
    @Override
    public NotificaitonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.notification2sample,parent,false);
        return new NotificaitonHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull NotificaitonHolder holder, int position) {

        holder.profile.setImageResource(list.get(position).getProfile());
        holder.notification.setText(Html.fromHtml(list.get(position).getNotification()));
        holder.time.setText(list.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NotificaitonHolder extends RecyclerView.ViewHolder {

        ImageView profile;
        TextView notification,time;


        public NotificaitonHolder(@NonNull View itemView) {
            super(itemView);


            profile=itemView.findViewById(R.id.profile_image);
            notification=itemView.findViewById(R.id.notification);
            time=itemView.findViewById(R.id.time);
        }
    }
}
