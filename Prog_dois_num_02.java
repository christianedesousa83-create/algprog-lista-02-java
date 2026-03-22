import java.util.Scanner;

public class Prog_dois_num_02 {
    public static void main(String[] args) {
     
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("\nDigite o primeiro número: ");
      int num1 = entrada.nextInt();

      System.out.print("\nDigite o segundo número: ");
      int num2 = entrada.nextInt();

      int soma = num1 + num2;
      int subtracao = num1 - num2;
      int multiplicacao = num1 * num2;

      System.out.println("\nSoma: " + soma);
      System.out.println("\nSubtração: " + subtracao);
      System.out.println("\nMultiplicação: " + multiplicacao);

      entrada.close();




    }
    
}
