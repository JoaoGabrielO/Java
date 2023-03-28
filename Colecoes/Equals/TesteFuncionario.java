package PI.Colecoes.Equals;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", "1121313");
        Funcionario f2 = new Funcionario("Joao", "1121313");

        if (f1.equals(f2)) {
            System.out.println("f1 igual f2");
            System.out.println("HashCode f1: " + f1.hashCode());
            System.out.println("HashCode f2: " + f2.hashCode());
        }else{
            System.out.println("f1 diferente f2");
            System.out.println("HashCode f1: " + f1.hashCode());
            System.out.println("HashCode f2: " + f2.hashCode());
        }
    }
}
