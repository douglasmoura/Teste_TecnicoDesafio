package teste;
public class Colaborador {
   
    private String nome;
    private Integer idade;
    private Double salario;
    private Integer grauInstrucao;

    public Colaborador(String nome, Integer idade, Double salario, Integer grauInstrucao) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.grauInstrucao = grauInstrucao;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Integer getGrauInstrucao() {
        return grauInstrucao;
    }
    public void setGrauInstrucao(Integer grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }
    

    public Double bonificacao(){
        return getSalario();
    }
}
