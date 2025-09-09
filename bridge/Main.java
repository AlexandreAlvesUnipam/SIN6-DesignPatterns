package bridge;

public class Main {
    public static void main(String[] args) {
        
        IDispositivo android = new Smartphone();
        IDispositivo playstation = new Playstation();

        Conteudo musica = new Musica("Jump", android);
        Conteudo musicaOutra = new Musica("Amor", playstation);
        Conteudo pod = new Podcast("Unipam news", android);
        
        pod.play();
    }
}