package EstruturaDeDados.EstruturaDinamica.Fila;

public class No{
    private String info; // Corresponde ao elemento que será adicionado
    private No proximo; // Serve para apontar o proximo elemento abaixo do atual

    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return this.info;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo(){
        return this.proximo;
    }
}