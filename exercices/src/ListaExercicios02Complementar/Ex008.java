package ListaExercicios02Complementar;

//Agora, implemente um programa que leia 4 valores reais (n1, n2, n3 e n4)
//e escreva os valores lidos em ordem crescente.

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n1: ");
        double n1 = scanner.nextDouble();

        System.out.println("n2: ");
        double n2 = scanner.nextDouble();

        System.out.println("n3: ");
        double n3 = scanner.nextDouble();

        System.out.println("n4: ");
        double n4 = scanner.nextDouble();

        double min = Math.min(Math.min(n1, n2), Math.min(n3, n4));

        double max = Math.max(Math.max(n1, n2), Math.max(n3, n4));

        double pos2 = max;
        double pos3 = min;

        if (n1 != min && n1 < pos2) pos2 = n1;
        if (n2 != min && n2 < pos2) pos2 = n2;
        if (n3 != min && n3 < pos2) pos2 = n3;
        if (n4 != min && n4 < pos2) pos2 = n4;

        if (n1 != max && n1 > pos3) pos3 = n1;
        if (n2 != max && n2 > pos3) pos3 = n2;
        if (n3 != max && n3 > pos3) pos3 = n3;
        if (n4 != max && n4 > pos3) pos3 = n4;


        System.out.println(min + " " + pos2 + " " + pos3 + " " + max);



    }

}
