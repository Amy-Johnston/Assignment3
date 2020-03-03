package org.example;

public class Dog implements MammalInterface {
    private Animal animal;
    private String ownerName;

    public Dog(String noise, String animalName, int numberOfLegs, String ownerName) {
        this.animal = new Animal();
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
        return "Woof";
    }

    /*@Override
    public String toString() {
        return "Dog{" +
                "noise: '" + getNoise() + '\'' +
                ", animalName: '" + getAnimalName() + '\'' +
                ", numberOfLegs: " + getNumberOfLegs() +
                ", ownerName: '" + ownerName + '\'' +
                '}';
    }*/

    @Override
    public boolean warmBlood() {
        return true;
    }
}
