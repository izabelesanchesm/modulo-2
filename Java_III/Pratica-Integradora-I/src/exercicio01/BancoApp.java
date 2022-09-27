package exercicio01;

public class BancoApp {
    public static void main(String[] args) {
        Executivo executivo = new Executivo();
        executivo.depositar(15.9);
        executivo.transacaoNaoOK("Depositar");
        executivo.transferir(50.5);
        executivo.transacaoOK("Transferência");

        Basico basico = new Basico();
        basico.consultarSaldo();
        basico.transacaoOK("Consultar saldo");
        basico.pagarServicos();
        basico.transacaoOK("Pagar serviço");
        basico.sacarEmDinheiro(18.00);
        basico.transacaoNaoOK("Sacar em dinheiro");

        Colaborador colaborador = new Colaborador();
        colaborador.sacarEmDinheiro(150.6);
        colaborador.transacaoNaoOK("Sacar me dinheiro");
        colaborador.consultarSaldo();
        colaborador.transacaoOK("Consulta de saldo");

    }
}
