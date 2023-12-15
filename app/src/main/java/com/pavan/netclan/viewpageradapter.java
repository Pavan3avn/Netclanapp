package com.pavan.netclan;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.pavan.netclan.fragments.business;
import com.pavan.netclan.fragments.merchant;
import com.pavan.netclan.fragments.personal;

public class viewpageradapter extends FragmentStateAdapter {


    public viewpageradapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:return new business();
            case 2:return new merchant();
            default:return new personal();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
