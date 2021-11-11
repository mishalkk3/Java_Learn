package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PatternFinder {
    public List<Integer> find(File file, String pattern) {
        List<Integer> lineNumbers = new ArrayList<Integer>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            int lineNo = 1;
            String line;
            while ((line=br.readLine())!=null){
                if (line.contains(pattern)){
                    lineNumbers.add(lineNo);
                }
                lineNo++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lineNumbers;
    }
}
