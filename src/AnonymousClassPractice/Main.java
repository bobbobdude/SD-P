package AnonymousClassPractice;

public class Main {
    public static void main(String[] args) {
        Animal bigfoot = new Animal(){
            public void makeNoise(){
                System.out.println("GRAWWWWWWWWWWWWW grocery åååå");
            }
        };

        bigfoot.makeNoise();
    }
}
