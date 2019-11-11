package com.dev7.testbotnav;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.dev7.testbotnav.fragment.AkunFragment;
import com.dev7.testbotnav.fragment.FavoritFragment;
import com.dev7.testbotnav.fragment.HomeFragment;
import com.dev7.testbotnav.fragment.KeranjangFragment;
import com.dev7.testbotnav.fragment.TransaksiFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    /*private Button button;*/
    private BottomBar bottomBar;
    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     /*   findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrefManager prefManager = new PrefManager(getApplicationContext());
                prefManager.setFirstTimeLaunch(true);
                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                finish();
            }
        });*/
        setSupportActionBar(toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        if(toolbarText!=null && toolbar!=null) {
            toolbarText.setText(getTitle());
            setSupportActionBar(toolbar);
            Typeface typeface = Typeface.createFromAsset(getAssets(), "font/jw.TTF");
            TextView textView = (TextView) findViewById(R.id.toolbar_text);
            textView.setTypeface(typeface);
        }

        bottomBar = (BottomBar)findViewById(R.id.bottombar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            Fragment fragment = null;
            @Override
            public void onTabSelected(@IdRes int tabId) {

                if (tabId == R.id.tab_home){
                    fragment = new HomeFragment();
                }else if (tabId == R.id.tab_favorit){
                    fragment = new FavoritFragment();
                }else if (tabId == R.id.tab_keranjang){
                    fragment = new KeranjangFragment();
                }else if (tabId == R.id.tab_transaksi){
                    fragment = new TransaksiFragment();
                }else if (tabId == R.id.tab_akun){
                    fragment = new AkunFragment();
                }
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content,fragment)
                        .commit();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}
