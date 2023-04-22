package MultiLevelInheritanceYoutubeBaldGuy;

public class Carnivore {
    final private String diet = "Meat";

    public String getDiet(){
        return diet;
    }
}

class Dinosaur extends Carnivore{
    private String name;
    private double height;
    private int weight;

    public Dinosaur(String name, double height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }

}

class Tyrannosaurus extends Dinosaur{
    public Tyrannosaurus(String name, double height, int weight){
        super(name, height, weight);
    }
}
