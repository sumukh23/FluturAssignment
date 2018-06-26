package com.example.hp.fluturassignment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by hp on 26-06-2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter implements ViewPager.PageTransformer {

    private CarouselActivity context;
    private FragmentManager fm;
    private float scale;

    public MyPagerAdapter(CarouselActivity context , FragmentManager fm){
        super(fm);
        this.fm = fm;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        position = position % CarouselActivity.PAGES;
        return MyFragment.newInstance(context, position, scale);
    }

    @Override
    public int getCount() {
        return CarouselActivity.PAGES * CarouselActivity.LOOPS;
    }

    @Override
    public void transformPage(View page, float position) {
    }
}
