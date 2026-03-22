import java.util.Scanner;

public class Valor_viagem_05 {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite o preço da viagem para Alemanha: ");
        double precoAlemanha = Double.parseDouble(entrada.nextLine());

        System.out.print("\nDigite a quantidade de pessoas para Alemanha: ");
        int pessoasAlemanha = Integer.parseInt(entrada.nextLine());

        System.out.print("\nDigite o preço da viagem para Portugal: ");
        double precoPortugal = Double.parseDouble(entrada.nextLine());

        System.out.print("\nDigite a quantidade de pessoas para Portuga: ");
        int pessoasPortugal = Integer.parseInt(entrada.nextLine());

        System.out.print("\nDigite o preço da viagem para Itália: ");
        double precoItalia = Double.parseDouble(entrada.nextLine());

        System.out.print("\nDigite a quantidade de pessoas para Itália: ");
        int pessoasItalia = Integer.parseInt(entrada.nextLine());

        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        double totalGeral = totalAlemanha + totalPortugal + totalItalia;

        System.out.println("\nO valor total da Eurotrip é R$ " + totalGeral);

        entrada.close();
    }
    
}
