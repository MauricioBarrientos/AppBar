package com.example.appbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    int a = 3; // comentario de prueba  a github
    int b = 4; //comentario de prueba github

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void click1(View v){
        Intent i= new Intent(this, AppBar1Activity.class);
        Toolbar t= findViewById(R.id.toolbar);
        //t.setTitle("SCROLL");
        startActivity(i);
    }
    public void click2(View v){
        Intent i= new Intent(this, AppBar2Activity.class);
        startActivity(i);
    }
    public void click3(View v){
        Intent i= new Intent(this, AppBar3Activity.class);
        startActivity(i);
    }
    public void click4(View v){
        Intent i= new Intent(this, AppBar4Activity.class);
        startActivity(i);
    }
    public void click5(View v){
        Intent i= new Intent(this, AppBar5Activity.class);
        startActivity(i);
    }
}