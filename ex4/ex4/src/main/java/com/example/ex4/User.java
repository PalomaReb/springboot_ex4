package com.example.ex4;

public class User {
    //private int id;
    private String name;
    private String city;
    private int age;

public User(){

}

public User (String name,String city, int age){

   // this.id = id;
    this.name = name;
    this.city = city;
    this.age = age;
    }

  /*  public int getId(){
    return id;
    } */

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
    public int getAge(){
    return age;
    }

   /* public void setId(int id) {
        this.id = id;
    }*/

    public void setName(String name){
    this.name = name;
    }
    public void setCity(String city){
    this.city = city;
    }
    public void setAge(int age){
    this.age = age;
    }
}

