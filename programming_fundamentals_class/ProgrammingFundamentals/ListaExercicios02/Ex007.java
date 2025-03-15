package ListaExercicios02;

import java.util.Scanner;

/*
Implemente um programa que leia 3 valores reais (n1, n2 e n3) e um valor inteiro
(opção). O programa deve escrever os valores n1, n2 e n3 em uma determinada
ordem, a qual é definida pelo valor de opção.
(a) Se opcao for 1, o programa deve escrever os valores em ordem crescente.
(b) Se opcao for 2, o programa deve escrever os valores em ordem decrescente.
(c) Se opcao for 3, o maior deve ser escrito entre os demais.
 */
public class Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double max;
        double min;
        double numberBetween;

        System.out.println("type the 1st number: ");
        double n1 = scan.nextDouble();

        System.out.println("type the 2nd number: ");
        double n2 = scan.nextDouble();

        System.out.println("type the 3rd number: ");
        double n3 = scan.nextDouble();

        max = Math.max(Math.max(n1, n2), n3);
        min = Math.min(Math.min(n1, n2), n3);

        if (n1 != max && n1 != min) {
            numberBetween = n1;
        } else if (n2 != max && n2 != min) {
            numberBetween = n2;
        }else {
            numberBetween = n3;
        }

        System.out.println("type the option: ");
        System.out.println("press 1 to sort in ascending order");
        System.out.println("press 2 to sort in decreasing order");
        System.out.println("press 3 to write the greatest number");
        int option = scan.nextInt();

        scan.nextLine();

        switch (option) {
            case 1: {
                System.out.println("Increasing order: " + min + " , " + numberBetween + " , " + max);
                break;
            }
            case 2: {
                System.out.println("Decreasing order: " + max + " , " + numberBetween + " , " + min);
                break;
            }
            case 3: {
                System.out.println("Greatest number: " + max);
                break;
            }
        }
        scan.close();
    }
}
