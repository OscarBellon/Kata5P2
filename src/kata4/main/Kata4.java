package kata4.main;

import java.io.IOException;
import java.util.List;
import kata3.Histogram;
import kata3.HistogramDisplay;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    public static void main(String[] args) throws IOException {
        
        List<Mail> list = MailListReader.read("email.txt");
        Histogram histogram = MailHistogramBuilder.build(list);
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
