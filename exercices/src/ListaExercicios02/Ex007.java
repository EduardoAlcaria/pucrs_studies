package ListaExercicios02;


//Implemente um programa que leia 3 valores reais (n1, n2 e n3) e um valor inteiro
//(opção). O programa deve escrever os valores n1, n2 e n3 em uma determinada
//ordem, a qual é definida pelo valor de opção.
//(a) Se opcao for 1, o programa deve escrever os valores em ordem crescente.
//(b) Se opcao for 2, o programa deve escrever os valores em ordem decrescente.
//(c) Se opcao for 3, o maior deve ser escrito entre os demais.

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type the 1st value:");
        double n1 = scan.nextDouble();

        System.out.println("Type the 2nd value: ");
        double n2 = scan.nextDouble();

        System.out.println("Type the 3th value: ");
        double n3 = scan.nextDouble();


        System.out.println("Type 1 for the rising order: ");
        System.out.println("Type 2 for the decreasing order: ");
        System.out.println("Type 3 for the max value be in the middle: ");
        int choice = scan.nextInt();


        double max = (Math.max(n1, Math.max(n2, n3)));
        double min = (Math.min(n1, Math.min(n2, n3)));
        double bet = 0;

        if (n1 != min && n1 != max) {
            bet = n1;
        }
        if (n2 != min && n2 != max) {
            bet = n2;
        }
        if (n3 != min && n3 != max) {
            bet = n3;
        }


        switch (choice){
            case 1:
                System.out.println("Rising order");
                System.out.println(min + " " + bet + " " + max);
                break;
            case 2:
                System.out.println("decreasing order");
                System.out.println(max + " " + bet + " " + min);
                break;
            case 3:
                System.out.println("max value in the middle");
                System.out.println(min + " " + max + " "  + bet);
                break;

        }




    }
}
