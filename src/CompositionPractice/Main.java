package CompositionPractice;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("BUDDYO BILLYO", 2);
        Cat myCat = new Cat("BUCKURO BRONCO GUT", 4);

        myDog.speak();
        myCat.speak();

        System.out.println(myCat.getName());

        Person per1 = new Person("HARRY HANGRY HORROR SHOW");
        Person per2 = new Person("BYONG HANGRY HORROR SHOW");

        per1.setPet(myDog);
        per2.setPet(myCat);

        System.out.println((per1.getPet()).getName());


    }
}