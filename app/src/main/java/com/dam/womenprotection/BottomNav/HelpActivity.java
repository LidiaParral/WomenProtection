package com.dam.womenprotection.BottomNav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dam.womenprotection.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);

        navigationView.setSelectedItemId(R.id.Help);

        navigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.Advert:
                    startActivity(new Intent(getApplicationContext(), BlogActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Maps:
                    startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Profile:
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

            }
            return false;
        });
    }

    public void abrirWeb(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://violenciagenero.igualdad.gob.es/"));

        if (i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        } else {
            Toast.makeText(this, R.string.no_activity, Toast. LENGTH_LONG ).show();
        }

    }

    public void tlfMadrid(View view) {

        Uri telf = Uri.parse("tel:012");

        Intent llamada = new Intent(Intent.ACTION_DIAL,telf);

        if (llamada.resolveActivity(getPackageManager()) != null){
            startActivity(llamada);
        } else {
            Toast.makeText(this, R.string.no_activity, Toast. LENGTH_LONG ).show();
        }
    }

    public void tlfVG(View view) {
        Uri telf = Uri.parse("tel:016");

        Intent llamada = new Intent(Intent.ACTION_DIAL,telf);

        if (llamada.resolveActivity(getPackageManager()) != null){
            startActivity(llamada);
        } else {
            Toast.makeText(this, R.string.no_activity, Toast. LENGTH_LONG ).show();
        }
    }

    public void tlfEmergency(View view) {
        Uri telf = Uri.parse("tel:112");

        Intent llamada = new Intent(Intent.ACTION_DIAL,telf);

        if (llamada.resolveActivity(getPackageManager()) != null){
            startActivity(llamada);
        } else {
            Toast.makeText(this, R.string.no_activity, Toast. LENGTH_LONG ).show();
        }
    }
}