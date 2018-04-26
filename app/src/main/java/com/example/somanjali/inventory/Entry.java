package com.example.somanjali.inventory;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class Entry extends android.support.v4.app.Fragment implements View.OnClickListener {
    Button cancelbutton,savebutton;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.entry,container,false);

       return view;


    }
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initactivity();
        setlisteners();


    }
    public void initactivity(){
        cancelbutton=getActivity().findViewById(R.id.cancelbtn);
        savebutton=getActivity().findViewById(R.id.savebtn);
    }
    public void setlisteners(){
        cancelbutton.setOnClickListener(this);
        savebutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==cancelbutton){
            System.exit(0);
        }
        else if(v==savebutton){
            //realm
        }

    }
}

