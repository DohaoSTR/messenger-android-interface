package com.example.messenger_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ConstraintLayout extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
    }

    public void PreviousActivityOnClick(android.view.View view)
    {
        Intent intent = new Intent(this, LinearLayout.class);
        startActivity(intent);
    }
}
