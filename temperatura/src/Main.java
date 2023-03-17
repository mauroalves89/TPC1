import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("insira a temperatura em Fahrenheit: ");
        double tempF = input.nextDouble();

        double tempC = converter(tempF);

        System.out.println(tempF + "°F é igual a " + tempC + "°C");
    }

    public static double converter(double tempF) {
        return (tempF - 32) * 5 / 9;
    }
}