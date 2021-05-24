package com.mamunsproject.social_mediaappbeutifull.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mamunsproject.social_mediaappbeutifull.Adapter.FriendAdapter;
import com.mamunsproject.social_mediaappbeutifull.Model.Friend_model;
import com.mamunsproject.social_mediaappbeutifull.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Friend_model> list;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);


        recyclerView=view.findViewById(R.id.friendRv);
        list=new ArrayList<>();

        list.add(new Friend_model(R.drawable.profile1));
        list.add(new Friend_model(R.drawable.cover));
        list.add(new Friend_model(R.drawable.profile));
        list.add(new Friend_model(R.drawable.profile));


        FriendAdapter adapter=new FriendAdapter(list,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(adapter);



        return  view;
    }
}