package com.example.android.tflitecamerademo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class main extends Activity {
private TextView textView;
private ImageView imageView2;
private int mShortAnimationDuration;
CameraActivity cameraActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("main","i am in");
        imageView2=findViewById(R.id.imageView2);
       // textView=findViewById(R.id.textView);
//        imageView=findViewById(R.id.imageView);
      //  imageView.setVisibility(imageView.GONE);
        mShortAnimationDuration = getResources().getInteger(
                android.R.integer.config_shortAnimTime);
//crossfade();

    }

    public  void  crossfade(){
      //  ObjectAnimator animatex=new ObjectAnimator().ofFloat(imageView2,"x",280f);
        //animatex.setDuration(1000);
        ObjectAnimator fade=new ObjectAnimator().ofFloat(imageView2,View.ALPHA,0.0f,1.0f);
        fade.setDuration(1300);
ObjectAnimator zoomy=new ObjectAnimator().ofFloat(imageView2,"scaleY",1.7f).setDuration(1100);
      ObjectAnimator zoomx=new ObjectAnimator().ofFloat(imageView2,"scaleX",2.2f).setDuration(1500);
        AnimatorSet animatorSet=new AnimatorSet();
        animatorSet.playTogether(zoomy,fade,zoomx);
        animatorSet.start();

        animatorSet.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
//cameraActivity=new CameraActivity();

            }

            @Override
            public void onAnimationEnd(Animator animation) {
               startme();
            }

            @Override
            public void onAnimationCancel(Animator animation) {
animation.start();
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
animation.start();
            }
        });

    }


public void startme(){
    Intent intent =new Intent(this,CameraActivity.class);
    startActivity(intent);
}

    @Override
    protected void onStart() {
        super.onStart();
        crossfade();

    }
}
