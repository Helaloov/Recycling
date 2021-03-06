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

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> Anzahl = new ArrayList<>();
        Anzahl.add(new PieEntry(57,"Container"));
        Anzahl.add(new PieEntry(39,"Familie"));
        Anzahl.add(new PieEntry(8,"2-H-shop"));
        Anzahl.add(new PieEntry(30,"Freunde"));
        Anzahl.add(new PieEntry(15,"Müll"));



        PieDataSet pieDataSet = new PieDataSet(Anzahl, "");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.WHITE);




        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);


        pieChart.setCenterText("Zahlen in %");

        pieChart.getDescription().setText("Was machen Menschen mit alter Kleidung, die Ihnen nicht mehr passt?");
        pieChart.getDescription().setTextSize(11f);
        pieChart.animate();
        pieChart.setEntryLabelColor(Color.BLACK);




    }
}