package com.example.hongminji.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import com.example.hongminji.myapplication.R;

public class Main3Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        PagerAdapter pagerAdapter = new PagerAdapter(
                getSupportFragmentManager()
        );
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

}