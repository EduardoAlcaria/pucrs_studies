package ListaExercicios02Complementar;

//Implemente um programa que leia 4 valores inteiros e escreve se entre os
//valores lidos há dois pares iguais. Exemplos:
//• entrada: 1 2 2 1 , saída: há dois pares
//• entrada: 1 2 3 2, saída: não há dois pares
//• entrada: 2 2 2 2 , saída: há dois pares
//• entrada: 2 1 2 1 , saída: há dois pares


import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1st value");
        int n1 = scanner.nextInt();

        System.out.println("2nd value");
        int n2 = scanner.nextInt();

        System.out.println("3rd value");
        int n3 = scanner.nextInt();

        System.out.println("4th value");
        int n4 = scanner.nextInt();

        int max = Math.max(n1, Math.max(n2, Math.max(n3, n4)));

        if (max != n1 && max != n2 || max != n3 && max != n4){
            System.out.println(n1  + " " + n2 + " " + n3 + " " + n4 + " " + "there are not 2 sets");
        }
        System.out.println(n1  + " " + n2 + " " + n3 + " " + n4 + " " + "there are 2 sets");




    }
}
