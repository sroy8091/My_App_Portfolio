package com.example.sroy8091.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "This");

    }
    public void popular_movies(View v){
        Toast.makeText(this, "This will open movies app", Toast.LENGTH_LONG).show();
    }

    public void stock_hawk(View v){
        Toast.makeText(this, "This will open Stock Hawk app", Toast.LENGTH_LONG).show();
    }

    public void build_it_bigger(View view){
        Toast.makeText(this, "This will open Build it Bigger app", Toast.LENGTH_LONG).show();
        Log.v("MainActivity", "This is");
    }

    public void make_your_app_material(View v){
        Toast.makeText(this, "This will open Make Your app Material app", Toast.LENGTH_LONG).show();
    }

    public void go_ubiquitous(View v){
        Toast.makeText(this, "This will open Go Ubiquitous app", Toast.LENGTH_LONG).show();
    }

    public void capstone(View v){
        Toast.makeText(this, "This will open Capstone app", Toast.LENGTH_LONG).show();
    }

}
