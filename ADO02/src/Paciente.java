
public class Paciente<T> {
    private T nome, idade, sexo, indentificacao, senha;

    public Paciente() {
    }

    public Paciente(T nome, T idade, T sexo, T indentificacao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.indentificacao = indentificacao;
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public T getIdade() {
        return idade;
    }

    public void setIdade(T idade) {
        this.idade = idade;
    }

    public T getSexo() {
        return sexo;
    }

    public void setSexo(T sexo) {
        this.sexo = sexo;
    }

    public T getIndentificacao() {
        return indentificacao;
    }

    public void setIndentificacao(T indentificacao) {
        this.indentificacao = indentificacao;
    }

    public T getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = (T) senha;
    }

}