package com.example.android.navexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();
        navigationView=(NavigationView)findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(this);
        /*navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    /*case R.id.nav_home:
                        Toast.makeText(MainActivity.this,"Clicked Home",Toast.LENGTH_SHORT).show();
                        break;*/
                   /* case R.id.nav_map:
                        Uri gmmIntentUri = Uri.parse("geo:23.8498022,90.2562023");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);

                        }
                        break;
                    case R.id.nav_about:
                        Intent intent=new Intent(MainActivity.this,AboutUs.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_home:
                        Intent i=new Intent(MainActivity.this,Home.class);
                        break;


                }
                return false;
            }
        });*/
        int images[]={R.drawable.cli1,R.drawable.cli2,R.drawable.cli3};
        viewFlipper=findViewById(R.id.vmain);
        for(int image:images)
        {
            flipperImages(image);
        }

    }
    private void setUpToolbar()
    {
        drawerLayout=(DrawerLayout)findViewById(R.id.drawerlayout);
        //toolbar=(Toolbar)findViewById(R.id.toolbaar);
        //setSupportActionBar(toolbar);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }
    public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        //animation
        viewFlipper.setInAnimation(this,android.R.anim.fade_in);
        viewFlipper.setOutAnimation(this,android.R.anim.fade_out);

    }
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action

            //drawerLayout=(DrawerLayout)findViewById(R.id.drawerlayout);
            //drawerLayout.closeDrawer();
            DrawerLayout mDrawerLayout;
            mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
            mDrawerLayout.closeDrawers();
            //Intent i=new Intent(MainActivity.this,Home.class);
            //startActivity(i);

        }
        else if (id == R.id.nav_map) {
            Uri gmmIntentUri = Uri.parse("geo:23.8490797,90.2575516");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }


            }
            else if (id == R.id.nav_about) {
            Intent intent=new Intent(MainActivity.this,AboutUs.class);
            startActivity(intent);

        }
        else if(id==R.id.nav_follow)
        {
            Intent intent=new Intent(MainActivity.this,Follow.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_contact)
        {
            String phone = "01715-662221";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
        else if(id==R.id.nav_project)
        {
            Intent intent=new Intent(MainActivity.this,OurProject.class);
            startActivity(intent);
        }

         drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
