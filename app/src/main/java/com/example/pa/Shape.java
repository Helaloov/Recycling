package com.example.pa;

public class Shape {

    private String id;
    private String name;
    private String Adress;
    private String Anbieter;
    private int image;

    public Shape(String id, String name,String Adress,String Anbieter, int image) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.Adress = Adress;
        this.Anbieter = Anbieter;
    }

    public String getAnbieter() {
        return Anbieter;
    }

    public void setAnbieter(String anbieter) {
        Anbieter = anbieter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return Adress;
    }

    public void setAdress(String name) {
        this.Adress = Adress;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
