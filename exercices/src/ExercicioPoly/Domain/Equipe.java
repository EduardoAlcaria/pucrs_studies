package ExercicioPoly.Domain;


import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Funcionario> funcionarioList;

    public Equipe() {
        funcionarioList = new ArrayList<>();
    }

    public boolean addFuncionario(Funcionario f) {
       return funcionarioList.add(f);
    }

    public Funcionario pesquisaNome(String nome){
        for (Funcionario funcionario : funcionarioList) {
            if (funcionario.getNome().equals(nome)){
                return funcionario;
            }
        }
        return null;
    }

    public double pesquisaSalario(String nome){
        for (Funcionario funcionario : funcionarioList) {
            if (funcionario.getNome().equals(nome)){
                return funcionario.calcSalario();
            }
        }
        return 0;
    }

}
