public class QuadBike extends Vehicle implements IDriveable{


    private int engine;

    public QuadBike(int avgspeed, int engine) {
        super(avgspeed);
        this.engine = engine;

    }

//       @Override
//    public int driveDistance(int distance) {
//        return distance/quadavgspeed;
//    }
//
//    public int getAvgSpeed(){
//        return this.quadavgspeed;
//    }

    public int getEngine() {
        return engine;
    }


}
