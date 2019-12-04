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
        Log.e("RRRRRRRR","onCreate");

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                Intent other = new Intent(this, Main2Activity.class);
                EditText enter = findViewById(R.id.editText);
                other.putExtra("NAME", enter.getText().toString());
                startActivity(other);
                break;
            case R.id.button2:
                String url = "https://google.com";
                Intent www = new Intent(Intent.);
                www.setData(Uri.parse(url));
                startActivity(www);
                break;
        }

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
