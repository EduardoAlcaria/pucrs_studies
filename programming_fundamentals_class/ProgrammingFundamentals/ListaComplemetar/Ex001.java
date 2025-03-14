package ListaComplemetar;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type the hours ");

        int hour = scan.nextInt();

        System.out.println("Type the minutes ");

        int minutes = scan.nextInt();

        int totTime = (hour * 60 * 60) + minutes * 60;

        System.out.println("The time in seconds is: " + totTime);

    }
}
