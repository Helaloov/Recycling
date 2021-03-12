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
        Anzahl.add(new BarEntry(2015, 1200));
        Anzahl.add(new BarEntry(2016, 1400));
        Anzahl.add(new BarEntry(2017, 1500));
        Anzahl.add(new BarEntry(2018, 1800));
        Anzahl.add(new BarEntry(2019, 2000));
        Anzahl.add(new BarEntry(2020, 1200));
        Anzahl.add(new BarEntry(2021, 1600));

        BarDataSet barDataSet = new BarDataSet(Anzahl, "Anzahl");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Beispiel für BarChart");
        barChart.animateY(2000);


    }
}