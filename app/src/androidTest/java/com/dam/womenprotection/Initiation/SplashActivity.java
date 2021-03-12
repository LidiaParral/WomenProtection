package com.dam.womenprotection.Initiation;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dam.womenprotection.BottomNav.HomeActivity;
import com.dam.womenprotection.R;

public class SplashActivity extends AppCompatActivity {

    TextView tvWomen;
    TextView tvPower;
    ImageView imgLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tvWomen = findViewById(R.id.tvWomen);
        tvPower = findViewById(R.id.tvPower);
        imgLogo = findViewById(R.id.iLogo);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        imgLogo.setAnimation(animation);



        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/Alegreya-BoldItalic.ttf");
        tvWomen.setTypeface(face);

        Typeface face1=Typeface.createFromAsset(getAssets(),"fonts/Comfortaa-Light.ttf");
        tvPower.setTypeface(face1);


        openApp(true);

    }

    private void openApp(boolean b) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity
                        .this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }

}