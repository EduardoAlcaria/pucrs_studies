import java.lang.Math;

public class Exercicio2{


    public static void main(String[] args){

        double[] t = {45 * 60, 90 * 60, 24 * 60 * 60};

        for (int i = 0; i < 3; i++) {
            System.out.println("the altitude for " + altitude(t[i]));
        }
    }
    public static double altitude(double t){
        double g = 6.67426e-11;
        double m = 5.97e24;
        double r = 6_371_000;

        return Math.pow(((g * m * Math.pow(t, 2))/(4 * Math.pow(Math.PI, 2))), (double) 1 / 3) - r;
    }
}