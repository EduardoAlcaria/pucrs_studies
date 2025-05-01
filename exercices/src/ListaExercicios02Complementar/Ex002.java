package ListaExercicios02Complementar;

import java.util.Scanner;

//Implemente um programa que leia um valor inteiro entre 1 e 7, correspondente ao dia da semana. O programa deve escrever o dia da semana por
//extenso correspondente ao valor lido. Por exemplo, se o usuário escrever
//1, o programa deve exibir Domingo.
public class Ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sunday = "Sunday";
        String monday = "Monday";
        String tuesday = "Tuesday";
        String wednesday = "Wednesday";
        String thursday = "Thursday";
        String friday = "Friday";
        String saturday = "Saturday";

        System.out.println("type an integer number within 1 and 7: ");
        int day = scanner.nextInt();

        if (day == 1) {
            System.out.println(sunday);
        }
        if (day == 2){
            System.out.println(monday);
        }

        if (day == 3){
            System.out.println(tuesday);
        }

        if (day == 4){
            System.out.println(wednesday);
        }

        if (day == 5)
            System.out.println(thursday);

        if (day == 6){
            System.out.println(friday);
        }

        if (day == 7){
            System.out.println(saturday);
        }

    }
}
