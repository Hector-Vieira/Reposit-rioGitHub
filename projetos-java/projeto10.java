import java.util.Scanner;

public class projeto10 {
    public static void main (String[] args){
        Scanner calculo = new Scanner (System.in);

        System.out.println("Quantos números você quer digitar?");
        int quantidade = calculo.nextInt();

        int soma = 0;
        int menor = Integer.MAX_VALUE;
        int maior =  Integer.MIN_VALUE;

        for (int i = 1; i <= quantidade; i++){

            System.out.println("Digite o " + i + "º numero.");
            int numero = calculo.nextInt();

            soma += numero;

            if (numero<menor) {
                menor = numero;
            } 
            if (numero>maior) {
                maior = numero;
            }
        }
         double media = (double) soma / quantidade;
            System.out.println("A soma dos números é: " + soma);

            System.out.println("A média dos números é: " + media);

            System.out.println("O menor número é: " + menor);

            System.out.println("O maior número é: " + maior);
            
        calculo.close();
    }

}
