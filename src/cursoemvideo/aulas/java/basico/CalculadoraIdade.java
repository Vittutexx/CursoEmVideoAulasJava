package cursoemvideo.aulas.java.basico;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculadoraIdade {

    public static void main(String[] args) {
        //Declaração de variáveis
        int data = LocalDate.now().getYear();
        Scanner leitor = new Scanner(System.in);


        //Entrada de dados
        System.out.print("Escreva o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Escreva o ano de nascimento");
        int an = leitor.nextInt();
        int idade = (data - an);

        //Saída de dados
        System.out.println(nome + ", você tem " + idade + " anos de idade.");

    }

}
