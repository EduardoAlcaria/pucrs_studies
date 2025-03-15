package ListaExercicios02;

import java.util.Scanner;

/*
Faça um programa que lê a altura de uma pessoa em metros e o seu sexo (use 1
para feminino e 2 para masculino). A seguir, o programa deve escrever o peso ideal
dessa pessoa conforme descrito: Para homens, use 72.7 x altura -58. Para
mulheres, use 62.1 x altura -44.7
 */
public class Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type your height: ");
        double height = scan.nextDouble();

        scan.nextLine();

        System.out.println("type your gender (m/f): ");

        char gender = Character.toLowerCase(scan.next().charAt(0));

        scan.nextLine();

        switch (gender) {
            case 'm': {
                double idealWeightM = (72.7 * height) - 58;
                System.out.printf("you ideal weight is: %.2f%n", idealWeightM);
                break;
            }
            case 'f': {
                double idealWeightF = (62.1 * height) - 44.7;
                System.out.printf("you ideal weight is: %.2f%n", idealWeightF);
                break;
            }
        }
        scan.close();
    }
}