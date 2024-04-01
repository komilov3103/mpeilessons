package ru.mpei;

public class DataStorage {
    private double[] measurments;
    private DataReceiver dataReceiver;
    public void receive(){
        double[] data = dataReceiver.receive();
    }
}
