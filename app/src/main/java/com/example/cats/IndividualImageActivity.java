package com.example.cats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class IndividualImageActivity extends AppCompatActivity
{
    List<String> cats = new ArrayList<String>();
    private int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_image);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        imageIndex = Integer.parseInt(message);

        cats.add("cat1");
        cats.add("cat2");
        cats.add("cat3");
        cats.add("cat4");
        cats.add("cat5");
        cats.add("cat6");

        ImageView catImage = (ImageView) findViewById(R.id.catImage);

        int imageResource = getResources().getIdentifier("@drawable/"+cats.get(imageIndex), null, this.getPackageName());
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
