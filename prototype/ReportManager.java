package prototype;

import java.util.HashMap;
import java.util.Map;

public class ReportManager {
    
    private Map<String, Report> prototiposDeRelatorio = new HashMap<>();

    public ReportManager(){

        prototiposDeRelatorio.put("PDF", new PDFReport());
        prototiposDeRelatorio.put("HTML", new HTMLReport());

    }

    public Report getNovoRelatorio(String tipoRelatorio){
        // Faz um clone do protótipo existente
        return prototiposDeRelatorio.get(tipoRelatorio).clone();
    }

}