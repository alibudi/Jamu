package com.dev7.testbotnav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.dev7.testbotnav.status_fragment.Alamat;
import com.dev7.testbotnav.status_fragment.Detail;
import com.dev7.testbotnav.status_fragment.Invoice;

public class StatusActivity extends AppCompatActivity {

    private final String[] PAGE_TITLES = new String[]{
            "Status", "Detail", "Alamat"
    };

    private final Fragment[] PAGES = new Fragment[]{
            new Invoice(), new Detail(), new Alamat()
    };

    public static TabLayout tabStatus;
    public static ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        tabStatus = (TabLayout) findViewById(R.id.tabStatus);
        tabStatus.setupWithViewPager(viewPager);

        getSupportActionBar().setTitle("Detail Transaksi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public  Fragment getItem(int position) {
            return PAGES[position];
        }

        @Override
        public int getCount() {
            return PAGES.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return PAGE_TITLES[position];
        }

    }
}
