package ListaComplemetar;

import java.util.Arrays;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        double judge1B, judge2B, judge3B;
        double judge4B, judge5B, judge6B;

        double fixA = 10;

        double totalScore = 0;

        double[] scores;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1st score for the A judges: ");
        judge1B = scanner.nextInt();

        System.out.println("2nd score for the A judges: ");
        judge2B = scanner.nextInt();

        System.out.println("3th score for the A judges: ");
        judge3B = scanner.nextInt();

        System.out.println("1st score for the B judges: ");
        judge4B = scanner.nextInt();

        System.out.println("2nd score for the B judges: ");
        judge5B = scanner.nextInt();

        System.out.println("3th score for the B judges: ");
        judge6B = scanner.nextInt();

        scanner.close();

        scores = new double[]{judge1B, judge2B, judge3B, judge4B, judge5B, judge6B};
        Arrays.sort(scores);

        double min = scores[0];
        double max = scores[5];


        for (int i = 1; i < 5; i++) {
            totalScore += scores[i];
        }

        double finalScore = (totalScore / 4) + fixA;
        System.out.println("max over: " + max);
        System.out.println("min over: " + min);
        System.out.println(totalScore);
        System.out.println(finalScore);

    }
}
