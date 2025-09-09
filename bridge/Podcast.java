package bridge;

public class Podcast extends Conteudo{
    
    private String nome;

    public Podcast(String nome, IDispositivo dispositivo){
        super(dispositivo);
        this.nome = nome;
    }

    @Override
    public void play(){
        dispositivo.playConteudo("Podcast: " + this.nome);
    }

}