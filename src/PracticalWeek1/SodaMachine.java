package PracticalWeek1;

import java.util.Objects;
public class SodaMachine {
    String[] sodas = {"coke", "pepsi", "sprite", "dr. pepper"};

    private int cokeInventory = 20;
    private int pepsiInventory = 20;
    private int spriteInventory = 20;
    private int drPepperInventory = 20;
    private int money = 10;
    public String[] getSodas() {
        return sodas;
    }

    public void setSodas(int indexOfNewSoda, String nameOfNewSoda) {
        this.sodas[indexOfNewSoda] = nameOfNewSoda;
    }

    public int getCokeInventory() {
        return cokeInventory;
    }

    public void setCokeInventory(int cokeInventory) {
        this.cokeInventory = cokeInventory;
    }

    public int getPepsiInventory() {
        return pepsiInventory;
    }

    public void setPepsiInventory(int pepsiInventory) {
        this.pepsiInventory = pepsiInventory;
    }

    public int getSpriteInventory() {
        return spriteInventory;
    }

    public void setSpriteInventory(int spriteInventory) {
        this.spriteInventory = spriteInventory;
    }

    public int getDrPepperInventory() {
        return drPepperInventory;
    }

    public void setDrPepperInventory(int drPepperInventory) {
        this.drPepperInventory = drPepperInventory;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private boolean doesItExist(String typesOfSoda) {
        boolean b = false;
        for (int i = 0; i < sodas.length; i++) {
            if (Objects.equals(sodas[i], typesOfSoda)) {
                b = true;
            }
        }
        return b;
    }

    public void buySoda(String typeOfSoda, int moneyInserted){
        if (doesItExist(typeOfSoda) && moneyInserted >= 2){
            int totalMoneyForMachine = getMoney() + 2;
            setMoney(totalMoneyForMachine);
            switch(typeOfSoda){
                case "coke":
                    if (getCokeInventory() > 0) {
                        setCokeInventory(getCokeInventory() - 1);
                        break;
                    } else {System.out.println("There are no cans of Coke.");
                    setMoney(getMoney() - 2);}

                case "pepsi":
                    if (getPepsiInventory() > 0) {
                        setCokeInventory(getPepsiInventory() - 1);
                        break;
                    } else {System.out.println("There are no cans of Pepsi.");
                        setMoney(getMoney() - 2);}
                case "sprite":
                    if (getSpriteInventory() > 0) {
                        setCokeInventory(getSpriteInventory() - 1);
                        break;
                    } else {System.out.println("There are no cans of Sprite.");
                        setMoney(getMoney() - 2);}
                case "dr. pepper":
                    if (getDrPepperInventory() > 0) {
                        setCokeInventory(getDrPepperInventory() - 1);
                        break;
                    } else {System.out.println("There are no cans of Dr. Pepper.");
                        setMoney(getMoney() - 2);}
                }
            } else if (moneyInserted < 2){System.out.println("You did not insert enough money.");}
        else {System.out.println("That soda is not sold in this machine.");
        }
    }
}

