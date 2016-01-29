package com.softdesign.school;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softdesign.school.utils.Lg;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lg.e(this.getLocalClassName(), "onCreate");
    }

    @Override
    protected void onStart() {
         super.onStart();
        Lg.e(this.getLocalClassName(), "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Lg.e(this.getLocalClassName(),"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Lg.e(this.getLocalClassName(), "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Lg.e(this.getLocalClassName(), "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Lg.e(this.getLocalClassName(), "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Lg.e(this.getLocalClassName(), "onDestroy");
    }
}
