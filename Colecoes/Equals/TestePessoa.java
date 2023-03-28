package PI.Colecoes.Equals;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jessica", "752");
        Pessoa p2 = new Pessoa("Jessica", "752");

        if(p1 == p2){
            System.out.println("p1 igual p2 com ==");
        }else{
            System.out.println("p1 != p2 com ==");
        }

        if(p1.equals(p2)){
            System.out.println("p1 igual p2 com equals da classe Object");
        }else{
            System.out.println("p1 != p2 com equals da classe Object");
        }

        System.out.println("Comparando com equals sobrescrito: " + p1.equals(p2));

    }
}
