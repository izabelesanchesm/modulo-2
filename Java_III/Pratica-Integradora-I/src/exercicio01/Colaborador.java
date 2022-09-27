package exercicio01;

public class Colaborador implements SaqueEmDinheiro, ConsultaDeSaldo{

    public Colaborador() {

    }

    @Override
    public void consultarSaldo() {
        System.out.println("Colaborador: Consultando Saldo");
    }

    @Override
    public void sacarEmDinheiro(double valor) {
        System.out.println("Colaborador: Sacando em Dinheiro o valor de " + valor);
    }

    @Override
    public void transacaoOK(String nomeTransacao) {
        System.out.println("Colaborador: Transação " + nomeTransacao + " OK");
    }

    @Override
    public void transacaoNaoOK(String nomeTransacao) {
        System.out.println("Colaborador: Transação " + nomeTransacao + " Não OK");
    }
}
