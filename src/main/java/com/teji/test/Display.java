package com.teji.test;

public class Display {


    //add members to the class
    private String name;
    private int age;
    private String address;

    //create getter setter for the members
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

//create construtor with parameters
    public Display(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        //create object of the class
        Display display = new Display();
        display.display();

        //create object of the class with parameters
        Display display1 = new Display("Teji", 25, "Pune");
        System.out.println(display1.getName());
        System.out.println(display1.getAge());
        System.out.println(display1.getAddress());

        //create object of the class with parameters




    }
    // display public method to show message


    //constructor for the class
    public Display(){
        System.out.println("Hello World");
    }

    //display private method to show message
    private void display(){
        System.out.println("Hello World");
    }

    //destructor for the class
    public void finalize(){
        System.out.println("Hello World");
    }





}
