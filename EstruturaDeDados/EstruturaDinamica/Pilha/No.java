package EstruturaDeDados.EstruturaDinamica.Pilha;

public class No{
    private String info; // Corresponde ao elemento que será adicionado
    private No proximo; // Serve para apontar o proximo elemento abaixo do atual

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}