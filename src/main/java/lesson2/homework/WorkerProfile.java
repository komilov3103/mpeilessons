package lesson2.homework;

public class WorkerProfile {

    protected String name;
    protected int age;
    protected int salary;

    public WorkerProfile(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String profileInfo(){
        String str = String.format("Имя: %s, возраст: %s, зарплата: %s", name, age, salary);
        return str;
    }
}
