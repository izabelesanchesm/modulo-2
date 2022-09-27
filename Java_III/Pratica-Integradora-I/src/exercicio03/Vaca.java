package exercicio03;

public class Vaca extends Animal implements Herbivoro{

    public Vaca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Muu");
    }

    @Override
    public void comerPasto() {
        System.out.println("Vaca comendo pasto");
    }
}
