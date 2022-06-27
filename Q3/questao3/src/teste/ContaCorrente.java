package teste;

public class ContaCorrente extends Conta{

    public ContaCorrente(Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public Double rendimento(){
        return (getSaldo() * 0.05) - 0.75;
     }

}

    

