package cursoemvideo.aulas.java.basico;

import java.time.LocalDate;
import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Escreva o ano do seu nascimento: ");
        int nasc = leitor.nextInt();
        int i = LocalDate.now().getYear() - nasc;

        System.out.println("Você tem " + i + " anos de idade");
        if (i < 16) {
            System.out.println("Não Vota");
        } else if ((i >= 16 && i < 18) || (i > 70)){
            System.out.println("Voto Opcional");
        } else{
            System.out.println("Voto Obrigatório");
        }
    }
}
