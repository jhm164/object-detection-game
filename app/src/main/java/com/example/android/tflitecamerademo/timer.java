package com.example.android.tflitecamerademo;

import android.util.Log;

import java.util.TimerTask;

public class timer extends TimerTask {
    @Override
    public void run() {
        try {
            Thread.sleep(15000);
        }catch (Exception e){
            Log.d("timer",e.toString());
        }
    }
}
