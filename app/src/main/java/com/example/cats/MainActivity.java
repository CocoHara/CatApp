package com.example.cats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    List<String> cats = new ArrayList<String>();
    private int imageIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cats.add("cat1");
        cats.add("cat2");
        cats.add("cat3");
        cats.add("cat4");
        cats.add("cat5");

        ImageView catImage = (ImageView) findViewById(R.id.catImage);

        int imageResource = getResources().getIdentifier("@drawable/"+cats.get(0), null, this.getPackageName());
        catImage.setImageResource(imageResource);
    }

    public void nextImage(View view)
    {
        imageIndex++;
        ImageView catImage = (ImageView) findViewById(R.id.catImage);

        if (imageIndex < cats.size()) {
            int imageResource = getResources().getIdentifier("@drawable/"+cats.get(imageIndex), null, this.getPackageName());
            catImage.setImageResource(imageResource);
        }
        else {
            imageIndex = 0;
            int imageResource = getResources().getIdentifier("@drawable/"+cats.get(imageIndex), null, this.getPackageName());
            catImage.setImageResource(imageResource);
        }
    }

    public void previousImage(View view)
    {
        imageIndex--;
        ImageView catImage = (ImageView) findViewById(R.id.catImage);

        if (imageIndex > 0) {
            int imageResource = getResources().getIdentifier("@drawable/"+cats.get(imageIndex), null, this.getPackageName());
            catImage.setImageResource(imageResource);
        }
        else {
            imageIndex = 0;
            int imageResource = getResources().getIdentifier("@drawable/"+cats.get(imageIndex), null, this.getPackageName());
            catImage.setImageResource(imageResource);
        }
    }

    public void exitApp (View view)
    {
        finish();
        System.exit(0);
    }
}
