package ListaExercicios02;

//1) Escreva um programa que lê a idade e informa se é menor ou maior de idade

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("you are underage");
        }else{
            System.out.println("you are overage");
        }


    }
}
