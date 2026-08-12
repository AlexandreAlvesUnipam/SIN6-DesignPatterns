class Configuracao {

    public String nomeAplicacao;
    public String ambiente;
    public String urlBanco;
    public int porta;

}

class SistemaPagamento {
    private Configuracao configuracao;
    public SistemaPagamento(Configuracao configuracao) {
        this.configuracao = configuracao;
    }
    
    public Configuracao getConfig(){
        return this.configuracao;
    }
}

class SistemaRelatorios {
    private Configuracao configuracao;
    public SistemaRelatorios(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

    public Configuracao getConfig(){
        return this.configuracao;
    }
}

public class Atividade {

    public static void main(String[] args) {
        
        Configuracao config1 = new Configuracao();
        Configuracao config2 = new Configuracao();
        SistemaPagamento pagamento = new SistemaPagamento(config1);

        SistemaRelatorios relatorios = new SistemaRelatorios(config2);
    }
}