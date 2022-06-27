import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura com ',': ");
        Double altura = scanner.nextDouble();
        System.out.print("Informe seu peso com ',': ");
        Double peso = scanner.nextDouble();

        Double imc = 0.0;

        imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Você está abaixo do peso!");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Você está com peso normal!");
        }
        else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Você está com sobrepeso!");
        }
        else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Você está com obesidade Grau I!");
        }
        else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Você está com obesidade Grau II!");
        }
        else if(imc >= 40.0){
            System.out.println("Você está com obesidade Grau III!");
        }

        scanner.close();
    }
}
