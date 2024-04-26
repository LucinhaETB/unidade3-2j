package unidade3;
import java.util.Scanner;
// declaração da classe
public class Monitor {
    // declaração dos atributos
    int tamanho;
    String resolucao;
    String marca;
    String modelo;
    int frequencia;
    double preco;
    //metodo para mostrar as informações
    void exibirInfo () {// void é um metodo que não retorna valor
        System.out.println("Informações do Monitor");
        System.out.println("Marca: " + marca);
        System.out.println(" Modelo: " + modelo);
        System.out.println("tamanho: " + tamanho);
        System.out.println(" resolução: " + resolucao);
        System.out.println("frequencia: " + frequencia);
        System.out.println("preço: " + preco);
        // para solicitar informações eu preciso importar o Scanner, daí incluo lá encima
    }
    void solicitarInfo(){
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite a marca do monitor: ");
        marca = leia.nextLine();
        System.out.println(" Digite o modelo: ");
        modelo = leia.nextLine();
        System.out.println(" Digite a frequencia: ");
        frequencia = leia.nextInt();
        System.out.println(" Digite o preço: ");
        preco = leia.nextDouble();
    }
}
