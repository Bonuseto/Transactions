import java.util.ArrayList;

public class Output {

   static void print(ArrayList<Transaction> transactionsArrayList){

       for (Transaction element : transactionsArrayList) {
           //System.out.println(element.getProvider() + "|" + element.getCount() + "|" + element.getNote() + "|" + element.getTime() + "|" + element.getData());
           System.out.println(element.getProvider() + "|" + element.getCount() + "|" + element.getNote());


       }

   }

}
