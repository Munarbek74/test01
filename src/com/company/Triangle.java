package com.company;

public class Triangle {
    double a;
    double b;
    double c;

public void area() {
    double p = (a + b + c) / 2;
    System.out.println("perimeter:" + p);
    double s = (double) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    System.out.println("Square:" + s);
}

}
