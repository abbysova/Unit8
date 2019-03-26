package com.example.unit9;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("*/*");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hey Study Partner!");
                if (emailIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(emailIntent);}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//options item selected on list
        int id = item.getItemId();


        if (id == R.id.settings) {
            Intent settingsIntent = new Intent(this, SettingsActivity.class)
            startActivity(settingsIntent);
            return true;}


        if (id == R.id.nav_add){
            Snackbar.make(getWindow().getDecorView(), "Adding study mates is not implemented yet.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show();
            return true;
        }
        if (id == R.id.nav_remove) {
            Snackbar.make(getWindow().getDecorView(), "Deleting a study mates is not implemented yet.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show();
            return true;
        }
        if (id == R.id.nav_email) {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setType("*/*");
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hey Study Partner!");
            if (emailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(emailIntent);
            }
            return true;
        }
        if (id == R.id.nav_SMS) {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:2183302287")); //uri not working
            sendIntent.putExtra("smsText", "Hey Study Partner.");
            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(sendIntent);
            }
            return true;

            return super.onOptionsItemSelected(item);} //Not working
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
    //on navigation bar item selected
        int id = item.getItemId();

        if (id == R.id.settings) {
            Intent settingsIntent = new Intent(this, SettingsActivity.class)
            startActivity(settingsIntent);
            return true;}


        if (id == R.id.nav_add){
            Snackbar.make(getWindow().getDecorView(), "Adding study mates is not implemented yet.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show();
            return true;
        }
        if (id == R.id.nav_remove) {
            Snackbar.make(getWindow().getDecorView(), "Deleting a study mates is not implemented yet.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show();
            return true;
        }
        if (id == R.id.nav_email) {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setType("*/*");
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hey Study Partner!");
            if (emailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(emailIntent);
            }
            return true;
        }
        if (id == R.id.nav_SMS) {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:2183302287"));
            sendIntent.putExtra("smsText", "Hey Study Partner.");
            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(sendIntent);
            }
            return true;

        return super.onOptionsItemSelected(item);}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

}}

