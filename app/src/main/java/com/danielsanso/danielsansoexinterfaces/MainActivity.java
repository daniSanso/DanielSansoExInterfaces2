package com.danielsanso.danielsansoexinterfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{
    ImageView img;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img=(ImageView)findViewById(R.id.idimagen);
        text=(TextView) findViewById(R.id.Slash);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        text.startAnimation(anim);
        anim.setAnimationListener(this);


    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent= new Intent(this,loginActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    }

