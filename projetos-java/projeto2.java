import java.util.Scanner;

public class projeto2 {
    public static void main(String[] args){
        Scanner calculo = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = calculo.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = calculo.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);

        calculo.close();
    }
}