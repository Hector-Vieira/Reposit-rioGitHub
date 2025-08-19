import java.util.Scanner;

public class projeto8 {
    public static void main (String[] args){
        Scanner calculo = new Scanner(System.in);

        System.out.println("Digite um número.");

        int numero = -1;
        int soma = 0;

        while (numero!=0) {
            System.out.println("Digite 0 para parar.");
            numero = calculo.nextInt();

            if (numero!=0) {
                soma += numero;
            }
        }

        System.out.println("O valor da soma é:" + soma);

        calculo.close();
    }
    
}
