package com.example.android.frombudapestwithlove;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.frombudapestwithlove.fragments.CastlesFragment;
import com.example.android.frombudapestwithlove.fragments.ChillFragment;
import com.example.android.frombudapestwithlove.fragments.EateriesFragment;
import com.example.android.frombudapestwithlove.fragments.LibrariesFragment;

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Chill", "Libraries", "Castles", "Eateries"};

    public CategoryFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ChillFragment();
        } else if (position == 1) {
            return new LibrariesFragment();
        } else if (position == 2) {
            return new CastlesFragment();
        } else {
            return new EateriesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate specific tab title
        return tabTitles[position];
    }
}
