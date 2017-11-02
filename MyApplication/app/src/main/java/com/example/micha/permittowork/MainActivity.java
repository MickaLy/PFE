package com.example.micha.permittowork;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initNavigationView();

    }

    /**
     * Init menu
     */
    private void initNavigationView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        HomeFragment homeFragment = new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_main, homeFragment).commit();
    }

    @Override
    public void onBackPressed() {
        System.out.println("ouuii");
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;
        Class fragmentClass;

        if (id == R.id.home) {
            fragmentClass = HomeFragment.class;
            try {
                fragment = (HomeFragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (id == R.id.permissions) {
            fragmentClass = PermissionFragment.class;
            try {
                fragment = (PermissionFragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (id == R.id.historique) {
            fragmentClass = HistoriqueFragment.class;
            try {
                fragment = (HistoriqueFragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (id == R.id.documents) {
            fragmentClass = DocumentsFragment.class;
            try {
                fragment = (DocumentsFragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (id == R.id.materiels) {
            fragmentClass = MaterielFragment.class;
            try {
                fragment = (MaterielFragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (id == R.id.contact) {
            fragmentClass = ContactFragment.class;
            try {
                fragment = (ContactFragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_main, fragment).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
