package com.cc.java;

public class TomCat {

    private final String name;
    private final String furColor;
    private final int age;


    public TomCat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;

    }

    public String getStringAttributes(String op) {
        return switch (op) {
            case "#name" -> name;
            case "#color" -> furColor;
            default -> "ERROR!";
        };
    }

    public String getAge() {

            return String.valueOf(age);

    }



}
  
