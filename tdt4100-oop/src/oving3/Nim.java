package oving3;

/**
 * Created by didrikpa on 06.06.2016.
 */
public class Nim {

    protected Integer[] pile = {0,0,0};

    public Nim(int pileSize){
        if(pileSize > 0){
            for (int i = 0; i < pile.length; i++) {
                pile[i] = pileSize;
            }

        }
        else throw new IllegalArgumentException();

    }

    public Nim (){
        for (int i = 0; i < pile.length; i++) {
            pile[i] = 10;
        }
    }

    protected void removePieces(int number, int targetPile){
        if(isGameOver()){
            throw new IllegalStateException();
        }
        else{
            if(isValidMove(number, targetPile)){
                pile[targetPile] -= number;
            }
            else throw new IllegalArgumentException();
        }


    }

    protected boolean isValidMove(int number, int targetPile){
        return (number >= 1 && number <= pile[targetPile] && targetPile <= 2 && targetPile >= 0 && !isGameOver());
    }

    protected boolean isGameOver(){
        for (int i = 0; i < pile.length; i++) {
            if (pile[i] == 0){
                return true;
            }
        }
        return false;

    }

    protected int getPile(int targetPile){
        if (targetPile >=0 && targetPile < 3){
            return pile[targetPile];
        }
        else throw new IllegalArgumentException();
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < pile.length; i++) {
            result += "pile " + i + " har " + pile[i] + "brikker igjen\n";
        }
        return result;
    }
}
