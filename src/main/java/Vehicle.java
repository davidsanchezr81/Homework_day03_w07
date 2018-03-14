public abstract class Vehicle {

    int avgspeed;

    public Vehicle(int avgspeed){
        this.avgspeed = avgspeed;
    }

    public int getAvgSpeed(){
        return this.avgspeed;
    }

    public int driveDistance(int distance){
        return distance/avgspeed;
    }


}
