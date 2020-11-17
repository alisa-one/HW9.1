package com.company;

public class Pett {


    private int age = generateDefaultAge();
    private Color color;
    private Shelterr shelter;


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelterr getShelter() {
        return shelter;
    }

    public void setShelter(Shelterr shelter) {
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    private int generateDefaultAge() {
        /*Random r = new Random();
        return r.nextInt(20)+1;*/

        return (int)(Math.random()*10+5);
    }

    public String getInfo() {
        return "Pet = { age = "+age+", color = "+color+";  Shelter =   "+shelter.getName()+","+shelter.getAdress()+ ";  ";
    }
}


