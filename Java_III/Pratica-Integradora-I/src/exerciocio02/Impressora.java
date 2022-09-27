package exerciocio02;

public interface Impressora {
    public static void imprimir(Documento documento){
        System.out.println(documento.toString());
    };
}
