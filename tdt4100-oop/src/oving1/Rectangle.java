package oving1;


/**
 * Created by didrikpa on 04/05/16.
 */
public class Rectangle {

    public int x1;
    public int x2;
    public int y1;
    public int y2;



    public int getMinX(){
        if (isEmpty()){
            return 0;
        }
        else{
            return Math.min(x1, x2);
        }

    }

    public int getMinY(){
        if (isEmpty()){
            return 0;
        }
        else{
            return Math.min(y1, y2);
        }

    }

    public int getMaxX(){
        if (isEmpty()){
            return 0;
        }
        else{
            return Math.max(x1, x2);
        }

    }

    public int getMaxY(){
        if (isEmpty()){
            return 0;
        }
        else{
            return Math.max(y1,y2);
        }

    }

    public int getWidth(){
        if (x1 != 0 && y1 != 0 && x2 == 0 && y2 == 0){
            return 1;
        }
        else{
            return Math.abs(x1-x2);
        }

    }

    public int getHeight(){
        if (x1 != 0 && y1 != 0 && x2 == 0 && y2 == 0){
            return 1;
        }
        else {
            return Math.abs(y1-y2);
        }

    }

    public boolean isEmpty(){
        if (x2 == 0 && y2 == 0 && x1 == 0 && y1 == 0){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean contains(int x, int y){
        if(isEmpty()){
            return false;
        }
        else{
            if((x1 == x || x2 == x) && (y1 == y || y2 == y)){
                return true;
            }
            return false;
        }
    }

    public boolean contains(Rectangle rect){
        if(isEmpty()){
            return false;
        }
        else{
            if((rect.x1 == x1|| rect.x1 == x2) &&(rect.x2 == x1 || rect.x2 == x2)){
                return true;
            }
            return false;

        }

    }

    public boolean add( int x, int y){
        if(contains(x,y)){
            return false;
        }
        else{
            x2 = x1;
            x1 = x;
            y2 = y1;
            y1 = y;
            return true;

        }

    }

    public boolean add(Rectangle rect){
        return true;


    }

    public Rectangle union(Rectangle rect){
        return rect;

    }

    public String toString(){
        return "";

    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.isEmpty());
    }
}
