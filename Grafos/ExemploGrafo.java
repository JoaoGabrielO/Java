package EstruturaDeDados.EstruturaDinamica.Grafos;

public class ExemploGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionaVertice("Paulo");
        grafo.adicionaVertice("Lorenzo");
        grafo.adicionaVertice("Cleuza");
        grafo.adicionaVertice("Kleber");
        grafo.adicionaVertice("Claudio");

        grafo.adicionarAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionarAresta(2.0, "Lorenzo", "Kleber");
        grafo.adicionarAresta(2.0, "Kleber", "Cleuza");
        grafo.adicionarAresta(2.0, "Paulo", "Cleuza");
        grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
        grafo.adicionarAresta(2.0, "Claudio", "Paulo");

        grafo.BuscaEmLargura();
    }
}
