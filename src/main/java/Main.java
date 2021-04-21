import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        File dir = new File("D:\\Files\\");//reading all files from directory
        File[] files = dir.listFiles();
        //Fetching all files
        if (files != null) {
            for (File file : files) {

                if (file.isFile()) {
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        String line;
                        ArrayList<String> linesArray = new ArrayList<>();
                        while ((line = br.readLine()) != null) {
                            linesArray.add(line); //creating array of lines from file
                        }

                        Output.print(ProcessArray.processArray(linesArray));//processing array of lines and printing result
                    }
                }
            }
        }
    }
}
