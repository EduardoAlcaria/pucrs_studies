package ListaExercicios02Complementar;

//1. Implemente um programa que leia um valor inteiro e indique quantos
//digitos esse valor possui.

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type an integer number: ");
        int num = scanner.nextInt();

        System.out.println((int) Math.log10(num) + 1);


    }
}
