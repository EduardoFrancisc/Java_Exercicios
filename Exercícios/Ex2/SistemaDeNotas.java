package Exercícios.Ex2;
import java.util.Scanner;
public class SistemaDeNotas {

    public static void main(String[] args){
        /*2- Escreva um programa que receba uma nota de um aluno e diga se ele foi aprovado, reprovado ou ficou de recuperação sendo: Nota 7 ou mais : Passou direto, Entre 5 e 6.9: Recuperação, Menor que 5: Reprovado.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma Nota: ");
        float nota = scanner.nextFloat();

            if(nota >= 7){
                System.out.println("Com a nota " + nota + " Passou direto" );
            }
            else if(nota < 7 & nota >= 5){
                System.out.println("Com a nota " + nota + " Recuperação" );
            }else{
                System.out.println("Com a nota " + nota + " Reprovado" );
            }

        scanner.close();
    }
}
