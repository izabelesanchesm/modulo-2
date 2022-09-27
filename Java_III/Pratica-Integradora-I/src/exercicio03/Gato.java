package exercicio03;

public class Gato extends Animal implements Carnivoro{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Gato comendo carne");
    }
}
