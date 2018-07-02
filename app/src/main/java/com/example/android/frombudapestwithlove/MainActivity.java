package com.example.android.frombudapestwithlove;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Finding the view pager (swipeable between fragments)
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Creating adapter managing fragments
        CategoryFragmentPagerAdapter adapter = new CategoryFragmentPagerAdapter(getSupportFragmentManager());

        // Setting adapter onto view pager
        viewPager.setAdapter(adapter);

        // Giving ViewPager to TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
