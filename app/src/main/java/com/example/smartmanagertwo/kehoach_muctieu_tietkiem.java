package com.example.smartmanagertwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.muctieutietkiem.packages.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class kehoach_muctieu_tietkiem extends AppCompatActivity {
    TabLayout tab_muctieu;
    ViewPager vp_muctieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kehoach_muctieu_tietkiem);
        LinkViews();
    }

    private void LinkViews() {
        tab_muctieu=findViewById(R.id.tab_muctieu);
        vp_muctieu=findViewById(R.id.vp_muctieu);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vp_muctieu.setAdapter(viewPagerAdapter);
        tab_muctieu.setupWithViewPager(vp_muctieu);
    }
}