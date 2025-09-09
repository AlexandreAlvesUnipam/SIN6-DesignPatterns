package composite;

public class Main {
    public static void main(String[] args) {
        
        Arquivo bin1 = new Binario("Bin1", 5);
        Arquivo bin2 = new Binario("Bin2", 3);
        Arquivo bin3 = new Binario("Bin3", 1);

        Arquivo diretorio1 = new Diretorio("Diretório 1");
        Arquivo diretorio2 = new Diretorio("Diretório 2");

        diretorio1.add(bin1);
        diretorio1.add(bin2);
        diretorio1.add(diretorio2);
        diretorio2.add(bin3);

        diretorio2.mostraEstrutura("");

        System.out.println("Tamanho total da " + diretorio1.getNome()
            + ": " + diretorio1.getTamanho());

    }
}


