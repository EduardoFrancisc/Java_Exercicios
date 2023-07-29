package Exercícios.Ex4;
import java.util.Scanner;

public class ProdutoBarato {
    public static void main(String[] args){
    /*4 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato*/
    
    Scanner scanner = new Scanner(System.in);
        double produto1, produto2, produto3;
    
        System.out.println("Quais os Precos dos Produtos?");
        produto1 = scanner.nextFloat();
        produto2 = scanner.nextFloat();
        produto3 = scanner.nextFloat();

        System.out.println("Preço do Produto1: "+produto1 + " Preço do Produto2: "+produto2 + " Preço do Produto3: "+produto3);

    scanner.close();
    }
}
