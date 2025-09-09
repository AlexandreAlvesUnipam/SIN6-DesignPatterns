package composite;

import java.util.ArrayList;

public class Diretorio extends Arquivo{
    
    // Permite a composição de objetos simples e compostos
    // Tipo "Arquivo" em comum
    private ArrayList<Arquivo> arquivos = new ArrayList<>();

    public Diretorio(String nome){
        super(nome);
    }

    public void add(Arquivo arquivo){
        arquivos.add(arquivo);
    }

    public void remove(Arquivo arquivo){
        arquivos.remove(arquivo);
    }

    public Arquivo getChild(int indice){
        return arquivos.get(indice);
    }

    public double getTamanho(){
        double tamanhoDiretorio = 0;

        for(Arquivo arquivo : arquivos){
            tamanhoDiretorio += arquivo.getTamanho();
        }

        return tamanhoDiretorio;
    }

    @Override
    public void mostraEstrutura(String idt){
        System.out.println(idt + "Diretório: " + this.getNome());
        for(Arquivo arquivo : arquivos){
            arquivo.mostraEstrutura(idt + "    ");
        }
    }

}
