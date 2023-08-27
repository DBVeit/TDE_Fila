public class Fila {

    public int primeiro; //indice do primeiro elemento
    public int ultimo; //indice do ultimo elemento
    public int[] dados; //armazenamento de dados
    //private static int tamanho; //tamanho inicial da fila

    public Fila (int tamanho){
        this.primeiro = -1; //indice do primeiro elemento (startado em - 1)
        this.ultimo = -1; //indice do ultimo elemento (startado em - 1)
        this.dados = new int[tamanho]; // array dados[] para armazenar os elementos //o tamanho é usado como parametro para determinar a capacidade de armazenamento da fila (qtd de inteiros)
    }

    public boolean cheia(){
        int n = (dados.length) - 1;
        if (primeiro == 0 && ultimo == n || primeiro <= n && primeiro > ultimo){
            System.out.println("Fila cheia - PRECISA REMOVER!");
            return true;
        }else {
            return false;
        }
    }

    public boolean vazia(){
        if (primeiro == -1 && ultimo == -1){
            //System.out.println("Fila vazia - PODE INSERIR!");
            return true;
        }else {
            return false;
        }
    }

    public void insere(int E){
        if (!cheia()){
            if (vazia()){
                primeiro = 0;
            }
            ultimo++;
            dados[ultimo] = E;
        }else {
            System.out.println("Fila cheia!");
        }
    }

    public int remove(){
        if (!vazia()){
            int elementoRemovido = dados[primeiro];
            if (primeiro == ultimo){
                primeiro = -1;
                ultimo = -1;
            }else {
                primeiro++;
            }
            //System.out.println("Removendo elemento: " + elementoRemovido);
            return elementoRemovido;
        }else {
            System.out.println("Fila vazia - NÃO HÁ O QUE REMOVER!");
            return -1;
        }
    }

    public void imprime(){
        if (!vazia()){
            int i = primeiro;
            while (i != ultimo){
                System.out.println("Dados fila: " + dados[i] + " ");
                i++;
            }
            System.out.println("Dados fila: " + dados[i]);
        }else {
            System.out.println("Fila vazia - NÃO HÁ O QUE IMPRIMIR!");
        }
    }

    public int primeiro(){
        if(!vazia()){
            return dados[primeiro];
        }else {
            System.out.println("Fila vazia - NÃO HÁ PRIMEIRO ELEMENTO!");
            return -1;
        }
    }

}
