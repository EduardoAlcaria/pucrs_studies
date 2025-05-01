package ListaExercicios02Complementar;

//. Escreva um programa que leia a temperatura da água e a escala em que
//está expressa (use 1 para Celsius e 2 para Fahrenheit). O programa deve
//escrever o estado corresponde à temperatura informada: sólido, líquido ou
//gasoso.

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the water temperature: ");
        double waterTemp = scanner.nextDouble();

        System.out.println("Type 1 for Celsius and 2 for Fahrenheit: ");
        int scale = scanner.nextInt();

        switch (scale) {
            case 1:
                if (waterTemp >= 100) {
                    System.out.println("gas");
                }
                if (waterTemp < 0) {
                    System.out.println("solid");
                }
                if (waterTemp >= 0) {
                    System.out.println("Liquid");
                }
                break;
            case 2:
                waterTemp = (waterTemp * 1.8) + 32;
                if (waterTemp >= 212) {
                    System.out.println("Gas");
                }
                if (waterTemp < 32) {
                    System.out.println("Solid");
                }

                if (waterTemp >= 32) {
                    System.out.println("Liquid");
                }
                break;
        }

    }
}
