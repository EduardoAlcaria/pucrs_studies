package ListaComplemetar;

import java.util.Scanner;

/**
 * Uma empresa de bolinhas de gude precisa de um programa que calcula a quantidade
 * de caixas necessárias para embalar as bolinhas. A empresa trabalha com caixas cuja
 * capacidade é de 100 bolinhas. Faça um programa que leia a quantidade de bolinhas, calcule
 * e escreva a quantidade de caixas necessárias para embalar as bolinhas.
 */

public class Ex004 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number of bolses: ");
        double balls = scan.nextDouble();
        double box = balls/100;

        System.out.println(box);
    }
}
