public class Car extends Vehicle{

    protected int milesPerGallon;
    protected String fuelType;
    protected bool isStickShift;
    protected bool hasBluetooth;

    public Car(int milesPerGallon, String fuelType, bool isStickShift, bool hasBluetooth){
        this.milesPerGallon = milesPerGallon;
        this.fuelType = fuelType;
        this.isStickShift = isStickShift;
        this.hasBluetooth = hasBluetooth;
        super(year, make, model);
    }





}