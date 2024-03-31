package lesson2.homework;

public class Main {
    public static void main(String[] args) {

        DriverProfile driver = new DriverProfile("Komil", 21, 100000, "A");
        printWorkerInfo(driver);

    }

    public static void printWorkerInfo(WorkerProfile profile){
        System.out.printf("%s", profile.profileInfo());
    }
}