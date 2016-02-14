package Readers;

import Readers.Reader;

/**
 * Created by user on 14.02.2016.
 */
public class TextReder implements Reader {
     String txt;
    public TextReder(String txt){
        this.txt = txt;
    }
    @Override
    public String read() {
        return txt;
    }
}
