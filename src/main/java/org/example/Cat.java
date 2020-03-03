package org.example;

public class Cat extends Animal implements MammalInterface {
    private String ownerName;

    public Cat(String noise, String animalName, int numberOfLegs, String ownerName) {
        //super(noise, animalName,  numberOfLegs, vegetarian, eyeColour);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String noise(){
        return "Meow";
    }

    /*@Override
    public String toString() {
        return "Cat = " +
                "noise: '" + getNoise() + '\'' +
                ", animalName: '" + getAnimalName() + '\'' +
                ", numberOfLegs: " + getNumberOfLegs() +
                ", ownerName: '" + ownerName + '\'' +
                ", " + warmBlood();
    }*/

    @Override
    public boolean warmBlood() {
        return true;
    }
}
