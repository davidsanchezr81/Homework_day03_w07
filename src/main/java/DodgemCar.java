public class DodgemCar implements IDriveable {

    int numberseats;
    int dodgeavgspeed;


    public DodgemCar(int numberseats, int dodgeavgspeed) {
        this.numberseats = numberseats;
        this.dodgeavgspeed = dodgeavgspeed;

    }

    @Override
    public int driveDistance(int distance) {
        return distance/dodgeavgspeed;
    }

    public int getNumberOfSeats() {
        return numberseats;
    }

    public int getAvgSpeed() {
        return dodgeavgspeed;
    }


}
