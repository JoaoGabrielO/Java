package EstruturaDeDados.EstruturaDinamica.Grafos;

public class Aresta<TIPO> {
    private Double peso; // armazena o peso da aresta (opcional, pode ser null)
    private Vertice<TIPO> inicio;  // vértice de origem da aresta
    private Vertice<TIPO> fim; // vértice de destino da aresta

    // construtor que inicializa o peso, vértice de origem e vértice de destino da aresta
    public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    // getters e setters para o peso, vértice de origem e vértice de destino da aresta
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }
}
