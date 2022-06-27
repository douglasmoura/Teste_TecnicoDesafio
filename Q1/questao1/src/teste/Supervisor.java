package teste;

public class Supervisor extends Colaborador {

    public Supervisor(String nome, Integer idade, Double salario, Integer grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public Double bonificacao() {
        return getSalario() + 500 * getGrauInstrucao() * 3;
    }
}
