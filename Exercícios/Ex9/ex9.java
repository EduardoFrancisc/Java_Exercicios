package Exercícios.Ex9;
import java.util.Scanner;

public class ex9 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
            int respostasSim = 0;

            System.out.println("Telefonou para a vitima?");
            char resposta = scanner.next().toUpperCase().charAt(0);
            if( resposta =='S') respostasSim++;

            System.out.println("“Esteve no local do crime?");
            char resposta1 = scanner.next().toUpperCase().charAt(0);
            if( resposta1 =='S') respostasSim++;

            System.out.println("“Mora perto da vítima?");
            char resposta2 = scanner.next().toUpperCase().charAt(0);
            if( resposta2 =='S') respostasSim++;

            System.out.println("Devia para a vítima?");
            char resposta3 = scanner.next().toUpperCase().charAt(0);
            if( resposta3 =='S') respostasSim++;

            System.out.println("Já trabalhou com a vítima?");
            char resposta4 = scanner.next().toUpperCase().charAt(0);
            if( resposta4 =='S') respostasSim++;

            /*. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“. Caso contrário, le será classificado como “Inocente“.*/

        scanner.close();

    }
    
}
