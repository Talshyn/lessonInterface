import Readers.Reader;
import Readers.TextReder;
import printer.AdvConsolePrinter;
import printer.ConsolePrinter;
import printer.IPrinter;

/**
 * Created by user on 14.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        Reader reader = new TextReder("Дома сидит");
        IPrinter printer = new ConsolePrinter();
        IPrinter printerAdv = new AdvConsolePrinter();
        Replacer replacer = new Replacer(reader,printer);
        Replacer replacer2 = new Replacer(reader,printerAdv);

       replacer.replace();
        replacer2.replace();

    }
}
