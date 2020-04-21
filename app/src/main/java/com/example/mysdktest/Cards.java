package com.example.mysdktest;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class Cards extends Fragment {


    private ViewPager mViewPager;
    private ArrayList<View> viewList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.six_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewPager = view.findViewById(R.id.fragment_view_pager);
        initViewPager();
        Log.d("DavidTest", "Cards on view created");
    }

    private void initViewPager() {

        View view1 = getLayoutInflater().inflate(R.layout.item_view_pager_1, null);
        View view2 = getLayoutInflater().inflate(R.layout.item_view_pager_2, null);
        View view3 = getLayoutInflater().inflate(R.layout.item_view_pager_3, null);
        View view4 = getLayoutInflater().inflate(R.layout.item_view_pager_4, null);

        viewList = new ArrayList<>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);
        mViewPager.setAdapter(pagerAdapter);
        mViewPager.setCurrentItem(0);
    }

    private PagerAdapter pagerAdapter = new PagerAdapter() {
        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(viewList.get(position));
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(viewList.get(position));
            return viewList.get(position);
        }
    };
}
