package prototype;

public interface Report extends Cloneable{

    Report clone();

    void generateReport(String nomeAluno, double[] notas);
}
