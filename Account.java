//******************Q1**********************************88
public class Account {
    private String id;
    private String name;
    private int balance=0;
//cons defult
    public Account() {

    }
//cons

    public Account(String id1, String name1) {
      this.id=id1;
      this.name=name1;
    }
//cons

    public Account(String id, String name, int balance) {
      this.id=id;
      this.name=name;
      this.balance=balance;
    }

    //set
    public void setId(String id){
      this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }


    //get

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance ;
    }

    //method no "static"

    public int credit(int amount) {
            this.balance = this.balance+amount;
            return this.balance;
    }
    public int debit(int amount){
        if (amount<=this.balance){
            this.balance-=amount;
        }else {
            System.out.println("Amount exceeded balance");
        }

       return this.balance;
    }
    public int transferTo(Account account, int amount){
        if(amount<=this.balance){
            this.debit(amount);
            account.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}



