package com.mamunsproject.social_mediaappbeutifull.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.mamunsproject.social_mediaappbeutifull.Adapter.NotificationAdapter;
import com.mamunsproject.social_mediaappbeutifull.Adapter.ViewPagerAdapter;
import com.mamunsproject.social_mediaappbeutifull.Model.NotificationModel;
import com.mamunsproject.social_mediaappbeutifull.R;

import java.util.ArrayList;


public class Notification2Fragment extends Fragment {



    RecyclerView recyclerView;
    ArrayList<NotificationModel> list;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_notification2, container, false);



        recyclerView=view.findViewById(R.id.notification2RV);
        list=new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        list.add(new NotificationModel(R.drawable.profile,"M. Amin Mentioned you in a comment look at it right now","Just Now"));
        list.add(new NotificationModel(R.drawable.cover,"M. Yasing Ahmae  comment look at it right","34.3"));



        NotificationAdapter adapter=new NotificationAdapter(list,getContext());

        recyclerView.setAdapter(adapter);








        return view;
    }
}