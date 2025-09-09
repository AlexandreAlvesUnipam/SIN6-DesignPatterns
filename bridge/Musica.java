package bridge;

public class Musica extends Conteudo{
    
    private String titulo;

    public Musica(String titulo, IDispositivo dispositivo){
        super(dispositivo);
        this.titulo = titulo;
    }

    @Override
    public void play(){
        dispositivo.playConteudo("Musica: " + this.titulo);
    }

}