package com.example.mysdktest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X","WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();
        getSupportFragmentManager().beginTransaction().add(R.id.main_fragment_content, new Cards()).commit();
        view = getWindow().getDecorView().getRootView();
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Log.d("Global", "onGlobalLayout");
                long start = System.currentTimeMillis();
                iterHierarchy();
                long end = System.currentTimeMillis();
                Log.d("Global", "----------------");
                Log.d("Global", "total time iter: " + (end - start));
                start = System.currentTimeMillis();
                addListenersToViewHierarchy();
                end = System.currentTimeMillis();
                Log.d("Global", "----------------");
                Log.d("Global", "total time recursion " + (end - start));
            }
        });
    }
    int count;
    private void iterHierarchy() {
        count = 0;
        ArrayList<View> views = new ArrayList<>();
        views.add(getWindow().getDecorView().getRootView());
        do {
            ViewGroup viewGroup = (ViewGroup)views.remove(0);
            count++;
            Log.d("Global", "" + count + " " + viewGroup.getClass().getSimpleName());
            for (int i =0;i< viewGroup.getChildCount(); i++) {
                View viewChild = viewGroup.getChildAt(i);
                if (viewChild instanceof ViewGroup) {
                   views.add(viewChild);
                } else {
                    count++;
                    Log.d("Global", "" + count + " " + viewChild.getClass().getSimpleName());
                }
            }
        } while (views.size() > 0);
    }

    private void addListenersToViewHierarchy() {
        count = 0;
        addListenersToViewHierarchy(view, new HashSet());
    }

    private void addListenersToViewHierarchy(View view, HashSet<View> discoverySet) {
        discoverySet.add(view);
        count++;
        Log.d("Global", "" + count + " " + view.getClass().getSimpleName());
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            if (childCount > 0) {
                for (int i =0;i< childCount; i++) {
                    View viewChild = ((ViewGroup) view).getChildAt(i);
                    if (!discoverySet.contains(viewChild)) {
                        addListenersToViewHierarchy(viewChild, discoverySet);
                    }
                }
            }
        }
    }

    private void initViewPager() {
        mTabLayout = findViewById(R.id.tab_layout_main);
        mViewPager = findViewById(R.id.main_view_pager);

        List<String> titles = new ArrayList<>();
        titles.add("first");
        titles.add("second");
        titles.add("third");

        //Add texts to the tab view
//        titles.add(null);
//        titles.add(null);
//        titles.add(null);
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(2)));

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Widgets());
        fragments.add(new F2());
        fragments.add(new F3());

        mViewPager.setOffscreenPageLimit(1);

        FragmentAdapter mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        mViewPager.setAdapter(mFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("DavidTest", "Selected tab is " + tab.getText());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
