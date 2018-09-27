package com.example.android.tflitecamerademo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class main extends Activity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("main","i am in");
        textView=findViewById(R.id.textView);

    }

    @Override
    protected void onStart() {
        super.onStart();
     //   Intent intent =new Intent(this,CameraActivity.class);
  //      startActivity(intent);
    }
}
