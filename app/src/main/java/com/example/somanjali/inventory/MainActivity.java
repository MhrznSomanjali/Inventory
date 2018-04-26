package com.example.somanjali.inventory;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity{
    android.support.v7.widget.Toolbar toolbar;
    ViewPager pageView;
    TabLayout tablayout;
    FrameLayout framelayout;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initActivity();
        initToolbar();
        setAdapter();

        //onBackPressed();
    }
    private void initActivity(){
        pageView=findViewById(R.id.viewPager);
        toolbar=findViewById(R.id.toolBar);
        tablayout=findViewById(R.id.tabLayout);
        framelayout=findViewById(R.id.frameFragment);
       // tablayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    @Override
    public void onBackPressed() {
    System.exit(0);
        super.onBackPressed();
    }

    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Inventory");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void setAdapter(){
        MyViewPager myViewPageAdapter=new MyViewPager(getSupportFragmentManager());
        pageView.setAdapter(myViewPageAdapter);
        tablayout.setupWithViewPager(pageView);
        //pageView.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));


    }

}
