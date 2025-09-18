/*
    * Name: Joshan, Lucmayan A.
    * Course/Year: DIT first year
    * Subject: Computer Programming
    * Date: Sat, Nov 23 2024
    * File Name: FinalAct2.java
*/
class Animal {
    private String color;
    private String breed;
    private String gender;
    private boolean hasTail;
    private int numberOfLegs;

    // Getters
    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public boolean getHasTail() {
        return hasTail;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Breed: " + breed);
        System.out.println("Gender: " + gender);
        System.out.println("Has Tail: " + hasTail);
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setColor("Brown");
        animal.setBreed("Golden Retriever");
        animal.setGender("Male");
        animal.setHasTail(true);
        animal.setNumberOfLegs(4);

        animal.displayInfo();
    }
}
