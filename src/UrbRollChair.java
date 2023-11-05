public class UrbRollChair extends UrbChair{

    protected bool doesHeightAdjustWork;
    protected int numOfBrokenWheels;

     public UrbRollChair(bool doesHeightAdjustWork, int numOfBrokenWheels, bool isBrokenInHalf, String color, bool isStained, int roomNumber, String currentSitter, String make, String model, int year){
     
     this.doesHeightAdjustWork = doesHeightAdjustWork;
     this.numOfBrokenWheels = numOfBrokenWheels;
     super(isBrokenInHalf, color, isStained, roomNumber, currentSitter, make, model, year);
     
     }

}