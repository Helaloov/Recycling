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
            "Denzlingen, Container",
            "Denzlingen, 2-Hand Shop",
            "Freiburg, Container",
            "Freiburg, 2-Hand Shop",
            "Waldkirch, Container",
            "Waldkirch, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Freiburg, Container",
            "Emmendingen, Container",
            "Elzach, Container",
            "Denzlingen, 2-Hand Shop"
    };
    private String[] Address = {
            "79211 Denzlingen,\n Musterstraße 1",
            "79211 Denzlingen,\n Musterstraße 2",
            "79098 Freiburg,\n Musterstraße 3",
            "79098 Freiburg,\n Musterstraße 4",
            "79183 Waldkirch,\n Lange Straße 118.",
            "79183 Waldkirch,\n Schlettstadtallee 9",
            "79106 Freiburg,\n Colmarer Str. 1",
            "79104 Freiburg,\n Stadtstr. 11",
            "79106 Freiburg,\n Fehrenbachallee 65",
            "79110 Freiburg,\n Auwaldstr. 89",
            "79312 Emmendingen,\n Freiburger Str. 12",
            "79215 Elzach,\n Freiburger Straße 12",
            "79211 Denzlingen,\n Im Einbollen "


    };

    private String[] Anbieter = {
            "DRK",
            "Name des Geschäfts",
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
            "Name des Geschäfts"
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
            R.drawable.s };

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
                    if(shape.getName().toLowerCase().contains(s.toLowerCase()) )
                    {
                        if(selectedFilters.contains("all"))
                        {
                            filteredShapes.add(shape);
                        }
                        else
                        {   for(String filter: selectedFilters)
                             {
                                 if (shape.getName().toLowerCase().contains(filter) )
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
        shapeAdapter adapter = new shapeAdapter(getApplicationContext(), 0, shapeList);
        listView.setAdapter(adapter);
    }


    public void Container(View view)
    {
        selectedFilters.clear();
        filterList("container");
        lookSelected(triangleButton);
        lookUnSelected(allButton);
        lookUnSelected(squareButton);
    }

    public void Geschaeft(View view)
    {
        selectedFilters.clear();
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