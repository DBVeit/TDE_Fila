public class Main {
    public static void main(String[] args) {
        Fila f = new Fila(5);

        f.insere('A');
        f.insere('B');
        f.insere('C');

        f.imprime(); // Deve imprimir A B C

        f.remove();

        f.imprime(); // Deve imprimir B C
    }
}