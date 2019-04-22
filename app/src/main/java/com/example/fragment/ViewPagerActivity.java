package com.example.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Fragment.FirstFragment;
import Fragment.SecondFragment;
import adapter.ViewPagerAdapter;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout=findViewById(R.id.tabID);
        viewPager=findViewById(R.id.viewPager);

        ViewPagerAdapter adapter =new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FirstFragment(), "sum");
        adapter.addFragment(new SecondFragment(), "Area of Circle");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
