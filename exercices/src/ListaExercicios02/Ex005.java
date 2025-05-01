package ListaExercicios02;

//Escreva um programa que determina o preço de venda dos produtos de uma loja
//conforme o preço de custo desses produtos. O programa deve ler o preço de custo
//e calcular o valor de venda conforme o que segue: valor abaixo de R$10,00, lucro
//de 70%; de R$10,00 a menos de R$30,00, lucro de 50%; de R$30,00 a menos de
//R$50,00 lucro de 40%; de R$50,00 ou mais, lucro de 30%.

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please type bellow the cost of an product: ");
        double priceCost = scan.nextDouble();

        double msrp;

        if (priceCost < 10){
            msrp = priceCost + (priceCost * 0.7);
            System.out.println(msrp);
        }
        if (priceCost >= 10 && priceCost < 30){
            msrp = priceCost + (priceCost * 0.5);
            System.out.println(msrp);
        }
        if (priceCost >= 30 && priceCost < 50){
            msrp = priceCost + (priceCost * 0.4);
            System.out.println(msrp);
        }
        if (priceCost >= 50){
            msrp = priceCost + (priceCost * 0.3);
            System.out.println(msrp);
        }

    }
}
