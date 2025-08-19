import java.util.Scanner;

public class projeto6{
   public static void main (String[] args){
    Scanner calculo = new Scanner (System.in);
    System.out.println("Digite um número: ");
    int numero = calculo.nextInt();

    for (int i = 1; i <= 10; i++){
        System.out.println(numero + "x" + i + "=" + (numero*i));
    }
    calculo.close();
    

   }
   
}