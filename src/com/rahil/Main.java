package com.rahil;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte age = 30;
        short age1 = 30000;
        int viewsCount = 1_234_567_890;
        long viewsCont1 = 12_345_678_901L;
        float price = 10.99F;
        double price1 = 10.99;
        char letter = 'A';
        boolean isEligibile = false;
        Date now = new Date();
        System.out.println("Hello World");
        byte x = 1;
        byte y = x;
        System.out.println("Line1==> x=" + x + " y=" + y);
        x = 2;
        System.out.println("Line2==> x=" + x + " y=" + y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println("point1= " + point1 + "\n" + "point2= " + point2);
        point1.x = 2;
        System.out.println("point1= " + point1 + "\n" + "point2= " + point2);
    }
}
