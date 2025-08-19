import java.util.Scanner;

public class projeto5{
    public static void main (String[] args){
        Scanner calculomedia = new Scanner (System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = calculomedia.nextInt();
        System.out.print("Digite a segunda nota: ");
        double nota2 = calculomedia.nextInt();
        System.out.print("Digite a terceira nota: ");
        double nota3 = calculomedia.nextInt();

        if ((nota1+nota2+nota3)/3>60){
            System.out.println("O aluno foi APROVADO.");
        } else if ((nota1+nota2+nota3)/3==60){
            System.out.println("O aluno foi APROVADO.");
        } else{
            System.out.println("O aluno foi REPROVADO.");
        }
        calculomedia.close();
    }
}