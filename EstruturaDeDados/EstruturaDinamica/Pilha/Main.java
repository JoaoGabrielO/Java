package EstruturaDeDados.EstruturaDinamica.Pilha;


class Main {
    public static void main(String[] args) {
        PilhaDinamica p = new PilhaDinamica();

        p.inserir("A");
        p.inserir("B");
        p.inserir("C");
        p.inserir("D");
        System.out.println("Retirar: " + p.retirar()); // Retirando ultimo elemento da pilha
        p.inserir("E");
        p.inserir("F");
        p.inserir("G");


        while(p.retirar() != null){ // Equanto isso for diferente de "NULL" significa que eu retirei elementos da pilha
            System.out.println("Retirar: " + p.retirar());
        }
    }
}