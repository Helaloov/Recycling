package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Statistiken extends AppCompatActivity {

    Button b1, b2, b3, b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiken);

        final Intent barchart = new Intent(this, BarChartActivity.class);
        final Intent piechart = new Intent(this, PieChartActivity.class);
        final Intent piechart2 = new Intent(this, PieChartAk2.class);
        final Intent radarchart = new Intent(this, RadarCharActivity.class);

        b1 = (Button) findViewById(R.id.button1);
        b3 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(barchart);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(piechart);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(radarchart);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(piechart2);
            }
        });


    }
}