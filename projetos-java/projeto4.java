import java.util.Scanner;
public class projeto4 {
    public static void main (String[] args){
        Scanner calculo = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int numero = calculo.nextInt();
        if (numero>0){
            System.out.println("O número " + numero + " é POSITIVO.");
        } else if (numero == 0){
            System.out.println("O número "+ numero +" é ZERO.");
        } else {
            System.out.println("O número " + numero + " é NEGATIVO.");
        }

        calculo.close();
    }   
}