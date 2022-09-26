package exercicio2;

public class NaoPereciveis extends Produto{

    /*Crie a classe NaoPereciveis, ela terá um atributo chamado tipo que será uma
    String. Crie os setters, getters, construtor e método toString(); nesta classe o
    método calcular() fará exatamente o mesmo que na classe Produto.*/

    private String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Não Perecíveis - tipo: " + tipo;
    }

    public double calcular(int quantidadeDeProdutos){
        return super.calcular(quantidadeDeProdutos);
    }
}
