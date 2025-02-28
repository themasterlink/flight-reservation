package flight.reservation.plane;

public class Aircraft {

    protected final String model;
    protected final int passengerCapacity;
    public final int crewCapacity;

    public Aircraft(String model, int passengerCapacity, int crewCapacity){
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCrewCapacity(){
        return this.crewCapacity;
    }
}

