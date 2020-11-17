package com.company;

import java.util.Arrays;

public class Dog extends Pett {

    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
    }

    public Dog(String name, String breed, String[] commands, Color color, Shelterr shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, Color color, Shelterr shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Гав-гав-гав");
        }
    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.println("Тяф-тяф");
        }
    }

    public void makeVoice(String voice) {
        System.out.println("Р-р-р");
    }



    public String getInfo() {
        return super.getInfo() + "Name = " + name + ", breed = " + breed + ", commands = " + Arrays.toString(commands) + "}";
    }

}
