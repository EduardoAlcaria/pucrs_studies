package ListaExercicios02;

/*
Implemente um programa que leia o saldo médio de uma conta corrente, calcule
e escreve o seu limite conforme: menor que R$ 500,00 não há limite; de R$ 500,00
a R$ 1.000,00 8% do saldo médio; maior ou igual a R$ 1.000,00 15% do saldo
médio
 */


import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("type your account balance: ");
        double balance = scan.nextDouble();

        if (balance < 500) {
            System.out.println("you have no limit");
        } else if (balance >= 500 && balance < 1000) {
            System.out.println("your limit is: " + (balance * 0.08));
        } else {
            System.out.println("your limit is: " + (balance * 0.15));
        }
    }
}
