package exercicio01;

public class Basico implements ConsultaDeSaldo, PagamentoDeServicos, SaqueEmDinheiro{

    public Basico() {
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Básico: Consultando Saldo.");
    }

    @Override
    public void pagarServicos() {
        System.out.println("Básico: Pagando Serviço");
    }

    @Override
    public void sacarEmDinheiro(double valor) {
        System.out.println("Básico: Sacando em Dinheiro a quantia de " + valor);
    }

    @Override
    public void transacaoOK(String nomeTransacao) {
        System.out.println("Básico: " + nomeTransacao + " OK");
    }

    @Override
    public void transacaoNaoOK(String nomeTransacao) {
        System.out.println("Básico: Transação " + nomeTransacao + " Não OK");
    }
}
