package bridge;

public class Playstation implements IDispositivo{
    
    @Override
    public void playConteudo(String conteudo){
        System.out.println("Tocando " + conteudo + " no Playstation");
    }
    
}
