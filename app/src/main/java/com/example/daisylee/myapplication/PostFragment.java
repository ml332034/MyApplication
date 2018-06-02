package com.example.daisylee.myapplication;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PostFragment extends Fragment {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;




    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_post, container, false);
        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);
        appBarLayout = (AppBarLayout) rootView.findViewById(R.id.appbarid);
        tabLayout = (TabLayout) rootView.findViewById(R.id.tablayout);
        setupViewPager(viewPager);
        return rootView;
    }
    private void setupViewPager(ViewPager PagerAdapter) {
        PagerAdapter adapter = new PagerAdapter(getChildFragmentManager());
        adapter.AddFragment(new schoolactivity(), "學校");
        adapter.AddFragment(new tronclass(), "Tronclass");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
