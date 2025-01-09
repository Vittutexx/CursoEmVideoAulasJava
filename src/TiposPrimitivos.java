import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //Instanciando a classe Scanner para a leitura da entrada de dados
        Scanner leitor = new Scanner(System.in);

        //Criando o input para o nome do aluno
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        //Criando o input para a nota do aluno
        System.out.print("Digite sua nota: ");
        float nota = leitor.nextFloat();

        //Saída
        System.out.format("A nota de %s é: %.2f \n", nome, nota);
    }
}
