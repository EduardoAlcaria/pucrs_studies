package ListaComplemetar;

/*
  2. Na ginástica olímpica, a nota de um atleta é a soma das notas de duas bancas de
  árbitros: banca A e banca B. A nota da banca A é a nota de partida do atleta. A nota da
  banca B é calculada da seguinte forma:
  (a) 6 juízes atribuem notas ao atleta;
  (b) a nota mais baixa e a mais alta são descartadas;
  (c) é feita a média das notas restantes.
 */

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        double judge1B, judge2B, judge3B, judge4B, judge5B, judge6B;

        double fixA = 10;

        double max;
        double min;

        double totalScore;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1st score for the B judges: ");
        judge1B = scanner.nextInt();

        System.out.println("2nd score for the B judges: ");
        judge2B = scanner.nextInt();

        max = Math.max(judge1B, judge2B);
        min = Math.min(judge1B, judge2B);

        System.out.println("3th score for the B judges: ");
        judge3B = scanner.nextInt();

        max = Math.max(max, judge3B);
        min = Math.min(min, judge3B);

        System.out.println("1st score for the B judges: ");
        judge4B = scanner.nextInt();

        max = Math.max(max, judge4B);
        min = Math.min(min, judge4B);

        System.out.println("2nd score for the B judges: ");
        judge5B = scanner.nextInt();

        max = Math.max(max, judge5B);
        min = Math.min(min, judge5B);

        System.out.println("3th score for the B judges: ");
        judge6B = scanner.nextInt();

        max = Math.max(max, judge6B);
        min = Math.min(min, judge6B);

        scanner.close();

        totalScore = (judge1B + judge2B + judge3B + judge4B + judge5B + judge6B) - max - min;

        double finalScore = (totalScore / 4) + fixA;
        System.out.println("max over: " + max);
        System.out.println("min over: " + min);
        System.out.println(totalScore);
        System.out.println(finalScore);

    }
}
