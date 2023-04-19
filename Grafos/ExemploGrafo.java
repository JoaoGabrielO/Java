package EstruturaDeDados.EstruturaDinamica.Grafos;

public class ExemploGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>(); // cria um objeto grafo com tipo String
        grafo.adicionaVertice("Paulo");
        grafo.adicionaVertice("Lorenzo");
        grafo.adicionaVertice("Cleuza");// adiciona um vértice com o valor "Cleuza"
        grafo.adicionaVertice("Kleber");
        grafo.adicionaVertice("Claudio");

        grafo.adicionarAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionarAresta(2.0, "Lorenzo", "Kleber"); // adiciona uma aresta com peso 2.0 entre "Lorenzo" e "Kleber"
        grafo.adicionarAresta(2.0, "Kleber", "Cleuza");
        grafo.adicionarAresta(2.0, "Paulo", "Cleuza");
        grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
        grafo.adicionarAresta(2.0, "Claudio", "Paulo");

        grafo.BuscaEmLargura(); // realiza a busca em largura a partir do primeiro vértice adicionado (neste caso, "Paulo")
    }
}
