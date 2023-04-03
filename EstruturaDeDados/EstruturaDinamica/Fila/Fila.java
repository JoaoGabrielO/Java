package EstruturaDeDados.EstruturaDinamica.Fila;

public class Fila{
    private No cabeca, inicio;
    private int tamanho;

    public Fila(){
        cabeca = null;
        inicio = null;
        tamanho = 0;
    }

    String verificaCabeca(){
        if(cabeca == null){
            return null;
        }
        return cabeca.getInfo();
    }

    public No getCabeca() {
        return cabeca;
    }

    public void setCabeca(No cabeca) {
        this.cabeca = cabeca;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean vazia(){
        return this.tamanho == 0; // Se o tamanho for igual a "0" significa que ela esta vazia
    }

    public void inserir(String info){
        No no = new No(); // Ele vai acrescentando a fila de forma descrecente, o primeiro objeto(Nó) inserido ja é inserido na "ultima posição". Assim sendo, o proximo nó inserido apontará para o proximo(inicio), que foi inserido anteriormente.
        // 3Nó --> 2Nó --> 1Nó --> Inicio da Fila
        no.setInfo(info);
        no.setProximo(inicio);
        inicio = no;
        if(this.tamanho == 0){
            this.cabeca = no;
        }
        this.tamanho++;
    }
    public String retirarElemento(){
        if(vazia()){
            return null; // Se estiver vazia não terá nada a retirar
        }
        String info = this.cabeca.getInfo(); // Eu salvo a informação que esta na cabeça(que é o primeiro nó inserido, porém o ultimo na ordem de impressão)
        // Cabeça aqui é igual a "1No"
        if(this.tamanho == 1){ // Se só ouver um elemento cabeca e inicio receberão "NULL", zerando a fila
            inicio = null;
            cabeca = null;
        }else{
            No local = getInicio(); // Inicio é o ultimo Nó que eu inserir("3Nó"), porém na ordem de impressão ele será o primeiro
            while(local.getProximo() != cabeca){ // Eu comparo o elemento que vem depois do Nó local(que começa como o primeiro elemento "3Nó") com o valor da cabeça(que é o ultimo elemento (1Nó)), enquanto ele não for igual eu não irei sair do loop.
                local = local.getProximo(); // Então eu vou atribuindo o Nó local ao proximo Nó, até chegar na cabeça
                // local = "3Nó" vai passar a ser igual a local.proximo = "2Nó", e assim por diante
            }
            cabeca = local; // Quando o proximo elemento(local.proximo) for igual a cabeca, a cabeca passará a ter o valor do local atual e o proximo elemento depois de cabeca(cabeca.proximo) receberá "NULL", ou seja, será apagado
            cabeca.setProximo(null); // Neste caso:
            // local é igual a "2Nó"
            // local.proximo é igual a "1Nó" e cabeca também é igual a "1Nó" que é o ultimo elemento
            // Então cabeca passará a ser igual a "2Nó" e cabeca.proximo será "NULL"
        }
        tamanho--;
        return info;
    }
}