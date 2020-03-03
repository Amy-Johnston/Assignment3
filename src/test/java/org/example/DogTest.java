package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    private Dog dog;
    private Animal animal;
    @Before
    public void setUp() throws Exception {
        dog = new Dog("Woof", "Spotty", 4, "Amy Johnston");
        animal = new Animal();
    }

    //INHERITANCE
    @Test
    public void noise() throws Exception{
        String result1 = dog.noise();
        //assertEquals("Meow", result); //this is a failing test: Expected - Meow, Actual - Woof
        assertEquals("Woof", result1);
    }

    //POLYMORPHISM
    @Test
    public void warmBlood() throws Exception{
        animal.warmBlood();
        dog.warmBlood();
        assertNotEquals(animal.warmBlood(), dog.warmBlood());
        //assertTrue(dog.warmBlood());
    }

    //ENCAPSULATION
    @Test
    public void setDog()throws Exception{
        dog.setOwnerName("Junaid Martin");
        String result2 = dog.getOwnerName();
        assertEquals("Junaid Martin", result2);
    }
}