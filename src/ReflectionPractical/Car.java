package ReflectionPractical;

public class Car {

    final int numOfWheels = 4;

    private int numOfDoors;

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    private String nameOfCar;

    public Car(int numOfDoors, String nameOfCar){
        this.numOfDoors = numOfDoors;
        this.nameOfCar = nameOfCar;
    }

    public int getNumOfWheels(){
        return numOfWheels;
    }
}
