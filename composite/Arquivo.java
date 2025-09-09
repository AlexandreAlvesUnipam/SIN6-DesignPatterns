package composite;

public abstract class Arquivo{

    private String nome;
    private double tamanho;

    public Arquivo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public double getTamanho(){
        return this.tamanho;
    }

    public void add(Arquivo arquivo){
        System.out.println("Add da classe pai");
    }

    public void remove(Arquivo arquivo){
        System.out.println("Remove da classe pai");
    }

    public void getChild(Arquivo arquivo){
        System.out.println("Busca filho");
    }

    public abstract void mostraEstrutura(String idt);

}