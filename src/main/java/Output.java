import java.util.ArrayList;

public class Output {

    static void print(ArrayList<Transaction> transactionsArrayList) {

        for (Transaction element : transactionsArrayList) {
            //System.out.println(element.getProvider() + "|" + element.getCount() + "|" + element.getNote() + "|" + element.getDate() + "|" + element.getId());
            System.out.println(element.getProvider() + "|" + element.getCount() + "|" + element.getNote());
        }

    }

}
