import java.util.ArrayList;
import java.util.Scanner;

public class projeto11 {
    public static void main (String[] args){
        Scanner calculo = new Scanner(System.in);
        ArrayList <Integer> notas = new ArrayList <>();

        System.out.println("Digite uma nota.");
        int nota = calculo.nextInt();
        
        while (nota != -1){
            notas.add(nota);
            System.out.println("Digite outra nota para continuar (-1 para parar)");
            nota = calculo.nextInt();
        }

        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int n : notas){
            soma += n;
            if (n > maior) maior = n;
            if (n < menor) menor = n;
        } 
        if (notas.size() > 0) {
            double media = (double) soma / notas.size();
            System.out.println("A soma dos números é: " + soma);
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
            System.out.println("A média dos números é: " + media);
            System.out.println("A quantidade dos números é: " + notas.size());
        }
        calculo.close();
    }
}
