package robot;

import java.time.LocalDate;
import java.util.Objects;

public abstract class robot {
    private String name;
    private String manufacture;
    private int yearOfManufacture;
    private LocalDate registrationDate;

    public robot (String name, String manufacture, int yearOfManufacture, LocalDate registrationDate){
        this.name = Objects.requireNonNull(name,"Name cannot be null");
        this.manufacture = Objects.requireNonNull(manufacture,"Manufacture cannot be null");
        if (yearOfManufacture < 1950 || yearOfManufacture > 2026) throw new IllegalArgumentException("Invalid year");
        this.yearOfManufacture = yearOfManufacture;
        this.registrationDate = Objects.requireNonNull(registrationDate, "The registration data cannot be null");
    }

    public String getName(){
        return name;
    }
    public String getManufacture(){
        return manufacture;
    }
    public int getYearOfManufacture(){
        return yearOfManufacture;
    }
    public LocalDate registrationDate(){
        return registrationDate;
    }
    public abstract String getTechnicalDescription();

    @Override
     public String toString(){
        return getTechnicalDescription();
    }
}
