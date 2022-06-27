package teste;

public class Gerente extends Colaborador {

    public Gerente(String nome, Integer idade, Double salario, Integer grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public Double bonificacao() {
        return getSalario() + 1000 * getGrauInstrucao() * 2;
    }
}
