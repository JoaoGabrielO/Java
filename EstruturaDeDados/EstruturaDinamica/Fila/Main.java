package EstruturaDeDados.EstruturaDinamica.Fila;

public class Main{
    public static void main(String []args){
        Fila f = new Fila();

        f.inserir("A");
        f.inserir("B");
        f.inserir("C");
        f.inserir("D");
        f.inserir("E");

        while(!f.vazia()){ //Enquanto ela for diferente de vazia irá retirar e imprimir os elementos retirados
            System.out.println(f.retirarElemento());
        }
    }
}