package com.mybucketlist.buckit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mybucketlist.buckit.R;
import com.mybucketlist.buckit.adapter.TabAdapter;
import com.mybucketlist.buckit.bean.TabItem;
import com.mybucketlist.buckit.extra.TabLayout;

import java.util.ArrayList;

/**
 * Created by Sirc on 6/27/2016.
 */
public class Home extends Fragment {

    private TabLayout slidingTabLayout;
    private ViewPager viewPager;
    private ArrayList<TabItem> items;

    public Home() {
        items = new ArrayList<>();
        items.add(new TabItem("Home", HomeFragment.class));
        items.add(new TabItem("Viaje", ViajeFragment.class));
        items.add(new TabItem("Comida", ComidaFragment.class));
        items.add(new TabItem("Eventos", EventosFragment.class));
        items.add(new TabItem("Deportes", DeportesFragment.class));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);

        slidingTabLayout = (TabLayout) view.findViewById(R.id.f1slidingTabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.f1viewPager);

        viewPager.setAdapter(new TabAdapter(getChildFragmentManager(), items));
        slidingTabLayout.setViewPager(viewPager);

        return view;
    }


}
