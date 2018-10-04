package com.example.android.navexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class AboutUs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        final ArrayList<AboutUsFlavor> wa = new ArrayList<AboutUsFlavor>();
        wa.add(new AboutUsFlavor("Devzani Roy", "Co-Founder", R.drawable.dapu));
        wa.add(new AboutUsFlavor("Rafiqul Haque Robin", "Co-Founder", R.drawable.rvai));
        wa.add(new AboutUsFlavor("Shariyar Kabir Shohag", "Co-Founder", R.drawable.svai));
        wa.add(new AboutUsFlavor("Shayekh", "Android", R.drawable.shayekh));
        wa.add(new AboutUsFlavor("Shakib", "Android", R.drawable.shakib));
        wa.add(new AboutUsFlavor("Rimon", "Graphic", R.drawable.rimon));
        wa.add(new AboutUsFlavor("Mahee", "Graphic", R.drawable.mahee));
        wa.add(new AboutUsFlavor("Shishir", "Web", R.drawable.shishir));
        wa.add(new AboutUsFlavor("Maruf", "Web", R.drawable.maruf));
        wa.add(new AboutUsFlavor("Dipa", "Web", R.drawable.dipa));
        wa.add(new AboutUsFlavor("Tania", "Web", R.drawable.tania));
        wa.add(new AboutUsFlavor("Bijoy", "Web", R.drawable.bijoy));
        wa.add(new AboutUsFlavor("Rafi", "Web", R.drawable.rafi));
        AboutUsAdapter eadapter = new AboutUsAdapter(this, wa);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(eadapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
