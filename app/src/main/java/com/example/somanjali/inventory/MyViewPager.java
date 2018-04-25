package com.example.somanjali.inventory;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyViewPager extends FragmentStatePagerAdapter {
    public MyViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position==0){
            return new Entry();
        }else if(position==1){
            return new Search();
        }else {
            return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0){
            return "entry";
        }else if(position==1){
            return  "search";
        }else{
            return null;
        }
    }

    @Override

    public int getCount() {
        return 2;
    }
}
