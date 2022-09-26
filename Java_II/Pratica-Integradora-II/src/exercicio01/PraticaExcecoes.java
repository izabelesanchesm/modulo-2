package exercicio01;

public class PraticaExcecoes {

    public static void main(String[] args) {
        int a = 0;
        int b = 300;
        try {
            System.out.println(b / a);
        } catch (ArithmeticException e){
            //System.out.println("Ocorreu um erro");
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }

}
