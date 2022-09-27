package exercicio01;

public interface Transacao {
    public abstract void transacaoOK(String nomeTransacao);
    public abstract void transacaoNaoOK(String nomeTransacao);
}
