package ListaExercicios02Complementar;

//5. Faça um programa que leia o mês (valores de 1 a 12, garanta isso) e escreva
//a quantidade de dias que cada mês possui.

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int january = 31;
        int february = 28;
        int march = 31;
        int abril = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int september = 30;
        int october = 31;
        int november = 30;
        int december = 31;

        System.out.println("type the a month number within 1 to 12");
        int m = scanner.nextInt();
        if (m >= 1 && m <= 12){
            if (m == 1){
                System.out.println("january has " +  january + " days");
            }
            if (m == 2){
                System.out.println("february has " + february + " days");
            }
            if (m == 3){
                System.out.println("march has " + march + " days");
            }
            if (m == 4){
                System.out.println("abril has " + abril + " days");
            }
            if (m == 5){
                System.out.println("may has " + may + " days");
            }
            if (m == 6){
                System.out.println("june has " + june + " days");
            }
            if (m == 7){
                System.out.println("july has " + july + " days");
            }
            if (m == 8){
                System.out.println("august has " + august + " days");
            }
            if (m == 9){
                System.out.println("september has " + september + " days");
            }
            if (m == 10){
                System.out.println("october has " + october + " days");
            }
            if (m == 11){
                System.out.println("november has " + november + " days");
            }
            if (m == 12){
                System.out.println("december has " + december + " days");
            }

        }else{
            System.out.println("Please type only months numbers within the range of 1 to 12");
        }




    }
}
