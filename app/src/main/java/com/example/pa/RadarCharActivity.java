package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class RadarCharActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar_char);

        RadarChart radarChart = findViewById(R.id.radarChart);

        ArrayList<RadarEntry> Anzahl = new ArrayList<>();
        Anzahl.add(new RadarEntry(400));
        Anzahl.add(new RadarEntry(500));
        Anzahl.add(new RadarEntry(600));
        Anzahl.add(new RadarEntry(450));
        Anzahl.add(new RadarEntry(700));
        Anzahl.add(new RadarEntry(340));
        Anzahl.add(new RadarEntry(1000));

        ArrayList<RadarEntry> Anzahl2 = new ArrayList<>();
        Anzahl2.add(new RadarEntry(600));
        Anzahl2.add(new RadarEntry(400));
        Anzahl2.add(new RadarEntry(200));
        Anzahl2.add(new RadarEntry(750));
        Anzahl2.add(new RadarEntry(1000));
        Anzahl2.add(new RadarEntry(840));
        Anzahl2.add(new RadarEntry(900));

        RadarDataSet radarDataSet = new RadarDataSet(Anzahl, "Anzahl");
        radarDataSet.setColor(Color.RED);
        radarDataSet.setLineWidth(2f);
        radarDataSet.setValueTextColor(Color.RED);
        radarDataSet.setValueTextSize(14f);

        RadarDataSet radarDataSet2 = new RadarDataSet(Anzahl2, "Anzah2");
        radarDataSet2.setColor(Color.BLUE);
        radarDataSet2.setLineWidth(2f);
        radarDataSet2.setValueTextColor(Color.BLUE);
        radarDataSet2.setValueTextSize(14f);

        RadarData radarData = new RadarData();
        radarData.addDataSet(radarDataSet);
        radarData.addDataSet(radarDataSet2);

        String[] labels = {"2014", "2015" , "2016" , "2017" , "2018" ,"2019" ,"2020"};

        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));
        radarChart.setData(radarData);
        radarChart.getDescription().setText("Hier kann man eine Beschreibung hinzufügen");


    }
}