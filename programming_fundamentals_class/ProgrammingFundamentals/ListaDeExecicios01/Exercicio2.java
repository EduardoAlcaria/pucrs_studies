import java.util.Scanner;

import java.lang.Math;

public class Exercicio2{
    public static void main(String[] args){
        double t = 45;
        double r = 6371;
        double m = 5.97 * Math.pow(10, 24);
        double g = 6.67426 * Math.pow(10, -13) * Math.pow(m,3);
        double h = (g * m * Math.pow(t,2)/(4 * Math.pow(3.14, 2)) - r);
        double div = 1/3;
        System.out.println(Math.pow(h, div));


    }
}