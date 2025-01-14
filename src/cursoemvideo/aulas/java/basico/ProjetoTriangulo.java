package cursoemvideo.aulas.java.basico;

import java.util.Scanner;

public class ProjetoTriangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o lado A do Triângulo: ");
        int ladoA = leitor.nextInt();
        System.out.print("Digite o lado B do Triângulo: ");
        int ladoB = leitor.nextInt();
        System.out.print("Digite o lado C do Triângulo: ");
        int ladoC = leitor.nextInt();

        String tipo;

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            System.out.println("Formam um Triângulo");

            if (ladoA == ladoB && ladoB == ladoC){
                tipo = "Equilátero";
            } else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC){
                tipo = "Escaleno";
            } else {
                tipo = "Isósceles";
            }

            System.out.println("Triangulo " + tipo);

        } else {
            System.out.println("Não formam um Triângulo");
            tipo = "-------";
        }

    }
}
