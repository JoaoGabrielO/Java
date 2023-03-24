import javax.swing.*;

public class Fila<T> {
    public Paciente[] elementos;
    public int tamanho;
    public int tamanhoEstrutura;

    public Fila(int capacidade){
        this.elementos = new Paciente[capacidade];
        this.tamanho = 0;
    }
    public Fila(){
        this(10);
    }


    public boolean adiciona(Paciente elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, Paciente elemento){
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        this.aumentaCapacidade();
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }
    public void enfileira(Paciente elemento){
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        this.adiciona(elemento);

    }
    public Paciente espiar(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[0];
    }
    public Paciente desenfileira(){
        if(this.estaVazia()){
            return null;
        }
        final int POS = 0;

        Paciente elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return  elementoASerRemovido;
    }
    public void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Paciente[] elementosNovos =  new Paciente[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

    public int tamanhoEstrutura(){
        this.tamanhoEstrutura = this.elementos.length;
        return this.tamanhoEstrutura;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho> 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public void remove(int posicao){
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i=posicao; i<tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho --;
    }
}