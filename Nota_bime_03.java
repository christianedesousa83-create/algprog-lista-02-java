import java.util.Scanner;

public class Nota_bime_03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("\nDigite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("\nDigite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        System.out.print("\nDigite a quarta nota: ");
        double nota4 = entrada.nextDouble();

        double soma = nota1 + nota2 + nota3 + nota4;

        double media = soma / 4;

        System.out.println("\nA média é: " + media);

        entrada.close();
        
        

}

}
    
    
