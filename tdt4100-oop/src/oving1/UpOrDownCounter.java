package oving1;

/**
 * Created by didrikpa on 04/05/16.
 */
public class UpOrDownCounter {

    public int start;
    public int end;
    public int counter;

    public UpOrDownCounter(int start, int end){
        this.counter = start;
        if(start != end){
            this.start = start;
            this.end = end;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getCounter(){
        return this.counter;

    }



    public boolean count() {
        if(counter < end){
            counter += 1;
        }
        else if(counter > end){
            counter -=1;
        }

        if(counter == end){
            return false;
        }
        else{
            return true;
        }

    }

    public static void main(String[] args) {
        UpOrDownCounter u = new UpOrDownCounter(1, 3);
        System.out.println(u.counter);
        u.count();
        u.count();
        u.count();
        System.out.println(u.counter);
    }

}
