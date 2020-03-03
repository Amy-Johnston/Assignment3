package org.example;

public class Cow extends Animal implements MammalInterface {

    public Cow(String noise, String animalName, int numberOfLegs) {
        //super(noise, animalName, numberOfLegs);
    }

    /*@Override
    public String toString() {
        return "Cow = " +
                "noise: '" + getNoise() + '\'' +
                ", animalName: '" + getAnimalName() + '\'' +
                ", numberOfLegs: " + getNumberOfLegs() +
                ", vegetarian: " + isVegetarian() +
                ", eyeColour: '" + getEyeColour() + '\'' +
                ", " + warmBlood();
    }*/

    @Override
    public boolean warmBlood() {
        return true;
    }
}
