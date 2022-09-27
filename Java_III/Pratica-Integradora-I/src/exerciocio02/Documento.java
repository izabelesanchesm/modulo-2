package exerciocio02;

public abstract class Documento {
    private String descricaoDocumento;

    public Documento(String descricaoDocumento) {
        this.descricaoDocumento = descricaoDocumento;
    }

    public String getDescricaoDocumento() {
        return descricaoDocumento;
    }

    public void setDescricaoDocumento(String descricaoDocumento) {
        this.descricaoDocumento = descricaoDocumento;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "descricaoDocumento='" + descricaoDocumento + '\'' +
                '}';
    }
}
