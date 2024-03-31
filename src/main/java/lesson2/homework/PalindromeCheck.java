package lesson2.homework;

public class PalindromeCheck {
    private int number;

    public PalindromeCheck(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPalindrome(){
        int temporary = 0;
        int checkNumber = number;
        int reversed = number;
        while (reversed > 0){
            temporary = (temporary * 10) + (reversed % 10);
            reversed = reversed / 10;
        }
        if (temporary == checkNumber){
            return true;
        }else{
            return false;
        }
    }

    public int sumOfNumbers(){
        int temp = number;
        int sum = 0;
        while (temp > 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        return sum;
    }
}
