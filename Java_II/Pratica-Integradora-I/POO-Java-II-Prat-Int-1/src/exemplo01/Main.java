package exemplo01;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoaConstrutorVazio = new Pessoa();
        Pessoa pessoaConstrutorParcial = new Pessoa("José", 18, "001");
        Pessoa pessoaConstrutorCompleto = new Pessoa("Maria", 24, "002", 70.4, 1.65);

        System.out.println(pessoaConstrutorCompleto.calcularIMC());
        System.out.println(pessoaConstrutorCompleto.ehMaiorIdade());
        System.out.println(pessoaConstrutorCompleto);
    }
}
