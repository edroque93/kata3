package kata3;

public class CalculateDomainHistogramControl {

    private String filename;

    public CalculateDomainHistogramControl(String filename) {
        this.filename = filename;
    }
    
    public void execute(){
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(MailReader.readDomains(filename));
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
}
