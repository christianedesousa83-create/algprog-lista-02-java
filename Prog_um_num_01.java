import java.util.Scanner;

public class Prog_um_num_01{
  
    public static void main(String[]args) {
       
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("\nDigite um número: ");

      int numero = entrada.nextInt();

      System.out.println("\nO número informado foi: " + numero);

      entrada.close();

    }
}
