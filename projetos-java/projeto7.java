import java.util.Scanner;

public class projeto7{
    public static void main(String[] args){
        Scanner contagem = new Scanner (System.in);

        System.out.println ("Digite um número.");
        int numero = contagem.nextInt();

        while(numero>=0){
            System.out.println (numero);
            numero--;
        }

        contagem.close();
    }
}