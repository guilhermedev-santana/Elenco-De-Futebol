public class Jogador {
    private String nome;
    private Integer numeroCamisa;
    private SituacaoEscalacaoEnum situacaoEscalacao;

    public Jogador(String nome, Integer numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(Integer numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public SituacaoEscalacaoEnum getSituacaoEscalacao() {
        return situacaoEscalacao;
    }

    public void setSituacaoEscalacao(SituacaoEscalacaoEnum situacaoEscalacao) {
        this.situacaoEscalacao = situacaoEscalacao;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", situacaoEscalacao=" + situacaoEscalacao +
                '}';
    }
}
