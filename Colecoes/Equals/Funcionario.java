package PI.Colecoes.Equals;

import java.util.Objects;

public class Funcionario {
    private String nome, fone;

    public Funcionario(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa){
            // Devemos fazer o cast do Object para Pessoa
            Funcionario f = (Funcionario) obj;

            if(this.getNome().equals(f.getNome()) && this.getFone().equals(f.getFone())){
                return true;
            }else{
                return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.fone.hashCode() + this.nome.hashCode();
    }
}
