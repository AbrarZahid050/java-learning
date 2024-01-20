package com.ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("{\"name\":\"%s\",\"age\":%d}", name, age);
  }

}

public class ObjectStreamTest {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    var person1 = new Person("Abrar zahid", 33);
    var fio = new ObjectOutputStream(new FileOutputStream("./assets/person.ser"));
    var fout = new ObjectInputStream(new FileInputStream("./assets/person.ser"));

    fio.writeObject(person1);
    System.out.println("-> [main] object has been written to file.");
    fio.close();

    Person testPerson = (Person) fout.readObject();
    System.out.println("-> [main] object read: " + testPerson);
    fout.close();

  }
}
