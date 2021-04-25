import java.util.List;

public class Output {

    public String print(List<Transaction> transactionsArrayList) {

        StringBuilder sb = new StringBuilder();

        for (Transaction element : transactionsArrayList) {
            sb.append(element.getProvider()).append("|").append(element.getCount()).append("|").append(element.getNote()).append("\n");
        }

        return sb.toString();
    }

}
