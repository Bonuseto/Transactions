public class Transaction {

    private String note, provider, phone, data, time, count;

    public Transaction(){};

    public Transaction(String note, String provider, String phone, String data, String time,String count) {
        this.note = note;
        this.provider = provider;
        this.phone = phone;
        this.data = data;
        this.time = time;
        this.count = count;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCount() { return count; }

    public void setCount(String count) { this.count = count; }

    public String getTime() { return time; }

    public void setTime(String year) { this.time = year; }
}
