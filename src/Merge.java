public class Merge {
    public static Fila mergeFilas(Fila A, Fila B){
        Fila f = new Fila(A.dados.length + B.dados.length);//Cria uma nova fila de tamanho = soma dos tamanhos das duas filas

        while (!A.vazia() && !B.vazia()){
            if (A.primeiro() <= B.primeiro()){
                f.insere(A.remove());
            }else {
                f.insere(B.remove());
            }
        }
        while (!A.vazia()){
            f.insere(A.remove());
        }
        while (!B.vazia()){
            f.insere(B.remove());
        }

        return f;
    }
}
