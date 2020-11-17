package com.company;

public class pet {

    private int age;
    private String color;
    private String shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getShelter() {
        return shelter;
    }

    public void setShelter(String shelter) {
        this.shelter = shelter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int generateDefaultAge() {

        return (int) (Math.random() * 10 + 5);
    }

    public String getInfo() {
        return "Pet= {age = " + age + ", color = " + color + "shelter = " + shelter + "}";


    }
}
