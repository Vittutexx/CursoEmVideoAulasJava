package cursoemvideo.aulas.java.basico;

import java.time.LocalDate;
import java.util.Scanner;

public class VerificadorIdade {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Informe o seu ano de nascimento: ");
        int ano = leitor.nextInt();


        int idade = (LocalDate.now().getYear() - ano);

        String verificacao = ((idade >= 16 && idade > 18) ^ (idade > 70)) ? "Voto Obrigatório" : "Voto opcional";

        System.out.println(verificacao);
    }
}
