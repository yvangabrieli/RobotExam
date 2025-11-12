package robot;
import java.time.LocalDate;
public class TerrestrialRobot extends robot implements ResistanceEvaluable {
    private double maxSpeedKmh;
    private TractionType traction;

    public TerrestrialRobot  (String name, String manufacture, int yearOfRegistration, LocalDate registrationDate, double maxSpeedKmh, TractionType traction ){
        super(name,manufacture, yearOfRegistration, registrationDate);
        if (maxSpeedKmh < 0 ) throw new IllegalArgumentException("Invalid Speed");
        this.maxSpeedKmh = maxSpeedKmh;
        this.traction = traction;
    }
    public double getMaxSpeedKmh(){
    return maxSpeedKmh;
    }
    private TractionType getTraction(){
        return traction;
    }

@Override
    public String getResistanceReport(){
        if (traction != TractionType.ORUGAS){
            return getName() + "No cumple los requisitos.";
        }
        return getName() + "Apto para la competición.";
}
@Override
    public String getTechnicalDescription(){
    return getName() + " fabricado por " + getManufacture() + " en " + getYearOfManufacture() + ", usa tracción " + getTraction() + " y alcanza hasta " + getMaxSpeedKmh() + " km/h";
    }
}
