package cursoemvideo.aulas.java.basico;

import java.util.Scanner;

public class TipoAnimal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String tipo;

        System.out.println("Quantas pernas o animal possui?");
        int pernas = leitor.nextInt();
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Isso é um(a) " + tipo);

    }

}
