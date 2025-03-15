package ListaExercicios02;

/*
2) Faça um programa que informe se o aluno está aprovado ou está em G2 ou foi
reprovado.  G1 = (P1 + E + (2*P2) +TF)/5
 */


import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type the grade of your 1st exam: ");
        double p1 = scan.nextDouble();

        System.out.println("type the grade of your 2st exam: ");
        double p2 = scan.nextDouble();

        System.out.println("type the grade of your 1st work: ");
        double work1 = scan.nextDouble();

        System.out.println("type the grade of your 2nd work: ");
        double work2 = scan.nextDouble();

        System.out.println("type the grade of your 3th work: ");
        double work3 = scan.nextDouble();

        System.out.println("type the grade of your final work (TF): ");
        double tf = scan.nextDouble();



        double e = (work1 + work2 + work3) / 3;


        double g1 = (p1 + e + (2 * p2) + tf) / 5;

        double g2 = 0;
        if (g1 < 7){
            System.out.println("you are in G2");
            System.out.println("type the grade of the g2: ");
            g2 = scan.nextDouble();
        }
        double g2Final = (g1+g2) / 2;

        if (g1 >= 7 || g2Final >= 5) {
            System.out.println("you are approved");
        }else{
            System.out.println("you are reproved");
        }
        System.out.println("final grade: " + g1);

    }
}
