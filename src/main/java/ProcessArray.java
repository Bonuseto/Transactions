import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ProcessArray {

    StringUtils stringUtils = new StringUtils();
    CountArrayItems countArrayItems = new CountArrayItems();

    public List<Transaction> processArray(List<String> array) throws ParseException {

        List<Transaction> transactionsArrayList = new ArrayList<>();
        List<String> providersArrayList = new ArrayList<>();

        int i = 0;
        for (String line : array) {
            Transaction transaction = new Transaction();

            line = stringUtils.reverse(line);//reversing line so we can split it from end
            String[] splitString = line.split("([,/])", 4);

            //transforming date String to Date object
            String time = stringUtils.reverse(splitString[0].trim());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
            Date date = format.parse(time);

            //assigning properties
            transaction.setPhone(stringUtils.reverse(stringUtils.clean(splitString[1])));
            transaction.setProvider(stringUtils.reverse(stringUtils.clean(splitString[2])));
            transaction.setNote(stringUtils.reverse(stringUtils.clean(splitString[3])));
            transaction.setId(i);
            transaction.setDate(date);

            transactionsArrayList.add(transaction);

            //creating list of providers that will help us to assign correct count number
            providersArrayList.add(stringUtils.reverse(stringUtils.clean(splitString[2])));
            i++;
        }

        return countArrayItems.countItems(transactionsArrayList, providersArrayList);
    }
}
