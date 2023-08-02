package Exercícios.Ex12;
import java.util.Scanner;

public class SomRaio {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*O som viaja aproximadamente 1.100 pés por segundo através do ar. Assim, conhecer o intervalo entre o tempo em que você vê um raio e o tempo em que o som chega, permite calcular a distância até o raio. Para este projeto, suponha que o intervalo de tempo seja de 7,2 segundos.*/

        /* 
        double dist, temp;

        System.out.println("Qual foi o intervalo entre o tempo em que você viu o raio e o tempo em que o som chegou?");
        temp = in.nextDouble();

        dist = temp * 1100;
        System.out.println("O relâmpago está a " + dist + " pés de você");
        */

        /*Modifique o programa anterior para calcular a distância, assumindo que o intervalo de tempo seja o de um eco.*/

        double dist, temp;

        System.out.println("Qual foi o intervalo entre a ida e volta do eco?");
        temp = in.nextDouble();

        dist = (temp/2) * 1100;
        System.out.println("O objeto está a " + dist + " pés de você");

        in.close();
    }
    
}
