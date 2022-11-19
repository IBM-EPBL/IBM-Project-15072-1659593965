package com.example.kaapalan;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class loginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;

    public loginAdapter(FragmentManager fm, Context context,int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;

    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                loginfrag loginfrag = new loginfrag();
                return loginfrag;
            case 1:
                signupfrag signupfrag = new signupfrag();
                return signupfrag;
            default:
                return null;

        }
    }
}
