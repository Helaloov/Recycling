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
        Anzahl.add(new RadarEntry(5));
        Anzahl.add(new RadarEntry(7));
        Anzahl.add(new RadarEntry(10));
        Anzahl.add(new RadarEntry(10));
        Anzahl.add(new RadarEntry(20));
        Anzahl.add(new RadarEntry(30));
        Anzahl.add(new RadarEntry(50));
        Anzahl.add(new RadarEntry(70));
        Anzahl.add(new RadarEntry(100));
        Anzahl.add(new RadarEntry(130));
        Anzahl.add(new RadarEntry(170));
        Anzahl.add(new RadarEntry(230));

        ArrayList<RadarEntry> Anzahl2 = new ArrayList<>();
        Anzahl2.add(new RadarEntry(110));
        Anzahl2.add(new RadarEntry(120));
        Anzahl2.add(new RadarEntry(130));
        Anzahl2.add(new RadarEntry(140));
        Anzahl2.add(new RadarEntry(160));
        Anzahl2.add(new RadarEntry(170));
        Anzahl2.add(new RadarEntry(190));
        Anzahl2.add(new RadarEntry(210));
        Anzahl2.add(new RadarEntry(220));
        Anzahl2.add(new RadarEntry(240));
        Anzahl2.add(new RadarEntry(260));
        Anzahl2.add(new RadarEntry(280));


        RadarDataSet radarDataSet = new RadarDataSet(Anzahl, "Verkauf");
        radarDataSet.setColor(Color.RED);
        radarDataSet.setLineWidth(2f);
        radarDataSet.setValueTextColor(Color.RED);
        radarDataSet.setValueTextSize(14f);

        RadarDataSet radarDataSet2 = new RadarDataSet(Anzahl2, "Spenden");
        radarDataSet2.setColor(Color.BLUE);
        radarDataSet2.setLineWidth(2f);
        radarDataSet2.setValueTextColor(Color.BLUE);
        radarDataSet2.setValueTextSize(14f);

        RadarData radarData = new RadarData();
        radarData.addDataSet(radarDataSet);
        radarData.addDataSet(radarDataSet2);

        String[] labels = {"2012", "2013" ,"2014", "2015" ,"2016", "2017" , "2018" , "2019" , "2020" ,"2021" ,"2022","2023"};

        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));
        radarChart.setData(radarData);
        radarChart.getDescription().setText("Schätzungen der Entwicklung des Secondhandmarktes\n");


    }
}