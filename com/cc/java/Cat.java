package com.cc.java;

public class Cat {

    private final String name;
    private final String furColor;
    private final int age;
    private final boolean isFemale;


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
            return "This is an inappropriate question!";
        } else {
            return String.valueOf(age);
        }
    }


}
  
