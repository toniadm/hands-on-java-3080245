package bank;

// Create class named Account
public class Account {
  private int id;
  private String type;
  private double balance;

  // Create constructor named Acccount
  public Account(int id, String type, int balance) {
    setId(id);
    setType(type);
    setBalance(balance);
  }

  // Create methods for Account class
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}
