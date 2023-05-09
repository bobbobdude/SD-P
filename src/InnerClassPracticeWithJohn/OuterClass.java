package InnerClassPracticeWithJohn;

public class OuterClass {
    int number = 6;

    public void heyThere(){
        System.out.println("Hey there!");
    }

    public class InnerClass{
        int innerNum = 8;
        public void innerClassPrint(){
            System.out.println("Hey there from the inner class!");
        }


    }
}
