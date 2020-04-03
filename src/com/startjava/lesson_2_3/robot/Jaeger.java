package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int speed;

    public Jaeger(String modelName, String mark, float height, float weight, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    private String getModelName() {
        return modelName;
    }

    private String getMark() {
        return mark;
    }

    private float getHeight() {
        return height;
    }

    private float getWeight() {
        return weight;
    }

    private int getSpeed() {
        return speed;
    }

    // ===============    Methods of robot    ====================
    public void move() {
        System.out.println(getModelName() + " can move " + getSpeed() + " km/h");
    }

    public String call() {
        return (getModelName() + " mark: " + getMark());
    }

    public void robotSize() {
        System.out.println(getModelName() + " has: " + getHeight() + "m height and " + getWeight() + " tons weight");
    }
}