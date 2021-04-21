import java.util.*;

public class CountArrayItems {

    public static ArrayList<Transaction> countItems(ArrayList<Transaction> transactionsArrayList, ArrayList<String> providersArrayList) {

        transactionsArrayList.sort(Comparator.comparingLong(o -> o.getDate().getTime()));//sorting array by time

        Map<String, Integer> result = new HashMap<>();
        int j = 0;
        for (Transaction s : transactionsArrayList) {
            String provider = s.getProvider();
            if (result.containsKey(provider)) {
                //if the map contain this key then just increment your count
                result.put(provider, result.get(provider) + 1);
            } else {
                //else just create a new node with 1
                result.put(provider, 1);
            }

            //adding needed amount of zeros to our counter and assigning them to item in transactionsArrayList
            int tranAmount = Collections.frequency(providersArrayList, transactionsArrayList.get(j).getProvider());
            double digitsNumber = Math.floor(Math.log10(tranAmount)) + 1;
            String count = StringService.padLeftZeros(String.valueOf(result.get(provider)), digitsNumber);
            transactionsArrayList.get(j).setCount(count);
            j++;
        }

        transactionsArrayList.sort(Comparator.comparingInt(Transaction::getId)); //sorting array back by Id
        return transactionsArrayList;
    }
}
