package com.mamunsproject.social_mediaappbeutifull.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mamunsproject.social_mediaappbeutifull.Adapter.DeshboardAdapter;
import com.mamunsproject.social_mediaappbeutifull.Adapter.StoryAdapter;
import com.mamunsproject.social_mediaappbeutifull.Model.DashBoardModel;
import com.mamunsproject.social_mediaappbeutifull.Model.Story_Model;
import com.mamunsproject.social_mediaappbeutifull.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    RecyclerView storyRV,dashBoardRV;
    ArrayList<Story_Model> list;
    ArrayList<DashBoardModel> dashBoardList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);


        storyRV=view.findViewById(R.id.story_rv);
        list=new ArrayList<>();
        storyRV.setHasFixedSize(true);
        storyRV.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        storyRV.setNestedScrollingEnabled(false);


        list.add(new Story_Model(R.drawable.dennis,R.drawable.ic_video_camera,R.drawable.deaf,"Mamun"));
        list.add(new Story_Model(R.drawable.nature_dordogne,R.drawable.ic_live,R.drawable.deaf,"Mamun"));

        list.add(new Story_Model(R.drawable.dennis,R.drawable.ic_video_camera,R.drawable.deaf,"Mamun"));
        list.add(new Story_Model(R.drawable.nature_dordogne,R.drawable.ic_live,R.drawable.deaf,"Mamun"));


        StoryAdapter adapter=new StoryAdapter(list,getContext());
        storyRV.setAdapter(adapter);



        dashBoardRV=view.findViewById(R.id.deshboard_rv);

        dashBoardList=new ArrayList<>();
        dashBoardList.add(new DashBoardModel(R.drawable.profile,R.drawable.new_hope,R.drawable.saved,"Yasin Ahmed","Traveler","340","12","34"));
        dashBoardList.add(new DashBoardModel(R.drawable.profile,R.drawable.new_hope,R.drawable.saved,"Yasin Ahmed","Traveler","340","12","34"));
        dashBoardList.add(new DashBoardModel(R.drawable.profile,R.drawable.new_hope,R.drawable.saved,"Yasin Ahmed","Traveler","340","12","34"));
        dashBoardList.add(new DashBoardModel(R.drawable.profile,R.drawable.new_hope,R.drawable.saved,"Yasin Ahmed","Traveler","340","12","34"));
        dashBoardList.add(new DashBoardModel(R.drawable.profile,R.drawable.new_hope,R.drawable.saved,"Yasin Ahmed","Traveler","340","12","34"));

        DeshboardAdapter deshboardAdapter=new DeshboardAdapter(dashBoardList,getContext());
        dashBoardRV.setHasFixedSize(true);
        dashBoardRV.setLayoutManager(new LinearLayoutManager(getContext()));
        dashBoardRV.setNestedScrollingEnabled(false);
        dashBoardRV.setAdapter(deshboardAdapter);



        return view;
    }
}