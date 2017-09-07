package com.salarioza.salarioza_quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);
    }
    public void GoToMain (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void GoToIT (View view) {
        Intent intent = new Intent(this, IT.class);
        startActivity(intent);
    }
    public void GoToIS (View view) {
        Intent intent = new Intent(this, IS.class);
        startActivity(intent);
    }
}
