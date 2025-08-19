public class ExcelFormater implements IExcelFormater{
    
    @Override
    public void formatarColunas(){
        System.out.println("Col A, Col b, Col C ....");
    }

    @Override
    public void formatarLinhas(){
        System.out.println("Formatando linhas...");
    }

    @Override
    public void formatarEstilo(){
        System.out.println("Adiciona logo do cliente");
    }

    public void executa(){
        // Extrair do PDF a planilha
        // Adaptador irá criar novo método que irá adaptar essa operação
        this.formatarColunas();
        this.formatarLinhas();
        this.formatarEstilo();
    }
}
