package com.example.cozmohdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class Activity_Productivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__productivity);

        ViewPager2 viewPager = findViewById(R.id.view_pager2);
        viewPager.setAdapter(createCardAdapter());
    }
    private ViewPagerAdapter2 createCardAdapter() {
        ViewPagerAdapter2 adapter = new ViewPagerAdapter2(this);
        return adapter;
    }
}