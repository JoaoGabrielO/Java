package EstruturaDeDados.ADO02;

public class Paciente {
    private String nome, idade, sexo;
    private int indentificacao;

    public Paciente() {
    }

    public Paciente(String nome, String idade, String sexo, int indentificacao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.indentificacao = indentificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIndentificacao() {
        return indentificacao;
    }

    public void setIndentificacao(int indentificacao) {
        this.indentificacao = indentificacao;
    }
}
