package EstruturaDeDados.ListaEncadeada;


public class ListaSimples{
    private No inicio;
    private int tamanho;

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

    public void inserirInicio(String info){
        No no = new No();
        no.setInfo(info);
        no.setProximo(inicio);
        inicio = no;
        this.tamanho++;

    }

    public String retirarInicio(){
        if(inicio == null){ // Se a lista estiver vazia não tem o que retirar
            return null;
        }
        String info = inicio.getInfo();
        inicio = inicio.getProximo();
        this.tamanho--;

        return info;
    }

    public void inserirFim(String info){
        No no = new No();
        no.setInfo(info);
        if(inicio == null){ // Se a lista estiver vazia o inicio vai apontar para o novo Nó, e o proximo do novo Nó será "NULL"
            no.setProximo(null);
            inicio = no;
        }else{
            No local = inicio; // O Nó local servirá como um auxiliar para eu saber em que lugar da lista eu estou
            while(local.getProximo() != null){ // Enquanto o proximo do Nó local for diferente de "NULL", ele continuará percorrendo a lista no loop. Quando o proximo do Nó locaol for igual a "NULL" significa que ele chegou no ultimo Nó(elemento) da lista.
                local = local.getProximo();
            }
            local.setProximo(no);
            no.setProximo(null);
        }
        tamanho++;
    }

    public String retirarFim(){
        if(inicio == null){ // Se o inicio for igual a "NULL" significa que ela está vazia
            return null;
        }
        No local = inicio;
        while(local.getProximo() != null){
            No aux = local;
            local = local.getProximo();

            if(local.getProximo() == null){
                aux.setProximo(null);
                this.tamanho--;
                return local.getInfo(); // Retorno o elemento aoagado
            }
        }
        inicio = null; // Se ouver só um elemento na lista ele ja retorna que o inicio é "NULL" direto, "apagando" o valor dentro dele
        this.tamanho--; // Diminuindo tamanho da lista
        return local.getInfo(); // Retorno a informação apagada
    }

    public void inserirIndice(int indice, String info){
        if(indice <= 0){
            inserirInicio(info);
        }else if(indice >= this.tamanho){
            inserirFim(info);
        } else{
            No local = inicio;
            for(int i = 0; i < indice -1; i++){
                local = local.getProximo();
            }
            No no = new No();
            no.setInfo(info);
            no.setProximo(local.getProximo());
            local.setProximo(no);
            this.tamanho ++;
        }
    }

    public String retirarIndice(int indice){
        if(indice < 0 // Indice menor que tamanho da lista
                || indice >= this.tamanho // Indice maior que tamanho
                || inicio == null){ // Lista vazia
            return null;
        } else if (indice == 0) { // Se o indice for igual a 0 significa que ele é o primeiro elemento, e já existe função prá isso
            return retirarInicio();
        } else if (indice == this.tamanho -1) { // Ultimo elemento
            return retirarFim();
        }
        No local = inicio;
        for(int i = 0; i < indice -1; i++){
            local.setProximo(local.getProximo());

        }
        String info = local.getProximo().getInfo();
        local.setProximo(local.getProximo().getProximo());
        this.tamanho--;
        return  info;

    }

    @Override
    public String toString(){
        String str = "{ " + this.tamanho + "} ";
        No local = inicio;
        while(local != null){
            str += local.getInfo() + " ";
            local = local.getProximo();
        }
        return str;
    }
}