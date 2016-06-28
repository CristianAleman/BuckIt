package com.mybucketlist.buckit.bean;

import android.support.v4.app.Fragment;

/**
 * Created by Sirc on 6/26/2016.
 */
public class TabItem {
    private String title;
    private Class fragmentClass;

    public TabItem(String title, Class fragmentClass) {
        this.title = title;
        this.fragmentClass = fragmentClass;
    }

    public Fragment getFragment(){
        try {
            return (Fragment) fragmentClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class getFragmentClass() {
        return fragmentClass;
    }

    public void setFragmentClass(Class fragmentClass) {
        this.fragmentClass = fragmentClass;
    }

}

