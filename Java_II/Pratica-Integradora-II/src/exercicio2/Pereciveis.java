package exercicio2;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return super.toString() + "Perecíveis - dias para vencer: " + diasParaVencer;
    }

    public double calcular(int quantidadeDeProdutos){
        if (diasParaVencer <= 3) {
            return super.calcular(quantidadeDeProdutos) / (5 - diasParaVencer);
        } else {
                return super.calcular(quantidadeDeProdutos);
        }
    }
}
