package ru.mpei;

public class Student implements some_interface{
    private String name;
    private String group;
    private int age;
    private double averageMark;
    public static String description;
    private static int countPeople;



    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        countPeople++;
    }

    public  double some_method(){
        return averageMark;
    }
    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if  (age > 0 && age < 150) {
            this.age = age;
        }else {
            System.err.println("Invalid age");
        }
    }
    public static int getCountStudents(){
        return countPeople;
    }
    public void isSkuf(){
        if (age > 35){
            System.out.println("You are skuf!");
        }else {
            System.out.println("You are young yet!");
        }
    }

}

