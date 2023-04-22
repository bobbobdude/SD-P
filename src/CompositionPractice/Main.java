package CompositionPractice;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("BUDDYO BILLYO", 2);
        Cat myCat = new Cat("BUCKURO BRONCO GUT", 4);

        myDog.speak();
        myCat.speak();

        System.out.println(myCat.getName());
    }

}