public class Main {
    public static void main(String[] args) {
        Fila fA = new Fila(4);
        fA.insere(12);
        fA.insere(35);
        fA.insere(52);
        fA.insere(64);

        Fila fB = new Fila(5);
        fB.insere(5);
        fB.insere(15);
        fB.insere(23);
        fB.insere(55);
        fB.insere(75);

        //fA.imprime();//Imprimir fila A
        //fB.imprime();//Imprimir fila B

        Fila filaF = Merge.mergeFilas(fA,fB);//Executa o Merge entre filas fA e fB

        filaF.imprime(); //Deve imprimir as filas fA e fB de forma ordenada

    }
}