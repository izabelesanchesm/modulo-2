package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();
    private double totalCompra;

    public Fatura(Cliente cliente, List<Item> itens, double totalCompra) {
        this.cliente = cliente;
        this.itens = itens;
        this.totalCompra = totalCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public double getTotalCompra() {
        double total = 0;
        for (Item item : itens){
            total += item.getQuantidade() * item.getPreco();
        }
        return total;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", totalCompra=" + totalCompra +
                '}';
    }
}
