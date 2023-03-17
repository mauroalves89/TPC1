import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número total de crianças: ");
        int numCriancas = scanner.nextInt();

        System.out.print("o tamanho dos grupos: ");
        int tamanhoGrupo = scanner.nextInt();

        int numGrupos = numCriancas / tamanhoGrupo;
        int numSemGrupo = numCriancas % tamanhoGrupo;

        System.out.println("Número de grupos: " + numGrupos);
        System.out.println("Número de crianças sem grupo: " + numSemGrupo);
    }
}