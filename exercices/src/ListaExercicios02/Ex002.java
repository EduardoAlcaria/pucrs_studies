package ListaExercicios02;


import java.util.Scanner;

//Faça um programa que informe se o aluno está aprovado ou está em G2 ou foi
//reprovado.

public class Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("p1: ");
        double p1 = scan.nextDouble();
        System.out.println("p2: ");
        double p2 = scan.nextDouble();
        System.out.println("p3: ");
        double p3 = scan.nextDouble();
        System.out.println("E1");
        double e1 = scan.nextDouble();
        System.out.println("E2");
        double e2 = scan.nextDouble();
        System.out.println("TF");
        double tf = scan.nextDouble();

        double firstBestGradeAmongThreeEs = 0;
        double segBestGradeAmongThreeEs = 0;

        if (e1 >= e2 && e1 >= tf) {
            firstBestGradeAmongThreeEs = e1;
        }
        if (e2 >= e1 && e2 >= tf) {
            firstBestGradeAmongThreeEs = e1;
        }
        if (tf >= e1 && tf >= e2) {
            firstBestGradeAmongThreeEs = tf;
        }
        if (e1 >= e2 && e1 < tf) {
            segBestGradeAmongThreeEs = e1;
        }
        if (e2 >= e1 && e2 < tf) {
            segBestGradeAmongThreeEs = e2;
        }
        if (tf >= e1 && tf < e2) {
            segBestGradeAmongThreeEs = e2;
        }

        double mt = (firstBestGradeAmongThreeEs + segBestGradeAmongThreeEs) / 2;

        double g1 = (p1 + p2 + p3 + mt) / 4;

        System.out.println(firstBestGradeAmongThreeEs);
        System.out.println(segBestGradeAmongThreeEs);
        System.out.println(g1);
        if (g1 >= 7) {
            System.out.println("aprovado");
        }else if (g1 >= 5 && g1 < 7) {
            System.out.println("em g2");
        }else {
            System.out.println("reprovado");
        }

    }
}
