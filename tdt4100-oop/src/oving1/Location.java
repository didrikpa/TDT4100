package oving1;

/**
 * Created by didrikpa on 03/05/16.
 */
public class Location {

    public int x;
    public int y;

    public Location(){

    }

    public void up(){
        this.y -= 1;
    }

    public void down(){
        this.y += 1;
    }

    public void left(){
        this.x -= 1;
    }
    public void right(){
        this.x += 1;
    }

    public String toString(){
        return "X-position: " + x + "\nY-position: "+ y;
    }
}
