package unidade3;
import java.util.Scanner;
// declara��o da classe
public class Monitor {
    // declara��o dos atributos
    int tamanho;
    String resolucao;
    String marca;
    String modelo;
    int frequencia;
    double preco;
    //metodo para mostrar as informa��es
    void exibirInfo () {// void � um metodo que n�o retorna valor
        System.out.println("Informa��es do Monitor");
        System.out.println("Marca: " + marca);
        System.out.println(" Modelo: " + modelo);
        System.out.println("tamanho: " + tamanho);
        System.out.println(" resolu��o: " + resolucao);
        System.out.println("frequencia: " + frequencia);
        System.out.println("pre�o: " + preco);
        // para solicitar informa��es eu preciso importar o Scanner, da� incluo l� encima
    }
    void solicitarInfo(){
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite a marca do monitor: ");
        marca = leia.nextLine();
        System.out.println(" Digite o modelo: ");
        modelo = leia.nextLine();
        System.out.println(" Digite a frequencia: ");
        frequencia = leia.nextInt();
        System.out.println(" Digite o pre�o: ");
        preco = leia.nextDouble();
    }
}
