import java.util.Scanner;

public class projeto3 {
    public static void main (String[] args){
        Scanner calculo = new Scanner (System.in);

        System.out.println("Digite o número: ");
        int numero = calculo.nextInt();

        if(numero % 2 == 0){
            System.out.println("o número " + numero + "é: PAR.");
        } else{
            System.out.println("O número " + numero + " é: ÍMPAR.");
        }
        calculo.close();
    }
}