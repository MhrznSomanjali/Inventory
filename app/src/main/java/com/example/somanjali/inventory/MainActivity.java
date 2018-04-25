package com.example.somanjali.inventory;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity{
    android.support.v7.widget.Toolbar toolbar;
    ViewPager pageView;
    TabLayout tablayout;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActivity();
        initToolbar();
        setAdapter();
    }
    private void initActivity(){
        pageView=findViewById(R.id.viewPager);
        toolbar=findViewById(R.id.toolBar);
        tablayout=findViewById(R.id.tabLayout);
    }

    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Prasheel Manandhar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void setAdapter(){
        MyViewPager myViewPageAdapter=new MyViewPager(getSupportFragmentManager());
        pageView.setAdapter(myViewPageAdapter);
        tablayout.setupWithViewPager(pageView);

    }

}
