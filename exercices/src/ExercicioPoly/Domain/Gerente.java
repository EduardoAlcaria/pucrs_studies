package ExercicioPoly.Domain;

public class Gerente extends Funcionario{
    private String setor;
    private double adicionalSalario;

    public Gerente(String nome, double salario, double desconto, String setor, double adicionalSalario) {
        super(nome, salario, desconto);
        this.setor = setor;
        this.adicionalSalario = adicionalSalario;
    }



    @Override
    public double calcImposto() {
        return calcSalario() * 0.1;
    }

    @Override
    public double calcSalario() {
        return super.calcSalario() + adicionalSalario;
    }

    @Override
    public String geraDescricao() {
        return super.geraDescricao();
    }
}
