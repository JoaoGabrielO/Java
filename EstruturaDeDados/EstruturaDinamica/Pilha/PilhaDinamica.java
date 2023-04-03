package EstruturaDeDados.EstruturaDinamica.Pilha;


class PilhaDinamica {
    private No topo; // O topo vai funcionar como marcador, ele recebe o valor do ultimo elemento inserido na pilha
    private int tamanho;

    public PilhaDinamica(){
        this.tamanho = 0;
        this.topo = null; // O topo começa com zero, já que não tem valores inseridos ainda
    }
    public void setTopo(No topo){
        this.topo = topo;
    }
    public No getTopo(){
        return this.topo;
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public int getTamanho(){
        return this.tamanho;
    }

    public boolean vazia(){
        return this.topo == null; // Retornará "NULL", ou seja, a pilha está vazia, se o topo for igual "NULL"
    }

    public void inserir(String valor){// Conforme for empilhando o No.proximo vai apontando para o No de baixo(que contém os valores inseridos anteriormente)
        No no = new No();
        no.setInfo(valor);
        no.setProximo(this.topo); // Como o topo tem o valor do ultimo elemento inserido, assim que fomos inserir um novo, usaremos ele para atribuir o seu valor ao "NO.proximo"(já que o no.proximo aponta para o valor abaixo deste)
        setTopo(no);
        this.tamanho++;
        // Ao final o topo aponta para o ultimo elemento inserido, ou seja, o de cima(já que a pilha é inserida de baixo para cima)
    }

    public String retirar(){
        if(vazia()){ // Se estiver vazia não terá nada para retirar
            return null;
        }
        String info = topo.getInfo(); // Eu salvo o elemento atual que será apagado
        setTopo(topo.getProximo()); // O topo atual vai ser igual ao proximo elemento depois do topo, ou seja, o elemento de baixo.
        return info; // Eu retorno o elemento que foi apagado
    }
}