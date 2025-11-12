package robot;

import java.time.LocalDate;

public class AerialRobot extends robot {
    private double maxAltitudeMeters;
    private int flightAutonomyMinutes;

    public AerialRobot(String name, String manufacture, int yearOfRegistration, LocalDate registrationDate, double maxSpeedKmh, TractionType traction ){
        super(name,manufacture, yearOfRegistration, registrationDate);
        if (maxAltitudeMeters < 0 ) throw new IllegalArgumentException("Invalid Altitude");
        if (flightAutonomyMinutes < 0 ) throw new IllegalArgumentException("Invalid Minutes");
        this.maxAltitudeMeters = maxAltitudeMeters;
        this.flightAutonomyMinutes = flightAutonomyMinutes;
    }
    public double getMaxAltitudeMeters(){
        return maxAltitudeMeters;
    }
    public int flightAutonomyMinutes(){
        return flightAutonomyMinutes;
    }


    public String getTechnicalDescription(){
        return getName() +
    }
}
