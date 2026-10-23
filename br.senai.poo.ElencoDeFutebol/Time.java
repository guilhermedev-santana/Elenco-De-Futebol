import java.util.ArrayList;

public class Time {
    private String nome;
    private String nomeTecnico;
    ArrayList<Jogador> listaJogadores = new ArrayList<>();
    ArrayList<Jogador> jogadoresEscalados = new ArrayList<>();

    public Time(String nome, String nomeTecnico) {
        this.nome = nome;
        this.nomeTecnico = nomeTecnico;
    }

    public void contratarJogador (String nome, Integer numeroCamisa){
        Jogador jogador = new Jogador(nome, numeroCamisa);
        listaJogadores.add(jogador);
    }
    public boolean escalarJogador (String nome, SituacaoEscalacaoEnum situacaoEscalacao){
        if(listaJogadores.isEmpty() || listaJogadores == null){
            System.out.println("Nenhum jogador Contratado!");
        }
        for(Jogador jogador : listaJogadores){
            if()
        }
    }
}
