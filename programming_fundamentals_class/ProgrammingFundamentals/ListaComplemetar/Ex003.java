package ListaComplemetar;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type how many litters does your car tank has L: ");
        double tank = scan.nextDouble();

        System.out.println("how many km does your car can ride with just 1L? (km/l):  ");
        double kmPerL = scan.nextDouble();

        System.out.println("how many km you will drive? KM: ");
        double km = scan.nextDouble();

        double autonomy = tank * kmPerL;
        double res = km / autonomy;

        System.out.printf("you will need %.2f liters to drive %.2f km", Math.ceil(res), km);

    }
}
