package ListaExercicios01Complementar;

//4. Uma empresa de bolinhas de gude precisa de um programa que calcula a quantidade
//de caixas necessárias para embalar as bolinhas. A empresa trabalha com caixas cuja
//capacidade é de 100 bolinhas. Faça um programa que leia a quantidade de bolinhas, calcule
//e escreva a quantidade de caixas necessárias para embalar as bolinhas.

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many little balls does you have? ");
        int balls = scanner.nextInt();

        if (balls < 100){
            System.out.println("1 box will be enough");
        }else {
            System.out.println("you will need " + Math.round((float) balls /100) + " boxes");
        }
    }
}
