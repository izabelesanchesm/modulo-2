package exerciocio02;

import java.util.ArrayList;
import java.util.List;

public class DocumentoApp {
    public static void main(String[] args) {
        List<String> habilidades = new ArrayList<>();
        habilidades.add("Responsável");
        Curriculo curriculo = new Curriculo("Currículo Teste", new Pessoa("Paula", "123", "Rua A"), habilidades);
        Impressora.imprimir(curriculo);

        LivroPdf livro = new LivroPdf("Livro", 100, "Autor A", "Título A", "Romance");
        Impressora.imprimir(livro);

        Relatorio relatorio = new Relatorio("Relatório", "Relatório ABC", 5, "Fulano", "Outro fulano");
        Impressora.imprimir(relatorio);

    }
}
