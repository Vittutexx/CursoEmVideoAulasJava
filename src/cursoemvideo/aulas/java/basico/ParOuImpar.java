package cursoemvideo.aulas.java.basico;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Escolha um numero: ");
        int numeroEscolhido = leitor.nextInt();

        int calculo = numeroEscolhido % 2;

        if (calculo == 0 ){
            System.out.println("Par");

        }else{
            System.out.println("Impar");
        }
    }
}
