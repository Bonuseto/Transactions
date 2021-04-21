import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ProcessArray {

    public static ArrayList<Transaction> processArray(ArrayList<String> array) throws ParseException {

        ArrayList<Transaction> transactionsArrayList = new ArrayList<>();
        ArrayList<String> providersArrayList = new ArrayList<>();

        int i = 0;
        for (String line : array) {
            Transaction transaction = new Transaction();

            line = StringUtils.reverse(line);//reversing line so we can split it from end
            String[] splitString = line.split("([,/])", 4);

            //transforming date String to Date object
            String time = StringUtils.reverse(splitString[0].trim());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
            Date date = format.parse(time);

            //assigning properties
            transaction.setPhone(StringUtils.reverse(StringUtils.clean(splitString[1])));
            transaction.setProvider(StringUtils.reverse(StringUtils.clean(splitString[2])));
            transaction.setNote(StringUtils.reverse(StringUtils.clean(splitString[3])));
            transaction.setId(i);
            transaction.setDate(date);

            transactionsArrayList.add(transaction);

            //creating list of providers that will help us to assign correct count number
            providersArrayList.add(StringUtils.reverse(StringUtils.clean(splitString[2])));
            i++;
        }

        return CountArrayItems.countItems(transactionsArrayList, providersArrayList);
    }
}
