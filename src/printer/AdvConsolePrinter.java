package printer;

/**
 * Created by user on 14.02.2016.
 */
public class AdvConsolePrinter implements IPrinter {
    @Override
    public void print(String str) {
        System.out.println(str);
        System.out.println(String.format("string's length = %d",str.length()));
    }
}
