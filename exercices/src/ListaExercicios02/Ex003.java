package ListaExercicios02;

//Faça um programa que lê a idade e classifica de acordo com: crianças até 11 anos;
//adolescentes de 12 a 17 anos; adultos de 18 a 59 anos; idoso com 60 anos ou mais.

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your age: ");
        int age = scan.nextInt();

        if (age <= 11) {
            System.out.println("you are a child");
        }else if (age >= 12 && age <= 17) {
            System.out.println("you are a teenager");
        }else if (age >= 18 && age <= 59){
            System.out.println("you are an adult");
        }else{
            System.out.println("you are an elder");
        }


    }
}
