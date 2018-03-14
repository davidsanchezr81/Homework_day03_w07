public class QuadBike implements IDriveable{

    int quadavgspeed;
    int engine;

    public QuadBike(int quadavgspeed, int engine) {
        this.engine = engine;
        this.quadavgspeed = quadavgspeed;
    }

       @Override
    public int driveDistance(int distance) {
        return distance/quadavgspeed;
    }

    public int getAvgSpeed(){
        return this.quadavgspeed;
    }

    public int getEngine() {
        return engine;
    }


}
