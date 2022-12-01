package com.example.puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity implements View.OnClickListener {

    Button b[] = new Button[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        for (int i = 0; i < b.length; i++) {
            int id = getResources().getIdentifier("b"+i,"id",getPackageName());
            b[i] = findViewById(id);
            b[i].setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {

    }
}