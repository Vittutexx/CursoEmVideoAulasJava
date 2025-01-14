package cursoemvideo.aulas.java.basico;

import java.util.Scanner;

public class Palpite {

    public static void main(String[] args) {

        System.out.println("Estou pensando num numero entre 1 a 5... \nTente acertar o numero que estou pensando.");

        //Entrada de dados
        Scanner leitor = new Scanner(System.in);

        //Criando o numero aleatório entre 1 a 5
        double nr =  1 + Math.random() * (6 - 1);

        //Variável para o usuario inputar o palpite
        double palpite = leitor.nextDouble();

        //Operador ternário que retorna se o usuario acertou ou não
        String resposta = ( nr == palpite) ? "Acertou" : "Errou";

        //Saída
        System.out.println(resposta);

    }
}
