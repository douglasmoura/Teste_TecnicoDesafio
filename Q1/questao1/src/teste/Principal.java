package teste;

public class Principal {
 
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Douglas",23,2000.0,3); 
        Supervisor supervisor = new Supervisor("Douglas",23,1500.0,2);
        Vendedor vendedor = new Vendedor("Douglas",23,1000.0,1);

        System.out.println("Gerente: "+gerente.bonificacao());
        System.out.println("Supervisor: "+supervisor.bonificacao());
        System.out.println("Vendedor: "+vendedor.bonificacao());
    }
}
