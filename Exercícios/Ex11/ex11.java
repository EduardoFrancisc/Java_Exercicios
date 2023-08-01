package Exercícios.Ex11;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        /*11 - Escreva um programa que pede os coeficientes de uma equação do segundo grau e exibe
as raízes, utilizando a fórmula de Bhaskara */
        Scanner scanner = new Scanner(System.in);
        int x1, x2;

        System.out.println("");
        System.out.println("a:");
        int a = scanner.nextInt();

        System.out.println("b:");
        int b = scanner.nextInt();

        System.out.println("c:");
        int c = scanner.nextInt();

        double delta = Math.pow(a, 2) - (4*a*c);

        if (delta == 0){
            System.out.println("Equação possui 1 raiz");
            x1 = (-b + (int)Math.sqrt(delta) /2*a);
            System.out.println("X1: "+x1);
        }else{
            System.out.println("2 raizes");
            x1 = (-b + (int)Math.sqrt(delta)/2*a);
            x2 = (-b - (int)Math.sqrt(delta)/2*a);
            System.out.println("X1: "+x1);
            System.out.println("X2: "+x2);
        }









        scanner.close();
    }
    
}
