import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("o terceiro número: ");
        double num3 = scanner.nextDouble();

        double maior = determinaMaior(num1, num2, num3);

        if (num1 == num2 && num2 == num3) {
            System.out.println("Números não são distintos");
        } else {
            System.out.println("Maior número: " + maior);
        }
    }

    public static double determinaMaior(double num1, double num2, double num3) {
        double maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        return maior;
    }
}