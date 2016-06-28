package com.mybucketlist.buckit;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.mybucketlist.buckit.adapter.TabAdapter;
import com.mybucketlist.buckit.bean.TabItem;
import com.mybucketlist.buckit.extra.TabLayout;
import com.mybucketlist.buckit.fragments.Home;
import com.mybucketlist.buckit.fragments.Profile;

import java.util.ArrayList;

/**
 * Created by Sirc on 6/26/2016.
 */
public class MainActivity extends AppCompatActivity {
    private TabLayout tab_Layout;
    private ViewPager view_Pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<TabItem> mainMenuItems = new ArrayList<>();
        mainMenuItems.add(new TabItem("Home", Home.class));
        mainMenuItems.add(new TabItem("Profile", Profile.class));

        tab_Layout = (TabLayout) findViewById(R.id.TabLayout);
        view_Pager = (ViewPager) findViewById(R.id.viewPager);

        view_Pager.setAdapter(new TabAdapter(getSupportFragmentManager(), mainMenuItems));
        tab_Layout.setDistributeEvenly(true);
        tab_Layout.setViewPager(view_Pager);


    }

}


