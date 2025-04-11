package ListaExercicios01;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type a Fahrenheit degree: ");

        double fah = scanner.nextDouble();

        double fahToCel = (fah-32) * 5/9;

        System.out.printf("%.2f%n", fahToCel);

    }
}
