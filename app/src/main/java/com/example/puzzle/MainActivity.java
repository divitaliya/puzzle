package com.example.puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    ArrayList arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.a1);
        b2 = findViewById(R.id.a2);
        b3 = findViewById(R.id.a3);
        b4 = findViewById(R.id.a4);
        b5 = findViewById(R.id.a5);
        b6 = findViewById(R.id.a6);
        b7 = findViewById(R.id.a7);
        b8 = findViewById(R.id.a8);
        b9 = findViewById(R.id.a9);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

//        b1.setTextColor(getResources().getColor(android.R.color.transparent));

        int min=0;
        int max=9;
        int random;
        for(int i=0;i<9;i++)
        {
            while(true)
            {
                random=new Random().nextInt(max-min)+min;
                System.out.println("random="+random);
                if(!arrayList.contains(random))
                {
                    arrayList.add(random);
                    System.out.println(arrayList);
                    break;
                }

            }
        }
        b1.setText(arrayList.get(0).toString());
        b2.setText(arrayList.get(1).toString());
        b3.setText(arrayList.get(2).toString());
        b4.setText(arrayList.get(3).toString());
        b5.setText(arrayList.get(4).toString());
        b6.setText(arrayList.get(5).toString());
        b7.setText(arrayList.get(6).toString());
        b8.setText(arrayList.get(7).toString());
        b9.setText(arrayList.get(8).toString());

        if(arrayList.get(0).toString().equals("0"))
        {
            b1.setTextColor(getResources().getColor(android.R.color.transparent));
        }
        if(arrayList.get(1).toString().equals("0"))
        {
            b2.setTextColor(getResources().getColor(android.R.color.transparent));
        }
        if(arrayList.get(2).toString().equals("0"))
        {
            b3.setTextColor(getResources().getColor(android.R.color.transparent));
        }
        if(arrayList.get(3).toString().equals("0"))
        {
            b4.setTextColor(getResources().getColor(android.R.color.transparent));
        }
        if(arrayList.get(4).toString().equals("0"))
        {
            b5.setTextColor(getResources().getColor(android.R.color.transparent));
        }
        if(arrayList.get(5).toString().equals("0"))
        {
            b6.setTextColor(getResources().getColor(android.R.color.transparent));
        }
        if(arrayList.get(6).toString().equals("0"))
        {
            b7.setTextColor(getResources().getColor(android.R.color.transparent));
        }
        if(arrayList.get(7).toString().equals("0"))
        {
            b8.setTextColor(getResources().getColor(android.R.color.transparent));
        }
        if(arrayList.get(8).toString().equals("0"))
        {
            b9.setTextColor(getResources().getColor(android.R.color.transparent));
        }

    }

    @Override
    public void onClick(View v)
    {
        if (v.getId()==R.id.a1)
        {
            if(b2.getText().toString().equals("0"))
            {
                b2.setText(b1.getText().toString());
                b1.setText("0");
                b1.setTextColor(getResources().getColor(android.R.color.transparent));
                b2.setTextColor(getResources().getColor(R.color.black));
            }
            if(b4.getText().toString().equals("0"))
            {
                b4.setText(b1.getText().toString());
                b1.setText("0");
                b1.setTextColor(getResources().getColor(android.R.color.transparent));
                b4.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if(v.getId()==R.id.a2)
        {
            if(b1.getText().toString().equals("0"))
            {
                b1.setText(b2.getText().toString());
                b2.setText("0");
                b2.setTextColor(getResources().getColor(android.R.color.transparent));
                b1.setTextColor(getResources().getColor(R.color.black));
            }
            if(b3.getText().toString().equals("0"))
            {
                b3.setText(b2.getText().toString());
                b2.setText("0");
                b2.setTextColor(getResources().getColor(android.R.color.transparent));
                b3.setTextColor(getResources().getColor(R.color.black));
            }
            if(b5.getText().toString().equals("0"))
            {
                b5.setText(b2.getText().toString());
                b2.setText("0");
                b2.setTextColor(getResources().getColor(android.R.color.transparent));
                b5.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if (v.getId()==R.id.a3)
        {
            if(b2.getText().toString().equals("0"))
            {
                b2.setText(b3.getText().toString());
                b3.setText("0");
                b3.setTextColor(getResources().getColor(android.R.color.transparent));
                b2.setTextColor(getResources().getColor(R.color.black));
            }
            if(b6.getText().toString().equals("0"))
            {
                b6.setText(b3.getText().toString());
                b3.setText("0");
                b3.setTextColor(getResources().getColor(android.R.color.transparent));
                b6.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if(v.getId()==R.id.a4)
        {
            if(b1.getText().toString().equals("0"))
            {
                b1.setText(b4.getText().toString());
                b4.setText("0");
                b4.setTextColor(getResources().getColor(android.R.color.transparent));
                b1.setTextColor(getResources().getColor(R.color.black));
            }
            if(b5.getText().toString().equals("0"))
            {
                b5.setText(b4.getText().toString());
                b4.setText("0");
                b4.setTextColor(getResources().getColor(android.R.color.transparent));
                b5.setTextColor(getResources().getColor(R.color.black));
            }
            if(b7.getText().toString().equals("0"))
            {
                b7.setText(b4.getText().toString());
                b4.setText("0");
                b4.setTextColor(getResources().getColor(android.R.color.transparent));
                b7.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if(v.getId()==R.id.a5)
        {
            if(b2.getText().toString().equals("0"))
            {
                b2.setText(b5.getText().toString());
                b5.setText("0");
                b5.setTextColor(getResources().getColor(android.R.color.transparent));
                b2.setTextColor(getResources().getColor(R.color.black));
            }
            if(b4.getText().toString().equals("0"))
            {
                b4.setText(b5.getText().toString());
                b5.setText("0");
                b5.setTextColor(getResources().getColor(android.R.color.transparent));
                b4.setTextColor(getResources().getColor(R.color.black));
            }
            if(b6.getText().toString().equals("0"))
            {
                b6.setText(b5.getText().toString());
                b5.setText("0");
                b5.setTextColor(getResources().getColor(android.R.color.transparent));
                b6.setTextColor(getResources().getColor(R.color.black));
            }
            if(b8.getText().toString().equals("0"))
            {
                b8.setText(b5.getText().toString());
                b5.setText("0");
                b5.setTextColor(getResources().getColor(android.R.color.transparent));
                b8.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if(v.getId()==R.id.a6)
        {
            if(b3.getText().toString().equals("0"))
            {
                b3.setText(b6.getText().toString());
                b6.setText("0");
                b6.setTextColor(getResources().getColor(android.R.color.transparent));
                b3.setTextColor(getResources().getColor(R.color.black));
            }
            if(b5.getText().toString().equals("0"))
            {
                b5.setText(b6.getText().toString());
                b6.setText("0");
                b6.setTextColor(getResources().getColor(android.R.color.transparent));
                b5.setTextColor(getResources().getColor(R.color.black));
            }
            if(b9.getText().toString().equals("0"))
            {
                b9.setText(b6.getText().toString());
                b6.setText("0");
                b6.setTextColor(getResources().getColor(android.R.color.transparent));
                b9.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if(v.getId()==R.id.a7)
        {
            if(b4.getText().toString().equals("0"))
            {
                b4.setText(b7.getText().toString());
                b7.setText("0");
                b7.setTextColor(getResources().getColor(android.R.color.transparent));
                b4.setTextColor(getResources().getColor(R.color.black));
            }
            if(b8.getText().toString().equals("0"))
            {
                b8.setText(b7.getText().toString());
                b7.setText("0");
                b7.setTextColor(getResources().getColor(android.R.color.transparent));
                b8.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if(v.getId()==R.id.a8)
        {
            if(b5.getText().toString().equals("0"))
            {
                b5.setText(b8.getText().toString());
                b8.setText("0");
                b8.setTextColor(getResources().getColor(android.R.color.transparent));
                b5.setTextColor(getResources().getColor(R.color.black));
            }
            if(b7.getText().toString().equals("0"))
            {
                b7.setText(b8.getText().toString());
                b8.setText("0");
                b8.setTextColor(getResources().getColor(android.R.color.transparent));
                b7.setTextColor(getResources().getColor(R.color.black));
            }
            if(b9.getText().toString().equals("0"))
            {
                b9.setText(b8.getText().toString());
                b8.setText("0");
                b8.setTextColor(getResources().getColor(android.R.color.transparent));
                b9.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if(v.getId()==R.id.a9)
        {
            if(b6.getText().toString().equals("0"))
            {
                b6.setText(b9.getText().toString());
                b9.setText("0");
                b9.setTextColor(getResources().getColor(android.R.color.transparent));
                b6.setTextColor(getResources().getColor(R.color.black));
            }
            if(b8.getText().toString().equals("0"))
            {
                b8.setText(b9.getText().toString());
                b9.setText("0");
                b9.setTextColor(getResources().getColor(android.R.color.transparent));
                b8.setTextColor(getResources().getColor(R.color.black));
            }
        }
        if(b1.getText().toString().equals("1") && b2.getText().toString().equals("2") && b3.getText().toString().equals("3") && b4.getText().toString().equals("4") && b5.getText().toString().equals("5") && b6.getText().toString().equals("6") && b7.getText().toString().equals("7") && b8.getText().toString().equals("8") && b9.getText().toString().equals("0"))
        {
            System.out.println("Match is Win");
        }
    }
}