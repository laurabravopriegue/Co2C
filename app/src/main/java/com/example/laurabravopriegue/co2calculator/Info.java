package com.example.laurabravopriegue.co2calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void volvermenu(View view)
    {
        Intent intent = new Intent(Info.this, Menu.class);
        startActivity(intent);
    }
}
