package EstruturaDeDados.ADO02;


public class Paciente {
    private String nome, idade, sexo, indentificacao;

    public Paciente() {
    }

    public Paciente(String nome, String idade, String sexo, String indentificacao) {
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

    public String getIndentificacao() {
        return indentificacao;
    }

    public void setIndentificacao(String indentificacao) {
        this.indentificacao = indentificacao;
    }
}
