public class DodgemCar extends Vehicle implements IDriveable {

    private int numberseats;



    public DodgemCar(int numberseats, int avgspeed) {
        super(avgspeed);
        this.numberseats = numberseats;


    }

//    @Override
//    public int driveDistance(int distance) {
//        return distance/avgspeed;
//    }

    public int getNumberOfSeats() {
        return numberseats;
    }

//    public int getAvgSpeed() {
//        return dodgeavgspeed;
//    }


}
