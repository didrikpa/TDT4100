package oving1;

/**
 * Created by didrikpa on 05.06.2016.
 */
public class LineEditor {

    public String text = "fuc";
    public int insertionIndex;

    public LineEditor(){

    }

    public LineEditor(String text, int insertionIndex){
        this.text = text;
        this.insertionIndex = insertionIndex;
    }

    public void left(){
        if (insertionIndex>0){
            insertionIndex-=1;
        }

    }

    public void right(){
        insertionIndex+=1;

    }

    public void insertString(String a){
            String text1 = text.substring(0, insertionIndex);
            String text2 = text.substring(insertionIndex,text.length());
            text = text1 + a + text2;
            insertionIndex += a.length();
    }

    public void deleteLeft(){


    }

    public void deleteRight(){

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        LineEditor l = new LineEditor("fuck", 2);
        l.insertString("ka");
        System.out.println(l.text);
    }
}
