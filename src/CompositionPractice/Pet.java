package CompositionPractice;

public abstract class Pet {

    String name;
    int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();
}
