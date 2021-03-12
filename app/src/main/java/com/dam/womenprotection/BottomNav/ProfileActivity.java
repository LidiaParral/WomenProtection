package com.dam.womenprotection.BottomNav;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.dam.womenprotection.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imgProfile;
    Button btnActualizar;
    LinearLayout llProfile;
    TextView tvProfile;
    Button btnArrow;
    CardView cdProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Registrar los controles del menu contextual
        imgProfile = findViewById(R.id.imgProfile);

        //AlertDialog
        btnActualizar = findViewById(R.id.btnActualizar);

        llProfile = findViewById(R.id.llDatos);
        cdProfile = findViewById(R.id.cdProfile);
        tvProfile = findViewById(R.id.tvDatos);
        btnArrow = findViewById(R.id.btnArrow);


        registerForContextMenu(imgProfile);

        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);

        navigationView.setSelectedItemId(R.id.Profile);

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


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        int id = v.getId();
        MenuInflater inflater = getMenuInflater();

        switch (id){
            case R.id.imgProfile:

                inflater.inflate(R.menu.menu_contextual,menu);
                break;
        }

    }

    public void actualizar(View view) {
        AlertDialog.Builder ad = new AlertDialog.Builder(ProfileActivity.this);
        ad.setMessage("¿Quieres actualizar los datos del perfil?")
                .setCancelable(true)
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getSB(view).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog titulo = ad.create();
        titulo.setTitle("Actualizar");
        titulo.show();

    }

    private Snackbar getSB(View view) {
        return Snackbar.make(view,"Los datos se han actualizado",Snackbar.LENGTH_LONG).setAction("Deshacer", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Snack","MESSAGE");
            }
        });
    }

    public void datos(View view) {
        if(llProfile.getVisibility() == View.GONE){
            TransitionManager.beginDelayedTransition(cdProfile, new AutoTransition());
            llProfile.setVisibility(View.VISIBLE);
        } else {
            TransitionManager.beginDelayedTransition(cdProfile, new AutoTransition());
            llProfile.setVisibility(View.GONE);
        }
    }
}