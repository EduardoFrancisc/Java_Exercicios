package Exercícios.Ex3;
import java.util.Scanner;

public class Circunferencia {
    
    //3 - Escreva um programa que receba o raio de uma circunferência e mostre o diâmetro, o comprimento e a área desta.

    public static void Calculos( double raio){

        double Dia, Com, Are;

            Dia = 2*raio;
            Com = 2*(Math.PI*raio);
            Are = Math.PI*Math.pow(raio, 2);

            System.out.println("O Diâmetro da Circunferência é: "+Dia);
            System.out.println("O Comprimento da Circunferência é: "+Com);
            System.out.println("A Área da Circunferência é: "+Are);
    };

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o Raio da Circunferência: ");
            double raio = scanner.nextDouble();
            Calculos(raio);

            scanner.close();
    }
}
