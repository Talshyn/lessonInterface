import Readers.Reader;
import printer.IPrinter;

/**
 * Created by user on 14.02.2016.
 */
public class Replacer {
    final Reader reader;
    final IPrinter printer;
    public Replacer( Reader reader,IPrinter printer){
        this.reader = reader;
        this.printer= printer;
    }
    public void replace(){
        String text = reader.read();
        String change = text.replace('о','а');
        printer.print(change);
    }
}
