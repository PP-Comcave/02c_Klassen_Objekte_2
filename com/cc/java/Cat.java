package com.cc.java;

public class Cat {

    private final String name;
    private final String furColor;
    private final int age;
    private final boolean isFemale;

    private int counter = 0;


    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String getStringAttributes(String op) {
        return switch (op) {
            case "#name" -> name;
            case "#color" -> furColor;
            default -> "ERROR!";
        };
    }

    public String getAge() {
        if (isFemale) {
            return checkCompliance();
        } else {
            return String.valueOf(age);
        }
    }
    private String checkCompliance() {
        counter++;
        return switch (counter){
            case 1 -> "This is an inappropriate question!";
            case 2 -> "i#ve told you once!";
            case 3 -> "Talk to the hand!";
            default -> "1#!?&&%";
        };
    }


}
  
