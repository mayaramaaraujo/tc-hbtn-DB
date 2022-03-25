public class Cliente {
    private String nome;
    private Integer idade;
    private String cpf;
    private String RG;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCPF() {
        return cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}
