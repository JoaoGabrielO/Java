package PI.Colecoes.Equals;

public class Pessoa {
    private String nome, RG;

    public Pessoa(String nome, String RG) {
        this.nome = nome;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa){
            // Devemos fazer o cast do Object para Pessoa
            Pessoa p = (Pessoa) obj;

            if(this.getNome().equals(p.getNome()) && this.getRG().equals(p.getRG())){
                return true;
            }else{
                return false;
            }
        }
        else {
            return false;
        }
    }
}
