package com.mamunsproject.social_mediaappbeutifull.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.mamunsproject.social_mediaappbeutifull.Adapter.ViewPagerAdapter;
import com.mamunsproject.social_mediaappbeutifull.R;



public class NoificationFragment extends Fragment {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_noification, container, false);



        viewPager=view.findViewById(R.id.viewpagerId);
        viewPager.setAdapter(new ViewPagerAdapter(getFragmentManager()));
        tabLayout=view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);





        return view;
    }
}