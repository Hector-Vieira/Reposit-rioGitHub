import java.util.Scanner;

public class projeto9 {
    public static void main (String[] args){
        Scanner calculo = new Scanner (System.in);
        
        System.out.println("O resultado sairá quando você digitar 0.");
        System.out.println("Digite um numero.");

        int numero = calculo.nextInt();
        int soma = 0;
        int quantidade = 0;

        while (numero != 0){
            quantidade++;
            soma += numero;
            System.out.println("Digite outro número.");
            numero = calculo.nextInt();
        } if (quantidade > 0) {
            double media = (double)soma / quantidade;
            System.out.println("Quantidade de números:" + quantidade);
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        calculo.close();
    }
}