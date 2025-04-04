package ListaExercicios02;

/*
Escreva um programa que determina o preço de venda dos produtos de uma loja
conforme o preço de custo desses produtos. O programa deve ler o preço de custo
e calcular o valor de venda conforme o que segue: valor abaixo de R$10,00, lucro
de 70%; de R$10,00 a menos de R$30,00, lucro de 50%; de R$30,00 a menos de
R$50,00 lucro de 40%; de R$50,00 ou mais, lucro de 30%.
 */


import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type the product price: ");
        double price = scan.nextDouble();

        if (price < 10) {
            System.out.println("the profit is: " + (price * 70) / 100);
        } else if (price >= 10 && price < 30) {
            System.out.println("the profit is: " + (price * 50) / 100);
        } else if (price >= 30 && price < 50) {
            System.out.println("the profit is: " + (price * 40) / 100);
        } else {
            System.out.println("the profit is: " + (price * 30) / 100);
        }
    }
}
