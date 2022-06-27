package teste;

public class Principal {
 
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(123,"Douglas",1000.0);
        ContaPoupanca cp = new ContaPoupanca(123,"Douglas",1000.0);

       System.out.println("Rendimento conta corrente: R$ "+cc.rendimento()); 
       System.out.println("Rendimento conta poupança: R$ "+cp.rendimento()); 

    }
}
