package PracticalWeek1;

public class Watch {
    public Watch(String manufacturer, String model, int diameter, int waterResistance, String material) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.diameter = diameter;
        this.waterResistance = waterResistance;
        this.material = material;
    }

    private String manufacturer;

    private String model;

    private int diameter;

    private int waterResistance;

    private String material;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(int waterResistance) {
        this.waterResistance = waterResistance;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void printWatch(){
        String allTheStuff = "Manufacturer: " + getManufacturer() + "\n" + "Model: " + getModel() + "\n" + "Diameter: " + getDiameter() + "\n" + "Water Resistance: " + getWaterResistance() + "\n" + "Material: " + getMaterial();
    }
}
