package oving1;

/**
 * Created by didrikpa on 03/05/16.
 */
public class Digit {

    public int numberSystem;
    public int digit;

    public Digit(int numberSystem){
        this.numberSystem = numberSystem;
        this.digit = 0;
    }

    public int getValue(){
        return digit;

    }

    public boolean increment(){
        digit += 1;
        if(digit == numberSystem){
            digit = 0;
            return true;
        }
        return false;
    }

    public int getBase(){
        return numberSystem;
    }

    public String toString(){
        if(digit > 9){
            return (char)(digit+55)+"";
        }
        return digit+"";
    }

    public static void main(String[] args) {
        Digit digit = new Digit(12);
        for (int i = 0; i < 25; i++) {
            digit.increment();
        }
        System.out.println(digit.toString());
    }
}
