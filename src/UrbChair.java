public class UrbChair extends Vehicle{

    protected bool isBrokenInHalf;
    protected String color;
    protected bool isStained;
    protected int roomNumber;
    protected String currentSitter;

    public UrbChair(bool isBrokenInHalf, String color, bool isStained, int roomNumber, String currentSitter, String make, String model, int year){
        this.isBrokenInHalf = isBrokenInHalf;
        this.color = color;
        this.isStained = isStained;
        this.roomNumber = roomNumber;
        this.currentSitter = currentSitter;
        super(make, model, year);
    }





}