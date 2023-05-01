package PracticalWeek1;

public class Main {
    public static void main(String[] args) {
        PlatinumClient p = new PlatinumClient("Sarah", "101 Main Street", 123364);
        p.processSale(100);
        System.out.println(p.getRewards());
        System.out.println(p.getBalance());
        p.makePayment(50);
        System.out.println(p.getBalance());
        System.out.println(p.info());
    }
}