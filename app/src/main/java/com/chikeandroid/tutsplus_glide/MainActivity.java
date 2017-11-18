package com.chikeandroid.tutsplus_glide;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;



import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.github.javiersantos.materialstyleddialogs.enums.Style;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Enables ActionBar app icon to behave as action to toggle NavigationDrawer
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
            actionBar.setHomeButtonEnabled(false);
            getSupportActionBar().setDisplayShowTitleEnabled( true );


            actionBar.show();

        }





    }

    // Method(s) that manage Toolbar.

    // onCreateOptionsMenu method initialize the contents of the Activity's Toolbar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // onOptionsItemSelected method is called whenever an item in the Toolbar is selected.


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



        if (id == R.id.action_createx) {


            Intent intent1 = new Intent(this, About.class);
            startActivity(intent1);


            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    //KLIK METODE ZA SHARE KARTICA SA CITATIMA

    // Called when btnOpen is clicked
    public void neunosimo (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "NEUNOSIMO POZZ?");
        startActivity(intent);


    }

    public void disciplinovan (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "OVO JE NJEMAČKA KVALITETA! \nNIJE TO ONO SRANJE ŠTO " +
                "KINEZI PRAVE! \nALO BRE! \nNJEMAČKA KVALITETA! \nNIKAD MI SE NIKO NIJE ŽALIO NA ROBU!");
        startActivity(intent);
    }

    public void razguli (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "VISIO BI TI MENI NA BANDERI!");
        startActivity(intent);
    }

    public void kapija (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "OVO JE SRPSKA KUĆA!ALO! \nNEĆE MI ON OVDE KLANJATI! " +
                "\nNIJE OVO DŽAMIJA! \nJEBO MAJKU SVOJU BRADATU! \nSRPSKA KUĆA,BRE!");
        startActivity(intent);
    }

    public void sc (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "ŠTO OVO MALO NE OČISTITE? \nREĆU JA BRANKU! \nOVAJ MALI TAKILO " +
                "NEĆE NIŠTA DA ČISTI! \nILI NEK PLATI ŽENU 20 OJRA! \nILI KAPIJA!");
        startActivity(intent);
    }

    public void hey (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "ZAPAMTIĆEŠ SINOĆNU VEČE \nPORIJEKLO TI JEBEM \nZAPAMTIĆEŠ SRBINA" +
                " \nIZ REPUBLIKE SPRSKE! \nMIRA NIJE SAMA \nNI REPA BEZ KORENA \nKOME ĆEŠ TI PIČKU LIZAT? \nLIZAT ĆEŠ TI MOJ KURAC!!!");
        startActivity(intent);
    }

    public void zatvor (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "MIRO,IMAL PIVE?");
        startActivity(intent);
    }

    public void zapamtices (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "K  A  P  I  J  A !");
        startActivity(intent);
    }

    public void alo (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "ALO! \n\nA\nL\nO \n\nA L O !");
        startActivity(intent);
    }

    public void branko (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "ŠTO MI SE BRANKO NE JAVLJA?");
        startActivity(intent);
    }

    public void jasam (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "JA SAM TI SE \nZATVORA NALEŽO \nPIČKI NAJEBO \nI ŽIVOTA NAŽIVEO!");
        startActivity(intent);
    }

    public void zakljucaj (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "JA SAM TI DISCIPLINOVAN!");
        startActivity(intent);
    }

    public void nared (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, ":GROK: \nDOĆEŠ I TI NARED!");
        startActivity(intent);
    }

    public void komsinica (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, ":GROK: \nMORAM IZJEBATI OVU KOMŠINICU!");
        startActivity(intent);
    }

    public void sinoc (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, ":GROK: \nJOJ ŠTO SAM SINOĆ JEBO JEDNU! \nUH UH! \nKAKO SAM JE ODRO!");
        startActivity(intent);
    }

    public void masina (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, ":GROK: \nMOGU JEBATI SATIMA KO MAŠINA \n:GROK: \n:GROK: \nOSAM SATI BEZ PAUZE!");
        startActivity(intent);
    }

    public void muslimanke (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, ":GROK: \nJOJ ŠTO VOLIM DA JEBEM MUSLIMANKE \nTAKO IM SE SVETIM!");
        startActivity(intent);
    }

    public void krmece (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, ":GROK: \nIMA PIČKU KO KRMEĆE OKO!");
        startActivity(intent);
    }

    public void hrvati (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "BRANKO MANI SE HRVATA!");
        startActivity(intent);
    }

    public void imela (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "MUŠTERIJE MI ŠALJU IMELA \nNA KUPUJEM PRODAJEM!\nIMELA!");
        startActivity(intent);
    }

    public void musterija (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "KAD ODE MUŠTERIJA MOŠ JE JEBAT!");
        startActivity(intent);
    }

    public void vrat (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "PRESKOČIM OGRADU \nI U LETU GA ZGRABIM \nZUBIMA ZA VRAT!");
        startActivity(intent);
    }

    public void fruska (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "STAVIM GA U KOLA \nODVEDEM NA FRUŠKU GORU \nVEŽEM GA ZA DRVO \nI NE PUŠTAM DOK NE VRATI PARE!");
        startActivity(intent);
    }

    public void pastete (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "MINIRAO SAM CELO DVORIŠTE PAŠTETAMA! \nSVUDA SU NAGAZNE MINE! \nALI NISU STRAŠNE \nSAMO TI STOPALO OTKINU!");
        startActivity(intent);
    }

    public void brat (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "JA SAM BRE ROĐENOM BRATU \nUVEO ZABRANU 10 GODINA \nDA MI OVDE DOLAZI!");
        startActivity(intent);
    }

    public void about (View view) {

        Intent intent1 = new Intent(this, About.class);
        startActivity(intent1);

    }

    public void quotes (View view) {


    }

    public void memes (View view) {

        Intent intent1 = new Intent(this, SpaceGalleryActivity.class);
        startActivity(intent1);
        finish();

    }




}
