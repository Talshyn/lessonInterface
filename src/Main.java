/**
 * Created by user on 14.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        Reader reader = new TextReder("дома");
        IPrinter printer = new ConsolePrinter();
        Replacer replacer = new Replacer(reader);
       String result = replacer.replace();
        printer.print(result);
    }
}
