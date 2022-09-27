package exercicio01;

public class Executivo implements Deposito, Transferencia{

    public Executivo() {
    }

    @Override
    public void depositar(double valor) {

        System.out.println("Executivo: Realizando deposito de " + valor);
    }

    @Override
    public void transacaoOK(String nomeTransacao) {
        System.out.println("Executivo: transação " + nomeTransacao + " OK");
    }

    @Override
    public void transacaoNaoOK(String nomeTransacao) {
        System.out.println("Executivo: transação " + nomeTransacao +" Não OK");
    }

    @Override
    public void transferir(double valorTransferencia) {
        System.out.println("Executivo: Realizando transferência de " + valorTransferencia);
    }
}
