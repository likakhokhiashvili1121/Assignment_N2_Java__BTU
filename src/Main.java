public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Jemala", 2, AnimalType.MAMMAL, "Saxli", "Rotvailer");
        Parrot myParrot = new Parrot("Kakuna", 3, AnimalType.BIRD, "buneba", "Red");

        myDog.bark();
        myParrot.receiveTreatment();
        myParrot.playWith();
        myParrot.fly();
        myParrot.mimic();
        myDog.receiveTreatment();
    }
}


enum AnimalType {
    MAMMAL,
    BIRD,
    REPTILE,
    AMPHIBIAN,
    FISH
}

abstract class Animal {
    private String name;
    private int age;
    private AnimalType type;
    private String habitat;

    public Animal(String name, int age, AnimalType type, String habitat) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.habitat = habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public AnimalType getType() {
        return type;
    }

    public String getHabitat() {
        return habitat;
    }

    public abstract void receiveTreatment();
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, AnimalType type, String habitat, String breed) {
        super(name, age, type, habitat);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Jemala klassnia");
    }

    @Override
    public void receiveTreatment() {
        System.out.println(getName() + " jemala da jemala, chemi kodebi dziritadad jemalobaa");
    }
}

class Parrot extends Animal implements Pet, Bird {
    private String color;

    public Parrot(String name, int age, AnimalType type, String habitat, String color) {
        super(name, age, type, habitat);
        this.color = color;
    }

    public void mimic() {
        System.out.println(getName() + " cxovreba jemalobaao natqvamia");
    }

    @Override
    public void receiveTreatment() {
        System.out.println(getName() + " Jemalas uyvars ludi");
    }

    @Override
    public void playWith() {
        System.out.println(getName() + " Jemalas uyvars sirbili");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " fri fris shveba ");
    }
}

interface Pet {
    void playWith();
}

interface Bird {
    void fly();
}

