public class StringUtils {

    //adding 0 to count if needed
    public static String padLeftZeros(String inputString, double length) {
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

    //cleaning String from double quotes and whitespaces
    public static String clean(String string) {
        String withWhiteSpaces = string.replaceAll("\"", "");
        return withWhiteSpaces.trim();
    }

    //reversing String
    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        return String.valueOf(stringBuilder.reverse());
    }
}
