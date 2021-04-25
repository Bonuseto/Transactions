import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

class Solution {
    public String solution(String location) throws ParseException, IOException {

        Output output = new Output();
        File dir = new File(location);
        File[] files = dir.listFiles();
        //Fetching all files
        String outString = null;
        if (files != null) {
            for (File file : files) {

                if (file.isFile()) {
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        String line;
                        ArrayList<String> linesArray = new ArrayList<>();
                        while ((line = br.readLine()) != null) {
                            linesArray.add(line); //creating array of lines from file
                        }

                        ProcessArray array = new ProcessArray();

                        outString = output.print(array.processArray(linesArray));
                    }
                }
            }
        }
        return outString;
    }
}
