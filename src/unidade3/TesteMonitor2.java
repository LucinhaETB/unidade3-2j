
package unidade3;

public class TesteMonitor2 {

    public static void main(String[] args) {
   //declarando objeto m
        Monitor m = new Monitor ();
        //modificando o estado do objeto m
        m.frequencia = 60;
        m.marca ="LG";
        m.modelo = "LW60q";
        m.resolucao = "FullHD";
        m.tamanho = 21;
        m.preco = 600;
        m.exibirInfo();
    }

}
