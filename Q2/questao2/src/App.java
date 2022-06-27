import java.util.Scanner;

public class App {
   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o número: ");
    Integer numero = scanner.nextInt();
    
    String numeroString = String.valueOf(numero);
    String[] split = numeroString.split("(?<=.)");
    Integer contImpar = 0;
    
    while (true) {
        
        if (numero < 100){
            System.out.println("Informe um valor acima de 3 dígitos."); 
            System.out.print("Digite novamente: ");
            numero= scanner.nextInt();
            numeroString = String.valueOf(numero);
            split = numeroString.split("(?<=.)");
        }    
        
        if(numero < 350 || numero > 8750 )
        {
            System.out.println("A entrada deve estar entre 350 e 8750");
            System.out.print("Digite novamente: ");
            numero = scanner.nextInt();
            numeroString = String.valueOf(numero);
            split = numeroString.split("(?<=.)");
        }else {
            break;
        }
        
    }

    for (int i = 0; i < split.length; i++) {
            
        numero = Integer.parseInt(split[i]);
        if (numero % 2 != 0) {
            contImpar++;
        }
    }
    System.out.println("O número "+numeroString+" contém "+ contImpar+ " ímpares.");
    scanner.close();
   }
}
