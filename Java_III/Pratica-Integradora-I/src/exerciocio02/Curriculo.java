package exerciocio02;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Documento{

    private Pessoa pessoa;
    private List<String> habilidades = new ArrayList<>();

    public Curriculo(String descricaoDocumento, Pessoa pessoa, List<String> habilidades) {
        super(descricaoDocumento);
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "pessoa=" + pessoa +
                ", habilidades=" + habilidades +
                '}';
    }
}
