package ReflectionPractical;

public class Rabbit implements AnimalInterface{

    public String getRabbitName() {
        return rabbitName;
    }

    private final String rabbitName;

    public Rabbit(String rabbitName, int speedOfRabbitMPH, int hungerOfRabbit){
        if (hungerOfRabbit > 0 && hungerOfRabbit < 100){
            this.hungerOfRabbit = hungerOfRabbit;
        }
        else {
            System.out.println("Must be within the range of 0 - 100");
        }
        this.speedOfRabbitMPH = speedOfRabbitMPH;
        this.rabbitName = rabbitName;
    }



    public int getSpeedOfRabbitMPH() {
        return speedOfRabbitMPH;
    }

    private int speedOfRabbitMPH = 0;

    public int getHungerOfRabbit() {
        return hungerOfRabbit;
    }

    private int hungerOfRabbit = 0;

    @Override
    public void Noise() {
        System.out.println("MEOW I AM A CONFUSED RABBIT");
    }

    @Override
    public void Run() {
        if (speedOfRabbitMPH < 45){
            speedOfRabbitMPH+= 5;
        }
    }
}
