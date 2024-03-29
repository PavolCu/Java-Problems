
class BoxInside {

    // Complete this method
    public static void showAnimal(Box<? extends Animal> box) {
        Animal animal = box.getAnimal();
        if (animal != null) {
            System.out.println(animal.toString());
        } else {
            System.out.println("The box is empty.");
        }
    }
}

// Don't change the code below
class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Box<T> {

    private T animal;

    void setAnimal(T animal) {
        this.animal = animal;
    }

    T getAnimal() {
        return animal;
    }
}