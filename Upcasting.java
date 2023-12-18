class Animal {
  public void eat() {
    System.out.println("-> [Animal-class-eat()] Animal eats");
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
    // Dog dog = new Dog();
    // animal = dog; // superClass variable -> subclass variable (upcasting)
    // animal.eat();

    Animal myAnimal = new Dog(); // upcasting
    doAnimalStuff(myAnimal);
    doAnimalStuff(animal);

  }

  public static void doAnimalStuff(Animal animal) {
    System.out.println("-> [main-doAnimalStuff()]");
    animal.eat();
  }
}
