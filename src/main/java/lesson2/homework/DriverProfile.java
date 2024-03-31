package lesson2.homework;

public class DriverProfile extends WorkerProfile{

    private String drivingLicence;
    public DriverProfile(String name, int age, int salary, String drivingLicence) {
        super(name, age, salary);
        this.drivingLicence = drivingLicence;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }
}
