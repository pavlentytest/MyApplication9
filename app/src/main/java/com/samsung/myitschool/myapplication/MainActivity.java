package com.samsung.myitschool.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("RRRRRRRR","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("RRRRRRRR","onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("RRRRRRRR","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("RRRRRRRR","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("RRRRRRRR","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("RRRRRRRR","onDestroy");
    }


}
