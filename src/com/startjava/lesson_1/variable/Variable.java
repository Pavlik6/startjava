package com.startjava.lesson_1.variable;

class Variable {
    public static void main(String[] args) {
        byte memoryRAM = 8;
        short systemType = 64;
        int windows = 10;
        long productID = 389834822;
        float frequencyCPU = 3.4f;
        double timeOfWork = 3.93874893797439d;
        char modelOfCPU = 'R';
        boolean isWindows = true;

        System.out.println("Memory (RAM) - " + memoryRAM);
        System.out.println("System type  - " + systemType);
        System.out.println("Computer system - " + windows);
        System.out.println("Product key - " + productID);
        System.out.println("Frequency of CPU - " + frequencyCPU);
        System.out.println("Working of hours - " + timeOfWork);
        System.out.println("Model of CPU - " + modelOfCPU);
        System.out.println("Is it Windows - " + isWindows);
    }
}