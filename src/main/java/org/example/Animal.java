package org.example;

public class Animal implements MammalInterface{
    /*private String noise;
    private String animalName;
    private int numberOfLegs;

    public Animal(String noise, String animalName, int numberOfLegs) {
        this.noise = noise;
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
    }*/

    public String noise(){
        return "The animal made a sound";
    }

    @Override
    public boolean warmBlood() {
        return false;
    }

    /*public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "noise='" + noise + '\'' +
                ", animalName='" + animalName + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", vegetarian=" + vegetarian +
                ", eyeColour='" + eyeColour + '\'' +
                '}';
    }*/
}
