package prototype;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inicializando os protóipos...");
        ReportManager geradorDeRelatorios = new ReportManager();

        // Dados do aluno
        String nomeAluno1 = "John Doe";
        double[] notasDoe = {9, 9, 9, 9};

        String nomeAluno2 = "Frodo Bolseiro";
        double[] notasFrodo = {5, 6, 2, 4};
        
        // Usando o Cloneable, evitamos de executar o "new" e a operação pesada
        Report pdfDoe = geradorDeRelatorios.getNovoRelatorio("PDF");
        pdfDoe.generateReport(nomeAluno1, notasDoe);
        Report htmlDoe = geradorDeRelatorios.getNovoRelatorio("HTML");
        htmlDoe.generateReport(nomeAluno1, notasDoe);
        Report htmlDoe2 = geradorDeRelatorios.getNovoRelatorio("HTML");
        htmlDoe2.generateReport(nomeAluno1, notasDoe);
        Report htmlDoe3 = geradorDeRelatorios.getNovoRelatorio("HTML");
        htmlDoe3.generateReport(nomeAluno2, notasFrodo);
        Report htmlDoe4 = geradorDeRelatorios.getNovoRelatorio("HTML");
        htmlDoe4.generateReport(nomeAluno1, notasDoe);
        Report htmlDoe5 = geradorDeRelatorios.getNovoRelatorio("HTML");
        htmlDoe5.generateReport(nomeAluno1, notasDoe);
        Report htmlDoe6 = geradorDeRelatorios.getNovoRelatorio("HTML");
        htmlDoe6.generateReport(nomeAluno1, notasDoe);
    }
}