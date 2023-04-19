package EstruturaDeDados.EstruturaDinamica.Grafos;

import java.util.ArrayList;

public class Vertice<TIPO> {
    private TIPO dado; // tipo genérico que armazena o dado do vértice
    private ArrayList<Aresta<TIPO>> arestasEntrada; // lista de arestas que chegam ao vértice
    private ArrayList<Aresta<TIPO>> arestasSaida;  // lista de arestas que saem do vértice

    // construtor que inicializa o dado do vértice e as listas de arestas
    public Vertice(TIPO valor){
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>();
    }

    // getters e setters para o dado, lista de arestas de entrada e lista de arestas de saída
    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Aresta<TIPO>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }
    // métodos para adicionar arestas de entrada e saída na lista correspondente
    public void adicionarArestaEntrada(Aresta<TIPO> aresta){
        this.arestasEntrada.add(aresta);
    }
    public void adicionarArestaSaida(Aresta<TIPO> aresta){
        this.arestasSaida.add(aresta);
    }
}
