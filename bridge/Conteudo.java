package bridge;

public abstract class Conteudo{
    
    protected IDispositivo dispositivo;

    public Conteudo(IDispositivo dispositivo){
        this.dispositivo = dispositivo;
    }

    public abstract void play();
}