package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Rex");
        dog1.setBreed("Bulldog");
        dog1.setCommands(new String[]{"sit", "run"});
        dog1.setColor(Color.BLACK);
        dog1.setShelter(new Shelterr("Приют-1", "Советская 15"));

        System.out.println(dog1.getInfo());
        dog1.makeVoice(3, "Gav");

        String[] commands = new String[]{"run", "sit", "lie"};

        Shelterr shelter = new Shelterr("Приют-2", "Литовская 34");


        Dog dog2 = new Dog("Sharik", "Alabai", commands, Color.WHITE, shelter);
        System.out.println(dog2.getInfo());
        dog2.makeVoice("Gav-gV", 2);

        Dog dog3 = new Dog("Akjoltoi", "Street dog", Color.BROWN, shelter);
        dog3.setCommands(commands);
        System.out.println(dog3.getInfo());
        dog3.makeVoice("gav-gav");


    }
}