/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Cat extends Felines{

    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sound() {
        System.out.println("Meyooo");
    }
}
