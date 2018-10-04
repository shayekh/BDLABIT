package com.example.android.navexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class OurProject extends AppCompatActivity implements View.OnClickListener {
    CardView cardViewWeb;
    CardView cardViewAndroid;
    CardView cardViewGraphics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_project);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cardViewAndroid=(CardView) findViewById(R.id.candroid);
        cardViewWeb=(CardView) findViewById(R.id.cweb);
        cardViewGraphics=(CardView) findViewById(R.id.cgraphics);
        cardViewWeb.setOnClickListener(this);
        cardViewGraphics.setOnClickListener(this);
        cardViewAndroid.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
   if(view.getId()==R.id.cweb){
       Intent intent=new Intent(OurProject.this,Web.class);
       startActivity(intent);
   }
   else if(view.getId()==R.id.candroid){
       Intent intent=new Intent(OurProject.this,Android.class);
       startActivity(intent);
   }
   else if(view.getId()==R.id.cgraphics){
       Intent intent=new Intent(OurProject.this,Graphics.class);
       startActivity(intent);
   }


    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }*/





}
