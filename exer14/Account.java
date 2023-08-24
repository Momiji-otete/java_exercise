public class Account {
  String accountNumber;
  int balance;
  
  public String toString() {
    return "\\" + this.balcance +"(口座番号：" + this.accountNumber + ")";
  }
  
  public boolean equals(Object o) {
    if (this == o) { return true;  }
    if (o instanceof Account) {
      Account a = (Account)o;
      String aN1 = this.accountNumber.trim();
      String aN2 = a.accountNumber.trim();
      if (aN1.equals(aN2)) {
        return true;
      }
    }
    return false;
}