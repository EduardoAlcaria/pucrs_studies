package ExercicioPoly.Tests;

import ExercicioPoly.Domain.Equipe;
import ExercicioPoly.Domain.Funcionario;
import ExercicioPoly.Domain.Gerente;

import java.util.Scanner;

public class Aplicacao {

    private Equipe equipe;

    public Aplicacao() {
        equipe = new Equipe();
    }

    public void inicializa() {
        Funcionario f1 = new Gerente("Eduardo", 1500, 200, "desenvolvimento", 300);
        Funcionario f2 = new Gerente("Lucas", 2500, 100, "desenvolvimento", 1000);

        equipe.addFuncionario(f1);
        equipe.addFuncionario(f2);

    }

    public void executa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome da pessoa");
        String name = scanner.nextLine();
        while (true) {
            System.out.println("Escolha uma das opções: ");
            System.out.println("[1] consulta o nome [2] consulta o salario por nome");
            int choice = scanner.nextInt();
            if (choice == 1) {
                consultaNome(name);
                break;
            } else if (choice == 2) {
                consultaSalarioPorNome(name);
                break;
            } else {
                System.out.println("opção invalida");
            }
        }


    }

    private void consultaNome(String name) {
        Funcionario f = equipe.pesquisaNome(name);
        if (f != null){
            System.out.println("O funcionario(a) " + f.getNome() + " trabalha aqui");
        }else{
            System.out.println("O funcionario(a) " + name + " não trabalha aqui");
        }
    }

    private void consultaSalarioPorNome(String name) {
        double f = equipe.pesquisaSalario(name);
        System.out.println("O funcionario(a) " + name + " ganha " + f + "$");
    }
}
