package com.salarioza.salarioza_quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is);
    }
    public void GoToMain (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void GoToCS (View view) {
        Intent intent = new Intent(this, CS.class);
        startActivity(intent);
    }
    public void GoToIT (View view) {
        Intent intent = new Intent(this, IT.class);
        startActivity(intent);
    }
}
