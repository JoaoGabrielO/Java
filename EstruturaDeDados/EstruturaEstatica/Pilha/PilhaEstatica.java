package EstruturaDeDados.EstruturaEstatica.Pilha;


public class PilhaEstatica{
    private String vetor[]; // Pilha/ Vetor
    private int topo; // Marcação do topo da pilha, referencia para saber quantos elementos existem nela, ou em qual posição esta.

    public PilhaEstatica(int tamanho){
        this.vetor = new String[tamanho]; // Definindo o tamanho de acordo com o que o usuario pediu
        this.topo = 0; // Topo começa vazio porque não tem elemento nenhum
    }

    public void aumentaTamanho(int tamanho){
        String vetor2[] = new String[this.vetor.length + tamanho];
        for(int i = 0; i < this.vetor.length; i++){
            vetor2[i] = this.vetor[i];
        }
        this.vetor = vetor2;
    }
    public boolean cheia(){
        return vetor.length == topo; // Se o topo for equivalente ao tamanho do vetor irá retornar true(Está cheia)
    }

    public boolean vazia(){
        return topo == 0; // Se o topo for igual a 0 quer dizer que a pilha esta vazia, sem elemento
    }

    public boolean inserir(String valor){
        if(cheia()) {
            return false;
        } // Se a pilha não estiver cheia, vai adicionar o elemento na posição do "topo"
        vetor[topo] = valor;
        topo ++; // Com o elemento sendo adicionado, o topo passa a ser a proxima posição(que esta vazia)
        return true; // Elemento foi inserido com sucesso
    }

    public String retirar(){
        if(vazia()) { // Se a pilha estiver vazia retornará NULL (Pois a entrada é do tipo String)
            return null;
        }
        topo--; // Decrementa o topo para que ele aponte para o elemento abaixo, dando a impressão de que o elemento acima foi apagado, mas ele continua lá. Porém na proxima vez que um elemento for adicionado ele acrescentará o proximo elemento no lugar do que ficou em cima.

        return vetor[topo]; // Retorna o ultimo elemento da Pilha após o topo ser decrementado.

        // Exemplo Visual:
        // Pilha
        // 5 <-- topo= 4 -- O topo esta apontando para o ultimo elemento, ele esta no indice 4 do vetor
        // 4
        // 3
        // 2
        // 1
        // O comando print irá mostrar o número 5

        // topo--; -- Comando topo-- e inserido
        // Pilha
        // 5
        // 4 <-- topo= 3 -- O topo agora esta apontado para o elemento debaixo, dando a impressão de que o de cima foi apagado e este agora é o ultimo elemento(porém o de cima ainda esta lá e será apenas SOBRESCRITO futuramente), o topo esta no indice 3 do vetor
        // 3
        // 2
        // 1
        // O comando printi irá mostrar o número 4
    }

    public String[] getVetor() {
        return vetor;
    }

    public void setVetor(String[] vetor) {
        this.vetor = vetor;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }
}