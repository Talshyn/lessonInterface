/**
 * Created by user on 14.02.2016.
 */
public class Replacer {
    final Reader reader;
    public Replacer( Reader reader){
        this.reader = reader;
    }
    public String replace(){
        String text = reader.read();
        String change = text.replace('о','а');
        return change;
    }
}
