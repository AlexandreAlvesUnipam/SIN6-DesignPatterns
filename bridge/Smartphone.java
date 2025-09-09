package bridge;

public class Smartphone implements IDispositivo{
    
    @Override
    public void playConteudo(String conteudo){
        System.out.println("Tocando " + conteudo + " no Android");
    }

}