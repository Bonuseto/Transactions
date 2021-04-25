import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Solution solution = new Solution();
        String result = solution.solution(args[0]);
        System.out.println(result);
    }
}
