package cursoemvideo.aulas.java.basico;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor de a: ");
        int a = leitor.nextInt();
        System.out.print("Insira o valor de b: ");
        double b = leitor.nextInt();
        System.out.print("Insira o valor de c: ");
        int c = leitor.nextInt();

        double delta = Math.pow(b, 2) -4 * a * c;
        System.out.println("Valor de delta: " + delta);

        if (delta < 0 ){
            System.out.println("Não existem raízes reais");
        } else {
            System.out.println("Existem raízes reais");
        }

    }
}
