package Exercícios.Ex10;
import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args){

        /*10- Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
● Até 20 litros: desconto de 3% por litro
● Acima de 20 litros: Desconto de 5% por litro 99.
Gasolina:
● Até 20 litros: desconto de 4% por litro
● Acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
(codificado da seguinte forma: A-álcool. G-gasolina), calcule e imprima o valor a ser
pago pelo cliente.
Considere o Preço da Gasolina como 5 reais o litro, e o do Alcool como 4 reais o litro. */
        Scanner scanner = new Scanner(System.in);
        double pGasolina = 5.0, pAlcool = 4.0, valorTotal = 0.0, valorDesconto = 0.0;

        System.out.println("qual o tipo do combustivel? (G) - Gasolina | (A) - Alcool ");
        char tipoCombustivel = scanner.next().toUpperCase().charAt(0);
        System.out.println("quantidade de litros vendidos");
        double quantidadeDeLitros = scanner.nextDouble();

        if(tipoCombustivel == 'A'){
            valorTotal = quantidadeDeLitros * pAlcool;
            if(quantidadeDeLitros > 20){
                valorDesconto = valorTotal * 0.05;
            }else{
                valorDesconto = valorTotal * 0.03;
            }
        }else{
            valorTotal = quantidadeDeLitros*pGasolina;

            if(quantidadeDeLitros > 20){
                valorDesconto = valorTotal *0.06;
            }else{
                valorDesconto = valorTotal *0.04;
            }
        }

        System.out.println("valor total: " + valorTotal);
        System.out.println("valor desconto: " + valorDesconto);
        System.out.println("valor a ser pago: " + (valorTotal * valorDesconto));

        scanner.close();
    }
    
}
