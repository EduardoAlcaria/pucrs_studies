package ListaExercicios02Complementar;

//Faça um programa que leia o horário de inicio de um jogo, em horas
//e minutos, e o horário de fim desse jogo, também em hora e minutos.
//Sabendo que a duração máxima do jogo é de 24 horas, determine o tempo
//de duração do jogo em horas e minutos.

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which hour of the day the game has started? ");
        int hStart = scanner.nextInt();

        System.out.println("Which minute of the day the game has started? ");
        int mStart = scanner.nextInt();

        System.out.println("Which hour of the day the game has ended? ");
        int hEnd= scanner.nextInt();

        System.out.println("Which minute of the day the game has ended? ");
        int mEnd = scanner.nextInt();

        int gameEndedHour = hEnd - hStart;
        int gameEndedMin = mStart - mEnd;

        if (gameEndedHour <= 24 && gameEndedMin < 60){
            System.out.println("the game has and duration of " + gameEndedHour + ":" + Math.abs(gameEndedMin));
        }
        System.out.println("this is an invalid duration");

    }
}
