package ListaExercicios01Complementar;

//2. Na ginástica olímpica, a nota de um atleta é a soma das notas de duas bancas de
//árbitros: banca A e banca B. A nota da banca A é a nota de partida do atleta. A nota da
//banca B é calculada da seguinte forma:
//(a) 6 juízes atribuem notas ao atleta;
//(b) a nota mais baixa e a mais alta são descartadas;
//(c) é feita a média das notas restantes.


import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A judges scores: ");
        double aJudges = scanner.nextDouble();

        System.out.println("1/6 B judges: ");
        double bJudges1 = scanner.nextDouble();

        System.out.println("2/6 B judges: ");
        double bJudges2 = scanner.nextDouble();

        System.out.println("3/6 B judges: ");
        double bJudges3 = scanner.nextDouble();

        System.out.println("4/6 B judges: ");
        double bJudges4 = scanner.nextDouble();

        System.out.println("5/6 B judges: ");
        double bJudges5 = scanner.nextDouble();

        System.out.println("6/6 B judges: ");
        double bJudges6 = scanner.nextDouble();


        double max = Math.max(bJudges1, Math.max(bJudges2, Math.max(bJudges3, Math.max(bJudges4, Math.max(bJudges5, bJudges6)))));
        double min = Math.min(bJudges1, Math.min(bJudges2, Math.min(bJudges3, Math.min(bJudges4, Math.min(bJudges5, bJudges6)))));


        double scoreB = ((bJudges1 + bJudges2 + bJudges3 + bJudges4 + bJudges5 + bJudges6)-(max + min))/4;


        System.out.println("Score of the A judges: " + aJudges);
        System.out.println("Score of the Bjudges: " + scoreB);



    }

}
