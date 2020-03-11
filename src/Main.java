package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int distance = 34;
        double averageSpeed = 70.5;
        System.out.println("distance = " + distance);
        System.out.println("averageSpeed = " + averageSpeed);
        double travelTime = distance / averageSpeed;
        System.out.println("travelTime = " + travelTime);
        double transportCoeff = 0.65;
        double totalTravelTime = travelTime / transportCoeff;
        System.out.println("totalTravelTime = " + totalTravelTime);
    }
}
