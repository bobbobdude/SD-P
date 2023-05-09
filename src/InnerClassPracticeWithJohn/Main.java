package InnerClassPracticeWithJohn;

public class Main {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        outer.heyThere();

        OuterClass.InnerClass inner = outer.new InnerClass(); //As the InnerClass is not static we need to access it through an instantiated object of the outer class in this case "outer".

        inner.innerClassPrint();
    }
}
