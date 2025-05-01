package ListaExercicios02Complementar;

//Faça um programa que leia um número inteiro de 4 digitos (garanta isso).
//A seguir, seu programa deve verificar se o número lido possui a mesma
//característica que o número 3025. O programa deve escrever uma
//mensagem indicando ou não se o valor lido possui a característica
//mostrada.
// 30 + 25 = 55
//55^2 = 3025


import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type a 4 digits number: ");
        int n = scanner.nextInt();

        if ((int) Math.log10(n) + 1 == 4){
            int pos;
            int divisor;

            pos = 3;
            divisor = (int) Math.pow(10, pos);
            int newN1 = (n/divisor) % 10;

            pos = 2;
            divisor = (int) Math.pow(10, pos);
            int newN2 = (n/divisor) % 10;

            pos = 1;
            divisor = (int) Math.pow(10, pos);
            int newN3 = (n/divisor) % 10;

            pos = 0;
            divisor = (int) Math.pow(10, pos);
            int newN4 = (n/divisor) % 10;

            int newNumber1 = (newN1*10)+newN2;
            int newNumber2 = (newN3*10)+newN4;

           if (Math.pow((newNumber1 + newNumber2), 2) == n){
               System.out.println("it has the same characteristic");
           }else{
               System.out.println("it does not has the same characteristic");
           }
        }

    }
}
