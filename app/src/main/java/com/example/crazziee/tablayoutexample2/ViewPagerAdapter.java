package com.example.crazziee.tablayoutexample2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Crazziee on 11/24/2017.
 */

public class ViewPagerAdapter<M extends RecyclerView.ViewHolder> extends FragmentPagerAdapter  {

    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTItles = new ArrayList<>();







    public void addFragments(Fragment fragment,String titles){
        this.fragments.add(fragment);
        this.tabTItles.add(titles);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {

//        Fragment fragment = new Fragment();
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTItles.get(position);
    }
}
