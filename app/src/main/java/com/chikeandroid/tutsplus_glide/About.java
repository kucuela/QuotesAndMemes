package com.chikeandroid.tutsplus_glide;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class About extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }



    public void about2 (View view) {

        Intent intent1 = new Intent(this, About.class);
        startActivity(intent1);
        finish();

    }

    public void quotes2 (View view) {

        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);

    }

    public void memes2 (View view) {

        Intent intent1 = new Intent(this, SpaceGalleryActivity.class);
        startActivity(intent1);


    }


}



