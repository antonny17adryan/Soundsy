package soundsy.projeto;
public abstract class Pessoas {
    private String Nome;
    private String Sexo;

    public Pessoas(String Nome, String Sexo) {
        this.Nome = Nome;
        this.Sexo = Sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    
}
