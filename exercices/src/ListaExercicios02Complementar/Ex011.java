package ListaExercicios02Complementar;
//11. Implemente um programa que leia a idade (em anos) e o peso (em kg) de
//uma criança. Sabendo que a tabela a seguir calcula a dosagem em mg
//(miligramas) de um determinado remédio para crianças com menos de 12
//anos, o programa deve calcular e escrever a dosagem, em gotas, que a
//criança deve receber conforme a sua idade (de acordo com tabela abaixo).
//Para resolver o problema, considere que para esse remédio cada 100 mg
//corresponde a 10 gotas. Só apresente a dosagem se os valores de entrada
//forem válidos.


import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Age of the child: ");
        int age = scanner.nextInt();

        if (age < 12){
            System.out.println("how many KG: ");
            double kg = scanner.nextDouble();

            int drops = 0;
            int mg = 0;
            if (kg >= 5 && kg <= 9){
                mg = 125;
                drops = 10;
            }
            if (kg >= 9.1 && kg <= 16){
                mg = 250;
                drops = 20;
            }
            if (kg >= 16.1 && kg <= 24){
                mg = 375;
                drops = 30;
            }
            if (kg >= 24.1 && kg <= 30){
                mg = 500;
                drops = 40;
            }
            if (kg > 30){
                mg = 750;
                drops = 50;
            }
            System.out.println("mgs" + mg);
            System.out.println("drops" + drops);
        }else{
            System.out.println("only give this remedy for children bellow 12");
        }


    }
}
