public class PDFFormater implements IPDFFormater{
    private ExcelFormater formatador;

    public PDFFormater(ExcelFormater formatadorExcel){
        this.formatador = formatadorExcel;
    }

    @Override
    public void extraiPlanilhaPDF(){
        System.out.println("Extraindo planilha do PDF...");
    }

    public void executaPDF(){
        this.extraiPlanilhaPDF();
        this.formatador.executa();
    }
}
