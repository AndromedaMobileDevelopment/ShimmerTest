package com.kerjen.exodus.learning_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class MainActivity extends AppCompatActivity {
    private ShimmerTextView shimmerTextView;
    private Shimmer shimmer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shimmerTextView = (ShimmerTextView) findViewById(R.id.shimmer);

        shimmer = new Shimmer();
        shimmer.start(shimmerTextView);

        BottomNavigationBar bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar.setActiveColor(R.color.colorPrimary).setInActiveColor("#FFFFFF").setBarBackgroundColor("#ECECEC");
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar.
                addItem(new BottomNavigationItem(R.mipmap.ic_face_white_24dp, "Profile"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher, "About"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher,"News"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher, "Fresh"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher, "Games"))
                .initialise();


    }
}
