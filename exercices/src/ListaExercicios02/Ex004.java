package ListaExercicios02;
//Faça um programa que lê a altura de uma pessoa em metros e o seu sexo (use 1
//para feminino e 2 para masculino). A seguir, o programa deve escrever o peso ideal
//dessa pessoa conforme descrito: Para homens, use 72.7 x altura -58. Para
//mulheres, use 62.1 x altura -44.7


import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please inform your height: ");
        double h = scan.nextDouble();

        System.out.println("Please inform you sex, 1 for Female and 2 for Male: ");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                double wFem = 62.1 * h -44.7;
                System.out.println("your ideal weight as a woman is: " + wFem);
                break;
            case 2:
                double wMan = 72.7 * h -58;
                System.out.println("your ideal weight as a man is: " + wMan);
                break;
        }

    }
}
