package ListaComplemetar;


import java.util.Scanner;

/**
 * Uma casa de espetáculos teatrais precisa de um programa que calcula o valor do
 * ingresso. Faça um programa que leia o custo total do espetáculo (esse valor total é a soma
 * dos gastos com: elenco, técnicos, local da apresentação, ...) e o número de poltronas
 * existentes no teatro. O programa deve solicitar ainda ao usuário: percentual de lucro
 * desejado, percentual mínimo de ocupação esperado (das poltronas do teatro) em cada
 * espetáculo e quantidade de espetáculos que será realizada. Com base nesses dados, o
 * programadeve calcular e escreverovalordoingresso.
 */

public class Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type the total cost of the cast: ");
        double cast = scan.nextDouble();

        System.out.println("Type the total cost of the technicians: ");
        double technicians = scan.nextDouble();

        System.out.println("Type the total cost of the place: ");
        double place = scan.nextDouble();

        System.out.println("how many chairs does the place have?: ");
        int chairs = scan.nextInt();

        System.out.println("how much % do you want to earn? % ");
        double desireEarnings = scan.nextDouble();

        System.out.println("how much % of the chairs are occupied? ");
        double occupied = scan.nextDouble();

        System.out.println("how many shows do you want to perform? ");
        int shows = scan.nextInt();

        double show = cast + technicians + place;
        double achieveProfit = show * desireEarnings / 100;
        double revenueRequired = show + achieveProfit;
        double chairsTot = chairs * occupied / 100;
        double ticketPrice = revenueRequired / (chairsTot * shows);


        System.out.println("the ticket price is R$:" + ticketPrice);

    }
}
