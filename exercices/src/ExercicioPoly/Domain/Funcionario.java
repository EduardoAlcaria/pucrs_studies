package ExercicioPoly.Domain;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private double desconto;

    public Funcionario(String nome, double salario, double desconto) {
        this.nome = nome;
        this.salario = salario;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double calcSalario(){
        return salario - desconto;
    }

    public abstract double calcImposto();

    public String geraDescricao(){
        return nome + " " + salario;
    }

}
