package ru.mpei;

public class Main{
    public static void main(String[] args) {

        Table t1 = new Table();
        t1.setHeight(32.1);
        Chair c1 = new Chair();
        Thing[] arrayOfThings = new Thing[]{t1, c1};

        for (int i = 0; i < arrayOfThings.length; i++) {
            System.out.println(arrayOfThings[i].getHeight());
        }
    }
}