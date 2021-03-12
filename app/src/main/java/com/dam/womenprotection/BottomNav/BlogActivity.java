package com.dam.womenprotection.BottomNav;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.dam.womenprotection.Adapter.RecyclerViewAdapter;
import com.dam.womenprotection.Javabeans.DataWomen;
import com.dam.womenprotection.Javabeans.DatosActivity;
import com.dam.womenprotection.Javabeans.Item;
import com.dam.womenprotection.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public class BlogActivity extends AppCompatActivity {

    public static final String CLAVE_DATOS = "DATOS";
    SwipeRefreshLayout swipe;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        swipe = findViewById(R.id.swipeRefresh);

        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);

        navigationView.setSelectedItemId(R.id.Advert);

        navigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.Profile:
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Maps:
                    startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Help:
                    startActivity(new Intent(getApplicationContext(), HelpActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

            }
            return false;
        });


        rv = findViewById(R.id.rvListado);


        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));


        final DataWomen datos = new DataWomen();
        RecyclerViewAdapter ad = new RecyclerViewAdapter(datos.getDatos());
        ad.setListener(v -> {
            int i = rv.indexOfChild(v);
            Item elemento = datos.getDatos().get(i);

            Intent intentDatos = new Intent(getApplicationContext(), DatosActivity.class);
            intentDatos.putExtra(CLAVE_DATOS,elemento);
            startActivity(intentDatos);
        });
        rv.setAdapter(ad);

        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                rv.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipe.setRefreshing(false);

                    }
                },4000);

                getSB(swipe).show();
            }
        });

    }

    private Snackbar getSB(View v){
        return Snackbar.make(v,"Página Actualizada",Snackbar.LENGTH_LONG).setAction("Deshacer", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Snack","MESSAGE");
            }
        });
    }


}