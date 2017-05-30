package testt;

/**
 * Created by DELL on 05/30/17.
 */
public class account {
    private int id;
    private String name;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("id: "+id +" name: "+name +" balance: "+balance);
    }
}
