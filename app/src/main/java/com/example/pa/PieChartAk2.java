package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartAk2 extends AppCompatActivity {
int[] CC = {Color.RED, Color.DKGRAY ,Color.GREEN, Color.GRAY, Color.BLUE , Color.MAGENTA };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart_ak2);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> Anzahl = new ArrayList<>();

        Anzahl.add(new PieEntry(8,"Qualität 1"));
        Anzahl.add(new PieEntry(32,"Qualität 2-3"));
        Anzahl.add(new PieEntry(15,"Sonstiges"));
        Anzahl.add(new PieEntry(11,"Abfall"));
        Anzahl.add(new PieEntry(16,"Putzlappen"));
        Anzahl.add(new PieEntry(18,"Recyclingstoffe"));



        PieDataSet pieDataSet = new PieDataSet(Anzahl, "");
        pieDataSet.setColors(CC);
        pieDataSet.setValueTextColor(Color.WHITE);




        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);


        pieChart.setCenterText("Zahlen in % von ca. 1 Million Tonnen");
        pieChart.getDescription().setText("Sortierung von Gebrauchtkleidung");
        pieChart.getDescription().setTextSize(10.5f);
        pieChart.animate();
        pieChart.setEntryLabelColor(Color.YELLOW);
    }
}