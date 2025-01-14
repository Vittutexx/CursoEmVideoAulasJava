package cursoemvideo.aulas.java.basico;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valorIn = leitor.nextInt();

        int resto = (valorIn % 2);
        double elevadoCubo = Math.pow(valorIn, 3);
        double raiz = Math.sqrt(valorIn);
        double raizC = Math.cbrt((valorIn));
        double absoluto = Math.abs(valorIn);


        System.out.println("Resto da divisão por 2: " + resto);
        System.out.println("Elevado ao cubo: " + elevadoCubo);
        System.out.printf("Raiz quadrada: %.2f \n", raiz);
        System.out.printf("Raiz cúbica: %.2f \n", raizC);
        System.out.println("Valor absoluto: " + absoluto);


    }
}
