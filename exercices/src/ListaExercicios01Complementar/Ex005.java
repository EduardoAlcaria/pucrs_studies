package ListaExercicios01Complementar;

//5. Uma casa de espetáculos teatrais precisa de um programa que calcula o valor do
//ingresso. Faça um programa que leia o custo total do espetáculo (esse valor total é a soma
//dos gastos com: elenco, técnicos, local da apresentação, ...) e o número de poltronas
//existentes no teatro. O programa deve solicitar ainda ao usuário: percentual de lucro
//desejado, percentual mínimo de ocupação esperado (das poltronas do teatro) em cada
//espetáculo e quantidade de espetáculos que será realizada. Com base nesses dados, o
//programa deve calcular e escrever o valor do ingresso.

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cast costs: ");
        double castCosts = scanner.nextDouble();

        System.out.println("Technicians costs: ");
        double techCosts = scanner.nextDouble();

        System.out.println("Show place costs: ");
        double showPlaceCosts = scanner.nextDouble();

        double costSum = castCosts + techCosts + showPlaceCosts;

        System.out.println("number of seats: ");
        int seats = scanner.nextInt();

        System.out.println("How much % of profit do you want? ");
        double profit = scanner.nextDouble();

        System.out.println("Whats the minimum % of people in the show? ");
        double minimum = scanner.nextDouble();

        System.out.println("How many shows are you going to do? ");
        int shows = scanner.nextInt();


        double expectedTotalOccupancy = seats * (minimum / 100) * shows;

        double total = costSum * (1 + profit/100);

        double ticket = total/expectedTotalOccupancy;

        System.out.printf("the ticket cost is: %.2f\n", ticket);



    }
}
