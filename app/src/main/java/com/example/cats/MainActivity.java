package com.example.cats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayImages();
    }

    private void displayImages()
    {
        for (int i=0; i<6; i++) {
            String imageID = "catImage" + (i + 1);
            int catImageID = getResources().getIdentifier(imageID, "id", getPackageName());
            ImageView catImage = (ImageView) findViewById(catImageID);

            String drawableCatImage = "@drawable/cat" + (i + 1);
            int imageResource = getResources().getIdentifier(drawableCatImage, null, this.getPackageName());
            catImage.setImageResource(imageResource);
            catImage.setContentDescription(Integer.toString(i));
        }
    }

    public void imageClick (View view)
    {
        Intent intent = new Intent (this, IndividualImageActivity.class);
        String message = view.getContentDescription().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void exitApp (View view)
    {
        finish();
        System.exit(0);
    }
}
