public class Main {
    public static void main(String[] args) {
        // Cria lógica de seleção entre Excel e PDF

        // Adaptado
        ExcelFormater excelFormater = new ExcelFormater();
        // Adaptador
        PDFFormater pdfFormater = new PDFFormater(excelFormater);

        pdfFormater.executaPDF();

    }
}