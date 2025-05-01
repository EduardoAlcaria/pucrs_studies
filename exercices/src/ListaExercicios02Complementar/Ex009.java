package ListaExercicios02Complementar;


//Faça um programa que leia 5 valores reais, calcula e escreve a média desses
//valores conforme descrito a seguir:
//(a) descarta o maior e o menor valor, calcula a média dos valores restantes.
//(b) descarta os dois menores valores, calcula a média dos valores restantes.

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 real value: ");
        int n1 = scanner.nextInt();

        System.out.println("2 real value: ");
        int n2 = scanner.nextInt();

        System.out.println("3 real value: ");
        int n3 = scanner.nextInt();

        System.out.println("4 real value: ");
        int n4 = scanner.nextInt();

        System.out.println("5 real value: ");
        int n5 = scanner.nextInt();


        int max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
        int min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));


        int min2aux = Math.min(Math.min(n1, n2), Math.min(n3, Math.min(n4, n5)));

        int pos2 = min2aux;

        if (n1 != min2aux && n1 < max) pos2 = n1;
        if (n2 != min2aux && n2 < max) pos2 = n2;
        if (n3 != min2aux && n3 < max) pos2 = n3;
        if (n4 != min2aux && n4 < max) pos2 = n4;
        if (n5 != min2aux && n5 < max) pos2 = n5;


        int sumALl = (n1 + n2 + n3 + n4 + n5) - (max + min);
        int sumAll2 = (n1 + n2 + n3 + n4 + n5) - (pos2 + min);


        System.out.println("2nd min: " + pos2);
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        System.out.println(sumALl/3);
        System.out.println(sumAll2/3);


    }

}
