package com.example.hp.fluturassignment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by hp on 26-06-2018.
 */

public class CarouselActivity extends FragmentActivity {

    public final static int PAGES = 5;
    public final static int LOOPS = 1000;

    public MyPagerAdapter adapter;
    public ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousel);

        pager = (ViewPager) findViewById(R.id.myviewpager);

        adapter = new MyPagerAdapter(this , this.getSupportFragmentManager());

        pager.setAdapter(adapter);
    }
}
