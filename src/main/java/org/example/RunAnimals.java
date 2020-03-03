package org.example;

/**
 * OOP and TDD
 * Author: Amy Johnston (218188773)
 */

public class RunAnimals
{
    public static void main( String[] args )
    {
        Animal cat = new Cat("Meow!", "Kitty", 4,  "Yusrah Soeker");
        //Animal cow = new Cow("Moo!", "Milky", 4);
        Dog dog = new Dog("Woof!", "Spotty", 4,  "Amy Johnston");

        dog.noise();
        cat.noise();
    }
}
