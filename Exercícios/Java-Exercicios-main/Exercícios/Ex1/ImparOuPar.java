package Exercícios.Ex1;
import java.util.Scanner;
public class ImparOuPar {
    public static void main(String[] args){

        //1 - Escreva um programa que receba um inteiro do teclado e imprima se ele é par ou ímpar.

        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um numero inteiro");
            int entrada = scanner.nextInt();

                if (entrada % 2 == 0) {
                        System.out.println("O Numero " + entrada + " é par");
                }else{
                        System.out.println("O Numero " + entrada + " é ímpar");
                }
            scanner.close();
    }
}

