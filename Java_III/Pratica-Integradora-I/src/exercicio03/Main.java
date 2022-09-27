package exercicio03;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob", 2);
        cachorro.emitirSom();
        cachorro.comerCarne();

        Gato gato = new Gato("Fred", 1);
        gato.emitirSom();
        gato.comerCarne();

        Vaca vaca = new Vaca("Sol", 5);
        vaca.emitirSom();
        vaca.comerPasto();
    }
}
