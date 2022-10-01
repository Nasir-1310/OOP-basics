package BankManagement;

public class Account {
    private String account_no = "ac no";
    private String password;
    private int amount;

    public String getAccount_no() {
        return this.account_no;
    }

    public void setAccount_no(String new_ac_no) {
        this.account_no = new_ac_no;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String new_password) {
        this.password = new_password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int new_amount) {
        this.amount = new_amount;
    }
}
