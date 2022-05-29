public class Pessoas implements Comparable<Pessoas>{
    private String nome;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'';

    }

    public Pessoas(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public int compareTo(Pessoas pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }
}
