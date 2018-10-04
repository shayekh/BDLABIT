package com.example.android.navexample;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Follow extends AppCompatActivity implements View.OnClickListener{
    private ImageView web;
    private ImageView facebook;
    private ImageView insta;
    private ImageView mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);
        web=(ImageView)findViewById(R.id.web_img);
        insta=(ImageView)findViewById(R.id.insta_img);
        mail=(ImageView)findViewById(R.id.mail_img);
        facebook=(ImageView)findViewById(R.id.fb_img);
        web.setOnClickListener(this);
        insta.setOnClickListener(this);
        facebook.setOnClickListener(this);
        mail.setOnClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.web_img){
            String url = "http://www.bdlabit.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if (view.getId() == R.id.fb_img){
            // e.g. if your URL is https://www.facebook.com/EXAMPLE_PAGE, you should put EXAMPLE_PAGE at the end of this URL, after the ?
            String YourPageURL = "https://www.facebook.com/bdlabit/";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(YourPageURL));

            startActivity(browserIntent);


        }
        else if (view.getId() == R.id.insta_img){
            Uri uri = Uri.parse("http://instagram.com/_u/bdlabit");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.instagram.android");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/bdlabit")));
            }

        }
        else if (view.getId() == R.id.mail_img){
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:Bdlabit@gmail.com")); // only email apps should handle this
            //intent.putExtra(Intent.EXTRA_EMAIL,"Bdlabit@gmail.com");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
