package CompositionPractice;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("WOOF");
    }
}
