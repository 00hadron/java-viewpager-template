package ru.hadron.java_viewpager_template;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

class VPAdapter extends FragmentPagerAdapter {

private List<Fragment> pages = new ArrayList<>();

    private static String TAG = PageFragment.class.getSimpleName();

    public VPAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        Log.e(TAG, "VPAdapter конструктор");
    }

    public void setPages(List<Fragment> pages) {
        this.pages = pages;
        notifyDataSetChanged();
        Log.e(TAG, " setPages");
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Log.e(TAG, "getItem " + position);
        return this.pages.get(position);
    }

    @Override
    public int getCount() {
        Log.e(TAG, "getCount " + pages.size());
        return this.pages.size();
    }
}
