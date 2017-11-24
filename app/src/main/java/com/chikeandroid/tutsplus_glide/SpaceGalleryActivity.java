package com.chikeandroid.tutsplus_glide;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;




public class SpaceGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        setContentView(R.layout.activity_space_gallery);

        // Enables ActionBar app icon to behave as action to toggle NavigationDrawer
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar12);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
            actionBar.setHomeButtonEnabled(false);
            getSupportActionBar().setDisplayShowTitleEnabled( true );


            actionBar.show();
        }








        /*getSupportActionBar().setDisplayShowTitleEnabled( true );
        getSupportActionBar().setTitle("Quotes & Memes");*/

        //getSupportActionBar()/* or getSupportActionBar() */.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_images);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(layoutManager);

        SpaceGalleryActivity.ImageGalleryAdapter adapter = new SpaceGalleryActivity.ImageGalleryAdapter(this, SpacePhoto.getSpacePhotos());
        recyclerView.setAdapter(adapter);



    }

    private class ImageGalleryAdapter extends RecyclerView.Adapter<ImageGalleryAdapter.MyViewHolder>  {

        @Override
        public ImageGalleryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            // Inflate the layout
            View photoView = inflater.inflate(R.layout.item_photo, parent, false);

            ImageGalleryAdapter.MyViewHolder viewHolder = new ImageGalleryAdapter.MyViewHolder(photoView);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ImageGalleryAdapter.MyViewHolder holder, int position) {

            SpacePhoto spacePhoto = mSpacePhotos[position];
            ImageView imageView = holder.mPhotoImageView;

            Glide.with(mContext)
                    .load(spacePhoto.getUrl())
                    .placeholder(R.mipmap.ic_cloud_off_red)
                    .into(imageView);
        }

        @Override
        public int getItemCount() {
            return (mSpacePhotos.length);
        }

        public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView mPhotoImageView;

            public MyViewHolder(View itemView) {

                super(itemView);
                mPhotoImageView = (ImageView) itemView.findViewById(R.id.iv_photo);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {

                int position = getAdapterPosition();
                if(position != RecyclerView.NO_POSITION) {
                    SpacePhoto spacePhoto = mSpacePhotos[position];

                    Intent intent = new Intent(mContext, SpacePhotoActivity.class);
                    intent.putExtra(SpacePhotoActivity.EXTRA_SPACE_PHOTO, spacePhoto);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    startActivity(intent);
                }
            }
        }

        private SpacePhoto[] mSpacePhotos;
        private Context mContext;

        public ImageGalleryAdapter(Context context, SpacePhoto[] spacePhotos) {
            mContext = context;
            mSpacePhotos = spacePhotos;
        }


    }

    /*public void dole(View V){

        RecyclerView sv = (RecyclerView) findViewById(R.id.rv_images);
        sv.scrollToPosition(sv.getAdapter().getItemCount() - 1);

        ButtonFloat button = (ButtonFloat) findViewById(R.id.buttonFloatt);
        button.setVisibility(View.GONE);

        ButtonFloat button1 = (ButtonFloat) findViewById(R.id.buttonFloattt);
        button1.setVisibility(View.VISIBLE);

        Toast.makeText(this, "Pali ste na dno liste.",
                Toast.LENGTH_SHORT).show();

    }

    public void gore(View V){

        RecyclerView sv = (RecyclerView) findViewById(R.id.rv_images);
        sv.scrollToPosition(sv.getAdapter().getItemCount() - 56);

        ButtonFloat button = (ButtonFloat) findViewById(R.id.buttonFloatt);
        button.setVisibility(View.VISIBLE);

        ButtonFloat button1 = (ButtonFloat) findViewById(R.id.buttonFloattt);
        button1.setVisibility(View.GONE);

        Toast.makeText(this, "Popeli ste se na vrh liste.",
                Toast.LENGTH_SHORT).show();


    }*/

    // Method(s) that manage Toolbar.

    // onCreateOptionsMenu method initialize the contents of the Activity's Toolbar.
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    // Overrides setTitle method to support older api levels
    @Override
    public void setTitle(CharSequence title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        *//*if (id == R.id.action_create) {


            *//**//*Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
            finish();*//**//*

            *//**//*Dialog dialog = new Dialog(this,"Poštovani korisnici", "Razvoj aplikacija je dug i zamoran proces i s vremena na vreme čovek mora popiti kafu," +
                    "pa bi bilo lepo sa Vaše strane da ukoliko možete pošaljete 1$ putem Paypal-a " +
                    "na rollbarbullbar@gmail.com.\n\nHvala što koristite naše aplikaciju.");
            dialog.show();*//**//*

            new MaterialStyledDialog.Builder(this)
                    .setTitle("Poštovani korisnici")
                    .setDescription("Razvoj aplikacija je dug i zamoran posao i s vremena na vreme čovek mora popiti kafu ili pojesti pljeskavicu." +
                            "\n\nUkoliko ste u mogućnosti, pošaljite 1$ ili 2$ putem Paypal-a na rollbarbullbar@gmail.com i održite ovog sirotog developera u životu.\n\nHvala unapred.\n")
                    .setIcon(R.mipmap.kafa)
                    .withDialogAnimation(true)
                    //.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_launcher))
                    .show();





            return true;
        }*//*

        if (id == R.id.action_createx) {


            *//*Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
            finish();*//*

            *//*Dialog dialog = new Dialog(this,"Poštovani korisnici", "Razvoj aplikacija je dug i zamoran proces i s vremena na vreme čovek mora popiti kafu," +
                    "pa bi bilo lepo sa Vaše strane da ukoliko možete pošaljete 1$ putem Paypal-a " +
                    "na rollbarbullbar@gmail.com.\n\nHvala što koristite naše aplikaciju.");
            dialog.show();*//*

            android.app.AlertDialog.Builder mBuilder = new android.app.AlertDialog.Builder(SpaceGalleryActivity.this);
            View mView = getLayoutInflater().inflate(R.layout.activity_about,null);



            mBuilder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            mBuilder.setView(mView);
            android.app.AlertDialog dialog = mBuilder.create();
            dialog.show();
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);





            return true;
        }



        return super.onOptionsItemSelected(item);
    }*/

    public void about1 (View view) {

        Intent intent1 = new Intent(this, About.class);
        startActivity(intent1);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

    }

    public void quotes1 (View view) {

        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();


    }

    public void memes1 (View view) {




    }

    @Override
    public void onBackPressed () {

        Intent intent1 = new Intent(this, MainActivity.class);

        startActivity(intent1);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();


    }










}
