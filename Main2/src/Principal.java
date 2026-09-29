import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu cpf: ");
        String cpf = scanner.nextLine();

        double salarioBase = scanner.nextDouble();
    }
}