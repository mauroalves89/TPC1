import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double salario = readDouble("Por favor, insira seu salário: ");
        double percentualAumento = readDouble("Qual a percentagem do aumento?");

        double aumento = calcularAumento(salario, percentualAumento);

        System.out.println("Seu novo salário é: " + (salario + aumento));
    }

    public static double readDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double calcularAumento(double salario, double percentualAumento) {
        return salario * (percentualAumento / 100);
    }

}