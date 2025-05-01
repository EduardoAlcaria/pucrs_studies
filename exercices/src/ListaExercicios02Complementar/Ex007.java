package ListaExercicios02Complementar;

//Elabore um programa que leia um número inteiro de 4 digitos (garanta
//isso). A seguir o programa deve determinar se o número lido é capicua.
//Um número é capicua quando lido da esquerda para a direita ou da direita
//para a esquerda representa sempre o mesmo valor, como por exemplo 6446.

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type an integer number that has 4 digits: ");
        int number = scanner.nextInt();

        if ((int) (Math.log10(number - 1) + 1) == 4){
            int pos;
            int div;

            pos = 3;
            div = (int) Math.pow(10, pos);
            int n1 = (number/div) % 10;

            pos = 2;
            div = (int) Math.pow(10, pos);
            int n2 = (number/div) % 10;


            pos = 1;
            div = (int) Math.pow(10, pos);
            int n3 = (number/div) % 10;

            pos = 0;
            div = (int) Math.pow(10, pos);
            int n4 = (number/div) % 10;


            int newNumber = (n4 * 1000) + (n3 * 100) + (n2 * 10) + n1;


            if (newNumber == number){
                System.out.println("its a palindrome");
            }else{
                System.out.println("its not a palindrome");
            }
        }

    }
}
