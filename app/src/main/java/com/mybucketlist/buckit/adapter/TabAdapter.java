package com.mybucketlist.buckit.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.mybucketlist.buckit.bean.TabItem;

import java.util.ArrayList;

/**
 * Created by Sirc on 6/26/2016.
 */
public class TabAdapter extends FragmentPagerAdapter

    {

        private ArrayList<TabItem> items;

        public TabAdapter(FragmentManager fm, ArrayList<TabItem> items) {
        super(fm);
        this.items = items;
    }

        @Override
        public Fragment getItem(int position) {
        return items.get(position).getFragment();
    }

        @Override
        public int getCount() {
        return items.size();
    }

        @Override
        public CharSequence getPageTitle(int position) {
        return items.get(position).getTitle();
    }
    }
