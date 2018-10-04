package com.example.android.navexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Web extends AppCompatActivity {
ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        int images[]={R.drawable.web1,R.drawable.project,R.drawable.web3};
        viewFlipper=findViewById(R.id.vweb);
        for(int image:images)
        {
            flipperImages(image);
        }
    }
    public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        //animation
      viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
      viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
