package exercicio03;

public class Cachorro extends Animal implements Carnivoro{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Cachorro comendo carne");
    }
}
