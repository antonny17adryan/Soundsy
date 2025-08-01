package Classes;

public class Usuario extends Pessoas {
    private String login;
    private String senha;

    public Usuario(String login, String senha, String Nome, String Sexo) {
        super(Nome, Sexo);
        this.login = login;
        this.senha = senha;
    }

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
