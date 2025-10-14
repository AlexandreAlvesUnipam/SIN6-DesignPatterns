package prototype;

public class HTMLReport implements Report{
    
    public HTMLReport(){
        System.out.println("Gerando relatório HTML...");
        this.getDados();
    }

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
        System.out.println("Gerando report HTML");
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<h1>Aluno: "+ nomeAluno + "</h1>");
        System.out.println("<p>Notas: ");
        for(double n: notas){
            System.out.println(n + " ");
        }
        System.out.println("</p>");
        System.out.println("</body>");
        System.out.println("</html>");
        System.out.println("Exportanto para HTML...");
    }

}