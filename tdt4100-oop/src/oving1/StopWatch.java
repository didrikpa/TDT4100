package oving1;

/**
 * Created by didrikpa on 04/05/16.
 */
public class StopWatch {

    public boolean start;
    public boolean stop;
    public int ticks;
    public int totalTicks;
    public int lastLapTicks;
    public int thisLapTicks;
    public int numberOfLaps;

    public boolean isStarted(){
        return this.start;

    }

    public boolean isStopped(){
        return this.stop;

    }

    public int getTicks(){
        return this.totalTicks;

    }

    public int getTime(){
        if(!isStarted()){
            return -1;
        }
        else{
            return this.ticks;
        }

    }

    public int getLapTime(){
        if(!isStarted()){
            return -1;
        }
        else{
            return thisLapTicks;
        }
    }

    public int getLastLapTime(){
        if(numberOfLaps < 1){
            return -1;
        }
        else{
            return lastLapTicks;
        }

    }

    public void tick(int ticks){
        this.totalTicks += ticks;
        if(isStarted() && !isStopped()){
            this.ticks += ticks;
            this.thisLapTicks += ticks;
        }

    }

    public void start(){
        this.start = true;

    }

    public void lap(){
        numberOfLaps +=1;
        lastLapTicks = thisLapTicks;
        thisLapTicks = 0;


    }

    public void stop(){
        this.stop = true;
        lastLapTicks = thisLapTicks;
        thisLapTicks = 0;

    }

    public String toString(){
        return "";
    }
}
