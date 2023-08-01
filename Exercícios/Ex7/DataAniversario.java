package Exercícios.Ex7;
import java.util.Scanner;

public class DataAniversario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            short dia, mes, ano;
        
            //7 - Escreva um programa que pergunte o dia, mês e ano do aniversário de uma pessoa e diga se a data é válida ou não. Caso não seja, diga o motivo. Suponha que todos os meses tem 31 dias e que estejamos no ano de 2013.

                System.out.print("Qual o dia do seu Aniversário?");
                dia = scanner.nextShort();

                System.out.print("Qual o mês do seu Aniversário?");
                mes = scanner.nextShort();
                
                System.out.print("Qual o ano do seu Aniversário?");
                ano = scanner.nextShort();

                    if(dia > 31 | dia < 0){
                        System.out.print("Dia não válido: Maior que 31 ou menor que 0");
                    } else if(mes > 12 | mes < 0){
                        System.out.print("Mês não válido: Maior que 12 ou Menor que 0");
                    } else if(ano > 2023 | ano < 1900){
                        System.out.print("Ano não válido: Maior que 2013");
                    }else{
                        System.out.print("Sua Data de Aniversário: " + dia + "/" + mes + "/" + ano);
                    }

                
    
        scanner.close();
    }
}
