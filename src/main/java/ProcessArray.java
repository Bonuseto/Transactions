import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProcessArray {


    public static ArrayList<Transaction> processArray(ArrayList<String> array) {

        ArrayList<Transaction> transactionsArrayList = new ArrayList<>();
        ArrayList<String> providersArrayList = new ArrayList<>();

        for (String line : array) {
            Transaction transaction = new Transaction();

            line = StringService.reverseIt(line);//reversing line so we can split it from end
            String[] splitString = line.split("([,/])", 4);

            String[] timeAndDay = splitString[0].split(" ");//splitting time and date here

            transaction.setTime(StringService.reverseIt(StringService.cleanIt(timeAndDay[0])));
            transaction.setData(StringService.reverseIt(StringService.cleanIt(timeAndDay[1])));
            transaction.setPhone(StringService.reverseIt(StringService.cleanIt(splitString[1])));
            transaction.setProvider(StringService.reverseIt(StringService.cleanIt(splitString[2])));
            transaction.setNote(StringService.reverseIt(StringService.cleanIt(splitString[3])));

            transactionsArrayList.add(transaction);

            providersArrayList.add((StringService.reverseIt(StringService.cleanIt(splitString[2]))));
        }

        Map<String, Integer> result = new HashMap<>();
        int i = 0;
        for (Transaction s : transactionsArrayList) {
            String provider = s.getProvider();
            if (result.containsKey(provider)) {
                //if the map contain this key then just increment your count
                result.put(provider, result.get(provider) + 1);
            } else {
                //else just create a new node with 1
                result.put(provider, 1);
            }

            if (Collections.frequency(providersArrayList, transactionsArrayList.get(i).getProvider()) < 10) {
                String count = StringService.padLeftZeros(String.valueOf(result.get(provider)), 1);
                transactionsArrayList.get(i).setCount(count);
            }
            if (Collections.frequency(providersArrayList, transactionsArrayList.get(i).getProvider()) >= 10 && Collections.frequency(providersArrayList, transactionsArrayList.get(i).getProvider()) < 100) {
                String count = StringService.padLeftZeros(String.valueOf(result.get(provider)), 2);
                transactionsArrayList.get(i).setCount(count);
            }
            if (Collections.frequency(providersArrayList, transactionsArrayList.get(i).getProvider()) >= 100 && Collections.frequency(providersArrayList, transactionsArrayList.get(i).getProvider()) < 1000) {
                String count = StringService.padLeftZeros(String.valueOf(result.get(provider)), 3);
                transactionsArrayList.get(i).setCount(count);
            }
            i++;
        }


        return transactionsArrayList;
    }
}
