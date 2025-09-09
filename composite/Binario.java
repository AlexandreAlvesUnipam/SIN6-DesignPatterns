package composite;

public class Binario extends Arquivo{
    
    private double tamanho; // KB

    public Binario(String nome, double tamanho){
        super(nome);
        this.tamanho = tamanho;
    }

    public double getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }

    @Override
    public void mostraEstrutura(String idt){
        System.out.println(idt + "Binário: " + getNome());
    }

}

