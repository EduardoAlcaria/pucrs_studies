package ListaExercicios03;

import java.util.Scanner;

/**1. Implemente um programa que leia um valor inteiro e indique quantos
digitos esse valor possui. */


public class Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type a number: ");
        double number = scan.nextDouble();
        
        int howManyDigits = (int) Math.log10(number) + 1;
        
        System.out.println("digits " + howManyDigits);
        
        scan.close();

    }    
}