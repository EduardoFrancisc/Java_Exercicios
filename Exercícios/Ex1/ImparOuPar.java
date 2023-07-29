package Exercícios.Ex1;
import java.util.Scanner;
public class ImparOuPar {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um numero inteiro");
            int entrada = scanner.nextInt();

                if (entrada % 2 == 0) {
                    System.out.println("O numero " + entrada + " é par");
                }else{
                    System.out.println("O numero " + entrada + " é impar");
                }
        }
    }
}

