package com.dam.womenprotection.Javabeans;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.dam.womenprotection.BottomNav.BlogActivity;
import com.dam.womenprotection.R;


public class DatosActivity extends AppCompatActivity {

    ImageView iv;
    TextView tvTit;
    TextView tvDes;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        iv = findViewById(R.id.ivDatos);
        tvTit = findViewById(R.id.tvTituloD);
        tvDes = findViewById(R.id.tvDescripcionD);

        Item elem = getIntent().getParcelableExtra(BlogActivity.CLAVE_DATOS);

        iv.setImageResource(elem.getIdImagen());
        tvTit.setText(elem.getTitulo());
        tvDes.setText(elem.getDecription());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_appbar,menu);

        return true;
    }

}