package supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Cliente 1", "Sobrenome 1");
        Cliente cliente2 = new Cliente(2, "Cliente 2", "Sobrenome 2");
        Cliente cliente3 = new Cliente(3, "Cliente 3", "Sobrenome 3");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.forEach(System.out::println);

        System.out.println("");
        clientes.remove(1);
        clientes.forEach(System.out::println);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do cliente para consultar: ");
        String idCliente = sc.nextLine();

        clientes.stream()
                .filter(c -> c.getId() == Integer.parseInt(idCliente))
                .forEach(System.out::println);

        sc.close();

    }
}
