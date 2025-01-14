package cursoemvideo.aulas.java.poo;

public class Caneta {

    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando....");
        }
    }
    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " +this.ponta);
        if(tampada == true){System.out.println("Está tampada.");}
        else System.out.println("Não está tampada");}
}


