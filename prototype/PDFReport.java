package prototype;

public class PDFReport implements Report {
    
    public PDFReport(){
        System.out.println("Gerando relatório PDF...");
        this.getDados();
    }

    @Override
    public Report clone(){
        try{
            //Consulta como é utilizado na linguagem
            return (Report) super.clone();

        }catch(CloneNotSupportedException e){
            throw new RuntimeException("Erro ao clonar", e);
        }
    }

    // Operação que não queremos repetir
    public void getDados(){
        System.out.println("Buscando dados...");
        System.out.println("");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void generateReport(String nomeAluno, double[] notas){
        System.out.println("Gerando report PDF");
        System.out.println("Aluno: "+ nomeAluno + "");
        System.out.println("Notas: ");
        for(double n: notas){
            System.out.println(n + " ");
        }
        System.out.println("Exportanto para PDF...");
    }

}