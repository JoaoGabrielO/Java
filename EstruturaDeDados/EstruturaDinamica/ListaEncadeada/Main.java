package EstruturaDeDados.ListaEncadeada;


public class Main {
    public static void main(String [] args){
       ListaSimples l = new ListaSimples();

        System.out.println(l);
        l.inserirInicio("A");
        System.out.println(l);
        l.inserirInicio("B");
        System.out.println(l);
        l.inserirInicio("C");
        System.out.println(l);
        l.inserirInicio("D");
        System.out.println(l);

        l.inserirFim("E");
        System.out.println(l);
        l.inserirFim("F");
        System.out.println(l);
        l.inserirFim("G");
        System.out.println(l);
        l.inserirFim("H");
        System.out.println(l);

        l.inserirIndice(1,"X");

        while(l.retirarInicio() != null){ // Enquanto "l.retirarInicio" for diferente de "NULL" eu vou imprimir na tela, ou seja, até eu retirar e imprimir todos os elementos
            System.out.println(l);
        }
        while(l.retirarFim() != null){ // Enquanto "l.retirarInicio" for diferente de "NULL" eu vou imprimir na tela, ou seja, até eu retirar e imprimir todos os elementos
            System.out.println(l);
        }
    }
}