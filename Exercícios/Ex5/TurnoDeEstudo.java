package Exercícios.Ex5;
import java.util.Scanner;

public class TurnoDeEstudo {
    public static void main(String[] args){
        //5 - Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!” ou “Boa Noite” ou “Valor inválido”, conforme o caso.
        Scanner scanner = new Scanner(System.in);
            String turno;



            System.out.println("Em que Turno Você Estuda? (M-matutino | V-vespertino | N-noturno)");
            turno = scanner.next().toUpperCase();
            

            System.out.println(turno);

                if (turno.equals("M")) {
                    System.out.println("Bom Dia");
                }else if(turno.equals("V")) {
                    System.out.println("Boa Tarde");
                }else if (turno.equals("N")) {
                    System.out.println("Boa Noite");
                }else{
                    System.out.println("Valor Inválido");
                }
    
        scanner.close();
    }
}
