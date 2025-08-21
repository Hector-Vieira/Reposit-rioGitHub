import java.util.ArrayList;
import java.util.Scanner;

public class projeto12 {
    public static void main (String[] args){
        Scanner calculo = new Scanner (System.in);
        System.out.println("Digite um número.");
        int numero = calculo.nextInt();

        ArrayList <Integer> numeros = new ArrayList<>();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        while (numero != 0) {
            System.out.println("Digite um número (0 para parar.)");
            numeros.add(numero);
            numero = calculo.nextInt();
        }
        for (int quantidade : numeros) {
            soma += quantidade;
            if (quantidade>maior) {
                maior = quantidade;
            }
            if (quantidade<menor) {
                menor = quantidade;
            }
        }
        for (int numerinhos : numeros) {
            System.out.println("");
            System.out.println("Tabuada do número " + numerinhos);
            for (int i = 1; i <= 10; i++){
                System.out.println(numerinhos + "x" + i +"=" + numerinhos*i);
            }
        }
        
        double media = (double)soma / numeros.size();
        System.out.println("A média dos números é:" + media);
        System.out.println("A soma dos números é:" + soma);
        System.out.println("O menor dos números é:" + menor);
        System.out.println("O maior dos números é:" + maior);

        calculo.close();
    }
}