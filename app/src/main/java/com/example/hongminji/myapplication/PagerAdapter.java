package com.example.hongminji.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter{
    private static int PAGE_NUMBER = 4;
    public PagerAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return BlankFragment.newInstance();
            case 1:
                return BlankFragment2.newInstance();
            case 2:
                return BlankFragment3.newInstance();
            case 3:
                return BlankFragment4.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "일정작성";
            case 1:
                return "일정공유";
            case 2:
                return "개인맞춤형";
            case 3:
                return "마이페이지";
            default:
                return null;
        }
    }
}
