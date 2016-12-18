package com.example.kemooo.exproject;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class Third_layout extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    static int currentpage = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentpage = position;

            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });

            pageSwitcher(3);



    }


    Timer timer;
    int page = 0;

    public void pageSwitcher(int seconds) {
        timer = new Timer(); // At this line a new Thread will be created
        timer.scheduleAtFixedRate(new RemindTask(), 0, seconds * 1000); // delay
        // in
        // milliseconds
    }

    // this is an inner class...
    class RemindTask extends TimerTask {

        @Override
        public void run() {

            // As the TimerTask run on a seprate thread from UI thread we have
            // to call runOnUiThread to do work on UI thread.
            runOnUiThread(new Runnable() {
                public void run() {

                    if (page > second_layout.kemo.length) { // In my case the number of pages are 5
                        timer.cancel();
                        // Showing a toast for just testing purpose
                        Toast.makeText(getApplicationContext(), "Timer stoped",
                                Toast.LENGTH_LONG).show();



                    } else {
                        viewPager.setCurrentItem(page++);
                    }
                }
            });

        }

    }
}
