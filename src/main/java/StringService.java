public class StringService {

    public static String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }

    public static String cleanIt(String string) {
        String withWhiteSpaces = string;
        String wihtQuotes = withWhiteSpaces.trim();
        return wihtQuotes;
    }

    public static String reverseIt(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        string = String.valueOf(stringBuilder.reverse());
        return string;
    }
}
