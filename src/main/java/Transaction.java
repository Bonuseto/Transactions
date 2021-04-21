import java.util.Date;

public class Transaction {

    private String note, provider, phone, count;
    private int id;
    private Date date;

    public Transaction(){}

    public Transaction(String note, String provider, String phone, String count, int id, Date date) {
        this.note = note;
        this.provider = provider;
        this.phone = phone;
        this.count = count;
        this.id = id;
        this.date = date;
    }



    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCount() { return count; }

    public void setCount(String count) { this.count = count; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }
}
