package com.networking;

import com.fasterxml.jackson.annotation.JsonProperty;

public class People {

  @JsonProperty("name")
  private String name;

  @JsonProperty("age")
  private int age;

  // Constructors, getters, setters, etc.
  public People(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public People() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
