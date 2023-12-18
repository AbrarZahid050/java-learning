class Animal {
  public void eat() {
    System.out.println("-> [Animal-class-eat()] Animal eats");
  }

  public void growl() {
    System.out.println("-> [Animal-class-growl()] Animal growls");
  }
}

class Dog extends Animal {
  @Override
  public void eat() {
    System.out.println("-> [Dog-class-eat()] Dog eats");
  }

  public void bark() {
    System.out.println("-> [Dog-class-bark()] Dog barks");
  }
}

class Upcasting {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
    // animal = dog; // superClass variable -> subclass variable (upcasting)
    // animal.eat();

    Animal myAnimal = new Dog(); // Explicit upcasting
    doAnimalStuff(myAnimal);
    doAnimalStuff(animal);
    doAnimalStuff(dog); // Implicit upcasting.
  }

  public static void doAnimalStuff(Animal animal) {
    System.out.println("-> [main-doAnimalStuff()]");
    animal.eat();

    if (animal instanceof Dog) { // checking if the animal variable is an instance of Dog
      Dog myDog = (Dog) animal; // Downcasting:
      myDog.bark();
    }
    System.out.println();
  }
}
