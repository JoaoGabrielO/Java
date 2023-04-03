package EstruturaDeDados.EstruturaEstatica.Pilha;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PilhaEstatica p = new PilhaEstatica(5);
        System.out.println("Tamanho: " + p.getTopo());

        String entrada = "";
        while(entrada.compareTo("sair") != 0){ // Quando a entrada for "sair" o compareTo retornará 0 porque as Strings são iguais e irá encerrar o loop
            System.out.print("Entrada: ");
            entrada = sc.nextLine();
            if(p.cheia()){
                System.out.println("Pilha cheia! Realocando...");
                p.aumentaTamanho(3);
            }
            if(entrada.compareTo("sair") != 0){
                p.inserir(entrada);
            }
        }
        // Enquanto eu não digitar "sair", não vai encerrar o loop
        String out; // Vou retirar um elemento da pilha e jogar dentro de "out"
        while ((out = p.retirar()) != null){ // Se ele for diferente de "null" significa que eu retirei um elemento da pilha, se for "null" significa que não tinha mais elemento pra retirar
            System.out.println("Retirando: " + out);
        }
        sc.close();
    }
}

