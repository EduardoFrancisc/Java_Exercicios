package Exercícios.Ex6;
import java.util.Scanner;

public class DoacaoDeSangue {
    public static void main(String[] args){
        
        //6 - Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.

        Scanner scanner = new Scanner(System.in);
            short idade;

            System.out.println("Qual sua idade?");
            idade = scanner.nextShort();

            if(idade >= 18 & idade <= 67){
                System.out.print("Você pode doar sangue");
            }else{
                System.out.print("Você não pode doar sangue");
            }
        scanner.close();
    }
}
