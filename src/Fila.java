public class Fila {

    private static int primeiro; //indice do primeiro elemento
    private static int ultimo; //indice do ultimo elemento
    private static int[] dados; //armazenamento de dados
    //private static int tamanho; //tamanho inicial da fila

    public Fila (int capacidade){
        this.primeiro = -1; //indice do primeiro elemento (startado em - 1)
        this.ultimo = -1; //indice do ultimo elemento (startado em - 1)
        this.dados = new int[capacidade]; // array dados[] para armazenar os elementos
        //this.tamanho = dados.length;
    }

    public static boolean vazia(){
        if (primeiro == -1 && ultimo == -1){
            System.out.println("Fila vazia - PODE INSERIR!");
            return true;
        }else {
            //System.out.println("Fila não vazia");
            return false;
        }
    }

    public static boolean cheia(){
        int tamanho = dados.length;
        int n = tamanho-1;
        if (primeiro == 0 && ultimo == n || primeiro <= n && primeiro > ultimo){
        /*if (primeiro == (ultimo + 1) % dados.length){*/
            System.out.println("Fila cheia - PRECISA REMOVER!");
            return true;
        }else {
            //System.out.println("Fila não cheia");
            return false;
        }
    }

    public static void insere(char E){
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
            System.out.println("Removendo elemento: " + elementoRemovido);
            return elementoRemovido;
        }else {
            System.out.println("Fila vazia - NÃO HÁ O QUE REMOVER!");
            return -1;
        }
    }

    public static void imprime(){
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

}
