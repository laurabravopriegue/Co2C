package com.example.laurabravopriegue.co2calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void infoboton(View view)
    {
        Intent intent = new Intent(Menu.this, Info.class);
        startActivity(intent);
    }

    public void viajeboton(View view)
    {
        Intent intent = new Intent(Menu.this, Tuviaje.class);
        startActivity(intent);
    }


}
