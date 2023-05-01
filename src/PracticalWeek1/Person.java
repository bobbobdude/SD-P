package PracticalWeek1;

class Person {
    private String name;
    private String address;

    public Person(String n, String a) {
        name = n;
        address = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String info() {
        return name + " lives at " + address + ".";
    }
}

class cardHolder extends Person{

    int accountNumber;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    double balance = 0;

    int creditLimit = 5000;

    public cardHolder(String n, String a, int accountNumber) {
        super(n, a);
        this.accountNumber = accountNumber;
    }

    void processSale(double valueOfSale){
        balance += valueOfSale;
    }

    void makePayment(double valueOfPayment){
        balance -= valueOfPayment;
    }
}

class PlatinumClient extends cardHolder{
    double cashBack;

    double rewards;

    public double getCashBack() {
        return cashBack;
    }

    public void setCashBack(double cashBack) {
        this.cashBack = cashBack;
    }

    public double getRewards() {
        return rewards;
    }

    public void setRewards(double rewards) {
        this.rewards = rewards;
    }

    public PlatinumClient(String n, String a, int accountNumber) {
        super(n, a, accountNumber);
        cashBack = 0.02;
        rewards = 0;
    }

    @Override
    void processSale(double valueOfSale){
        balance += valueOfSale;
        double percentageToAddToRewards = valueOfSale * cashBack;
        rewards += percentageToAddToRewards;
    }
}
