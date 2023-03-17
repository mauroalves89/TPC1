import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a hora (entre 1 e 12): ");
        int hours = input.nextInt();
        System.out.print("Digite os minutos: ");
        int minutes = input.nextInt();

        String horaEmPortugues = getTimeName(hours, minutes);

        System.out.println("Hora em português: " + horaEmPortugues);
    }

    public static String getTimeName(int hours, int minutes) {
        String hora = "";

        if (minutes == 0) {
            hora = getHourName(hours) + " em ponto";
        } else if (minutes < 30) {
            hora = "Passam " + minutes + " minutos das " + getHourName(hours);
        } else if (minutes == 30) {
            hora = "Meia " + getHourName(hours + 1);
        } else {
            hora = "Faltam " + (60 - minutes) + " minutos para as " + getHourName(hours + 1);
        }

        return hora;
    }

    public static String getHourName(int hours) {
        String[] horas = {"meia-noite", "uma", "duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "meio-dia"};
        return horas[hours % 12];
    }
}