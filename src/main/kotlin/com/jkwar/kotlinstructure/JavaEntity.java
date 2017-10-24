package com.jkwar.kotlinstructure;

public class JavaEntity {

  public static void main(String[] args) {
    JavaEntity javaEntity = new JavaEntity();
    javaEntity.setAge(11);
    javaEntity.setName("kotlin");
    System.out.println(javaEntity.getAge());
    System.out.println(javaEntity.getName());
  }

  private int age;
  private String name;

  public int getAge() {
    System.out.println("get age is " + age);
    return age;
  }

  public void setAge(int age) {
    System.out.println("set age is " + age);
    this.age = age;
  }

  public String getName() {
    System.out.println("get name is " + name);

    return name;
  }

  public void setName(String name) {
    System.out.println("set name is " + name);

    this.name = name;
  }
}




