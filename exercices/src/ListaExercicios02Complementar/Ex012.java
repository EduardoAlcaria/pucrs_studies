package ListaExercicios02Complementar;

//Escreva um programa que leia o valor corresponde à base de cálculo do
//Imposto de Renda, calcule e escreve o valor do imposto conforme a tabela
//Do IR (você pode pesquisar no google). Para calcular o valor do imposto,
//aplique a alíquota ao valor lido e desconte a parcela a deduzir
//correspondente. O cálculo deve ser feito com apenas duas casas decimais.

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("IR bases? ");
        double bases = scanner.nextDouble();

        double taxValue = 0;

        if (bases >= 2259.21 && bases < 2826.65){
            taxValue = bases * 0.075;
            System.out.printf("the tax value is: %.2f", taxValue);
        }
        if (bases >= 2826.65 && bases < 3751.05){
            taxValue = bases * 0.15;
            taxValue -= 381.44;
            System.out.printf("the tax value is: %.2f", taxValue);
        }
        if (bases >= 3751.05 && bases < 4664.68){
            taxValue = bases * 0.225;
            taxValue -= 662.77;
            System.out.printf("the tax value is: %.2f", taxValue);
        }
        if (bases > 4664.68){
            taxValue = bases * 0.275;
            taxValue -= 896;
            System.out.printf("the tax value is: %.2f ", taxValue);
        }
        if (bases < 2259.21){
            System.out.println("you dont need to pay IR");
        }
    }
}
