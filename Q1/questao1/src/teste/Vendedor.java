package teste;

public class Vendedor extends Colaborador {

    public Vendedor(String nome, Integer idade, Double salario, Integer grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public Double bonificacao() {
        return getSalario() + 300 * getGrauInstrucao() * 4;
    }
}
