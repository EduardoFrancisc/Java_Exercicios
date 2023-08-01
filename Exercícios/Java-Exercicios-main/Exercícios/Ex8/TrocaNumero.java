package Exercícios.Ex8;
import java.util.Scanner;

public class TrocaNumero {
    public static void main(String[] args){

        //8 - Crie um programa que peça um número ao usuário e armazene ele na variável x. Depois peça outro número e armazene na variável y. Mostre esses números. Em seguida, faça com que x passe a ter o valor de y, e que y passe a ter o valor de x.

        Scanner scanner = new Scanner(System.in);
            int x, y, c;

            System.out.print("Digite um numero aleatório:");
            x = scanner.nextInt();
            System.out.print("Digite outro numero aleatório:");
            y = scanner.nextInt();

            System.out.println("x: " + x);
            System.out.println("y: " + y);

            c = x;
            x = y;
            y = c;

            System.out.println("novo x : " + x);
            System.out.print("novo y: " + y);

 
        scanner.close();

    }


}
