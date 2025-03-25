import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int random = (int) (Math.random() * 100) + 1;
        int numeroSelecionado;

        System.out.println(" ");
        System.out.println("Eu escolhi um número aleatório entre 1 e 100. Tente adivinhar qual eu escolhi!");
        System.out.println("Escolha um número de 1 a 100.");
        numeroSelecionado = scanner.nextInt();

        while (numeroSelecionado != random) {

            if (numeroSelecionado < random) {
                System.out.println("Tente um número maior!");
                numeroSelecionado = scanner.nextInt();
            }
            else {
                System.out.println("Tente um número menor!");
                numeroSelecionado = scanner.nextInt();
            }
        }
        if (numeroSelecionado == random) {
            System.out.println("O número que eu escolhi era o " + random + ". Você acertou, parabéns!");
        }
        scanner.close();
    }
}