public class Zaccount {
    private long balance;

    public Zaccount() {}

    public long getBalance() {
        return balance;
    }
    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) throws ZbalException {
        if(balance < money) {
            throw new ZbalException("잔고부족 :"+(money-balance) + "모자람");
        }
        balance -= money;
    }
    
}
//throw 발생시킴
//throws 떠넘김