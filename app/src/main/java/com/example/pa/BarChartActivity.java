package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> Anzahl = new ArrayList<>();
        Anzahl.add(new BarEntry(2012,11));
        Anzahl.add(new BarEntry(2013,12));
        Anzahl.add(new BarEntry(2014,14));
        Anzahl.add(new BarEntry(2015,15));
        Anzahl.add(new BarEntry(2016,18));
        Anzahl.add(new BarEntry(2017,20));
        Anzahl.add(new BarEntry(2018,24));
        Anzahl.add(new BarEntry(2019,28));
        Anzahl.add(new BarEntry(2020,33));
        Anzahl.add(new BarEntry(2021,39));
        Anzahl.add(new BarEntry(2022,46));
        Anzahl.add(new BarEntry(2023,55));
        Anzahl.add(new BarEntry(2024,64));

        BarDataSet barDataSet = new BarDataSet(Anzahl, "Weltweiter Marktwert für Secondhand-Bekleidung von 2012 bis 2024 ");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setEnabled(false);
        barChart.animateY(2000);


    }
}