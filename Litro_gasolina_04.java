import java.util.Scanner;

public class Litro_gasolina_04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite o preço do litro da gasolina: ");
        double preco = Double.parseDouble(entrada.nextLine());

        System.out.print("\nDigite a quantidade de litros vendidos: ");
        double litros = Double.parseDouble(entrada.nextLine());

        double total = preco * litros;

        System.out.println("\nO valor a pagar é: R$ " + total);

       entrada.close();

    }
    
}
