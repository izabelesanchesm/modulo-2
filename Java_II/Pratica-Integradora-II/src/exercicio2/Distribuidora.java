package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        List<ItemVenda> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(new ItemVenda(new Pereciveis("Leite", 4.3, 10),5));
        listaDeProdutos.add(new ItemVenda(new Pereciveis("Manteiga", 12.5, 15),2));
        listaDeProdutos.add(new ItemVenda(new Pereciveis("Suco de laranja", 20, 1),5));
        listaDeProdutos.add(new ItemVenda(new Pereciveis("Frango", 22, 3),4));
        listaDeProdutos.add(new ItemVenda(new Pereciveis("Café", 15, 2),1));

        listaDeProdutos.add(new ItemVenda(new NaoPereciveis("Sal", 5, "Alimento"),2));
        listaDeProdutos.add(new ItemVenda(new NaoPereciveis("Água", 2, "Alimento"),6));
        listaDeProdutos.add(new ItemVenda(new NaoPereciveis("Papel Higiênico", 4.3, "Limpeza"),2));
        listaDeProdutos.add(new ItemVenda(new NaoPereciveis("Sabonete", 4.3, "Limpeza"),1));
        listaDeProdutos.add(new ItemVenda(new NaoPereciveis("Toalha de mesa", 4.3, "Limpeza"),1));

        double total = 0;
        for (ItemVenda item : listaDeProdutos) {
            total += item.getProduto().calcular(item.getQuantidade());
        }

        System.out.println("O total da compra foi: " + total);

    }
}
