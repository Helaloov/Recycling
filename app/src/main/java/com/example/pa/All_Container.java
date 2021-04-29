package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class All_Container extends AppCompatActivity {

    public static ArrayList<Shape> shapeList = new ArrayList<>();

    private ListView listView;
    private Button  squareButton,  triangleButton,  allButton;


    private ArrayList<String> selectedFilters = new ArrayList<String>();
    private String currentSearchText = "";
    private SearchView searchView;
    private String[] Stadt = {
            "Freiburg, Container",
            "Denzlingen, 2-Hand Shop",
            "Freiburg, Container",
            "Emmendingen, 2-Hand Shop",
            "Waldkirch, Container",
            "Waldkirch, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Emmendingen, Container",
            "Elzach, Container",
            "Denzlingen, 2-Hand Shop",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, 2-Hand Shop",
            "Freiburg, 2-Hand Shop",
            "Freiburg, 2-Hand Shop",
            "Freiburg, 2-Hand Shop",
            "Emmendingen, 2-Hand Shop",
            "Emmendingen, 2-Hand Shop",
    };
    private String[] Address = {
            "79115 Freiburg,\nAm Kirchacker 1",
            "79211 Denzlingen,\nHauptstraße 163",
            "79115 Freiburg,\nBadenweilerstr. 1",
            "79312 Emmendingen,\nKarl-Friedrich-Straße 31 ",
            "79183 Waldkirch,\nLange Straße 118.",
            "79183 Waldkirch,\nSchlettstadtallee 9",
            "79106 Freiburg,\nColmarer Str. 1",
            "79104 Freiburg,\nStadtstr. 11",
            "79106 Freiburg,\nFehrenbachallee 65",
            "79110 Freiburg,\nAuwaldstr. 89",
            "79312 Emmendingen,\nFreiburger Str. 12",
            "79215 Elzach,\nFreiburger Straße 12",
            "79211 Denzlingen,\nIm Einbollen ",
            "79111 Freiburg,\nIngebog-Drewitz-Allee",
            "79114 Freiburg,\nAm Bischofskreuz",
            "79114 Freiburg,\nBissierstr. 2b Haltestelle VAG",
            "79114 Freiburg,\nBugginger Str. 81b",
            "79114 Freiburg,\nRankackerweg 106",
            "79102 Freiburg,\nUrachstr. 3",
            "79104 Freiburg,\nAlbertstr. 17",
            "79104 Freiburg,\nJacobistr. 15",
            "79104 Freiburg,\nRichard-Wagner-Str. 23",
            "79104 Freiburg,\nSonnhalde 5-9",
            "79104 Freiburg,\nStefan-Meier-Str. 96",
            "79106 Freiburg,\nFerdinand-Weiß-Str. 112",
            "79110 Freiburg,\nAm Hägle 64 Paul-Hindemith-Schule",
            "79106 Freiburg,\nHugstetter Str. 48",
            "79106 Freiburg,\nKandelstr. 31",
            "79106 Freiburg,\nTennenbacher Str. 6",
            "79108 Freiburg,\nAlban-Stolz-Str. 30",
            "79108 Freiburg,\nBebelstr. 10",
            "79110 Freiburg,\nBreisgauer Str. 2",
            "79111 Freiburg,\nAndreas-Hofer-Str. 1",
            "79110 Freiburg,\nLeisnerstr. 1",
            "79110 Freiburg,\nSchlettstadter Str. 33",
            "79110 Freiburg,\nWirthstr. 22",
            "79110 Freiburg,\nZiegelhofstr. 88",
            "79111 Freiburg,\nAm Silberhof 6",
            "79108 Freiburg,\nBerner Str. 11",
            "79108 Freiburg,\nHieberainle 50",
            "79108 Freiburg,\nLameystr. 2",
            "79111 Freiburg,\nRimsinger Weg 15",
            "79111 Freiburg,\nWaltershofener Str. 1a",
            "79112 Freiburg,\nAlte Breisacher Str. 36",
            "79112 Freiburg,\nAm Sportplatz 4",
            "79112 Freiburg,\nAuf der Linge 37",
            "79112 Freiburg,\nBurgmatt 8",
            "79112 Freiburg,\nIm Giesental 32",
            "79112 Freiburg,\nIm Maierbrühl 65",
            "79112 Freiburg,\nSonnenbrunnenstr. 20",
            "79102 Freiburg,\nDeichelweiherweg 1",
            "79102 Freiburg,\nHindenburgstr. 1",
            "79102 Freiburg,\nMühlenstr. 6",
            "79111 Freiburg,\nHartkirchweg 19",
            "79100 Freiburg,\nChristoph-Mang-Str. 20",
            "79100 Freiburg,\nLangemarckstr. 103",
            "79100 Freiburg,\nHolbeinstr. 36",
            "79098 Freiburg,\nHumboldtstr. 30",
            "79098 Freiburg,\nWilhelmstr. 2-4",
            "79114 Freiburg,\nUnterer Mühlenweg 55",
            "79098 Freiburg,\nSalzstraße 23 ",
            "79098 Freiburg,\nLeopoldring 3A",
            "79102 Freiburg,\nErwinstraße 3A",
            "79098 Freiburg,\nMerianstraße 5 ",
            "79312 Emmendingen,\nMarkgrafenstraße 18 ",
            "79312 Emmendingen,\nAm Elzdamm 45 ",





    };

    private String[] Anbieter = {
            "DRK",
            "FAIRKAUF",
            "DRK",
            "Second Hand ",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "Name des Geschäfts",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "DRK",
            "Schlepprock",
            "Second Hand Exclusive ",
            "Klamöttchen",
            "Umkleide",
            "FAIRKAUF",
            "FAIRKAUF",
    };
    int[] image = {
            R.drawable.c ,
            R.drawable.s ,
            R.drawable.c,
            R.drawable.s,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.s,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.c,
            R.drawable.s ,
            R.drawable.s ,
            R.drawable.s ,
            R.drawable.s ,
            R.drawable.s ,
            R.drawable.s ,

    };

    private int white, darkGray, red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__container);

        initWidgets();
        initSearchWidgets();
        setupData();
        setUpList();
        initColors();
        setUpOnclickListener();
        lookSelected(allButton);
        selectedFilters.add("all");

    }

    private void initColors()
    {
        white = ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary);
        red = ContextCompat.getColor(getApplicationContext(), R.color.red);
        darkGray = ContextCompat.getColor(getApplicationContext(), R.color.darkerGray);
    }

    private void unSelectAllFilterButtons()
    {
        lookUnSelected(allButton);
        lookUnSelected(triangleButton);
        lookUnSelected(squareButton);
    }

    private void lookSelected(Button parsedButton)
    {
        parsedButton.setTextColor(white);
        parsedButton.setBackgroundColor(red);
    }

    private void lookUnSelected(Button parsedButton)
    {
        parsedButton.setTextColor(red);
        parsedButton.setBackgroundColor(darkGray);
    }


    private void initSearchWidgets() {

        searchView = (SearchView) findViewById(R.id.shapeListSearchView);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s)
            {
                currentSearchText = s;
                ArrayList<Shape> filteredShapes = new ArrayList<Shape>();

                for(Shape shape: shapeList)
                {
                    if(shape.getAdress().toLowerCase().contains(s.toLowerCase()) )
                    {
                        if(selectedFilters.contains("all"))
                        {
                            filteredShapes.add(shape);
                        }
                        else
                        {   for(String filter: selectedFilters)
                             {
                                 if (shape.getAdress().toLowerCase().contains(filter) )
                                  {
                                     filteredShapes.add(shape);
                                  }
                             }
                        }
                    }
                }
                shapeAdapter adapter = new shapeAdapter(getApplicationContext(), 0, filteredShapes);
                listView.setAdapter(adapter);

                return false;
            }
        });
    }


    private void setupData() {



        for(int i= 0; i< Stadt.length ; i++){

            String I = Integer.toString(i);
            Shape shape = new Shape(I,Stadt[i],Address[i],Anbieter[i], image[i]);
            shapeList.add(shape);

        }}

    private void setUpList() {
        listView = (ListView) findViewById(R.id.shapesListView);

        shapeAdapter adapter = new shapeAdapter(getApplicationContext(), 0, shapeList);
        listView.setAdapter(adapter);
    }
    private void setUpOnclickListener() {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Shape selectShape = (Shape) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), DetailActivity.class);
                showDetail.putExtra("id",selectShape.getId());
                startActivity(showDetail);
            }
        });
    }

    private void filterList(String status)
    {
        if(status != null && !selectedFilters.contains(status))
            selectedFilters.add(status);

        ArrayList<Shape> filteredShapes = new ArrayList<Shape>();

        for(Shape shape: shapeList)
        {
            for(String filter: selectedFilters)
            {
                if(shape.getName().toLowerCase().contains(filter) )
                {
                    if(currentSearchText == "")
                    {
                        filteredShapes.add(shape);
                    }
                    else
                    {
                        if(shape.getName().toLowerCase().contains(currentSearchText.toLowerCase()))
                        {
                            filteredShapes.add(shape);
                        }
                    }
                }
            }
        }

        setAdapter(filteredShapes);
    }


    private void initWidgets()
    {


        squareButton = (Button) findViewById(R.id.squareFilter);

        triangleButton  = (Button) findViewById(R.id.triangleFilter);

        allButton  = (Button) findViewById(R.id.allFilter);

    }


    public void allFilterTapped(View view)
    {
        selectedFilters.clear();
        selectedFilters.add("all");
        unSelectAllFilterButtons();
        lookSelected(allButton);
        filterList(", ");
    }


    public void Container(View view)
    {
        selectedFilters.clear();
        filterList("container");
        selectedFilters.add("all");
        lookSelected(triangleButton);
        lookUnSelected(allButton);
        lookUnSelected(squareButton);
    }

    public void Geschaeft(View view)
    {
        selectedFilters.clear();
        selectedFilters.add("all");
        filterList("shop");
        lookSelected(squareButton);
        lookUnSelected(allButton);
        lookUnSelected(triangleButton);

    }




    private void setAdapter(ArrayList<Shape> shapeList)
    {
        shapeAdapter adapter = new shapeAdapter(getApplicationContext(), 0, shapeList);
        listView.setAdapter(adapter);
    }
}