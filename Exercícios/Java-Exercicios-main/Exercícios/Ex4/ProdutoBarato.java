package Exercícios.Ex4;
import java.util.Scanner;

public class ProdutoBarato {
    public static void main(String[] args){
        
    /*4 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato*/
    
    Scanner scanner = new Scanner(System.in);
        double produto1, produto2, produto3, menorPreco = 0.0;
    
        System.out.println("Qual o preço do produto1:");
        System.out.println("Qual o preço do produto2:");
        
        produto1 = scanner.nextDouble();
        produto2 = scanner.nextDouble();
        
        menorPreco = produto1;

        if(produto2 < menorPreco){
            menorPreco = produto2;
        }
        System.out.println("Qual o preço do produto3:");
        produto3 = scanner.nextDouble();
        if(produto3<menorPreco){
            menorPreco = produto3;
            System.out.println("O menor preço é:" + menorPreco);
        }

    scanner.close();
    }
}
