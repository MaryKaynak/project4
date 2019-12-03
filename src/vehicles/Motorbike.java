package vehicles;

public class Motorbike extends Vehicle {
    /**
     * Task 6
     * create two private variables boolean helmetPresent , int currentSpeed
     */
    private boolean helmetPresent;
    private int currentSpeed;
    /**
     * Task 7
     * create a getter methods for helmetPresent and currentSpeed
     */
    public boolean isHelmetPresent() {
        return helmetPresent;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * Task 8
     * create a constructor with all attributes including inherited
     * order of parameters are model, color, helmetPresent, currentSpeed
     */

    public Motorbike(String model,String color,boolean helmetPresent,int currentSpeed){
        super(model, color);
        this.currentSpeed = currentSpeed;
        this.helmetPresent = helmetPresent;

    }
    /**
     * Task 9
     * create a method additionalFineForNoHelmet
     * <p>
     * create one local variable called extraFine as int
     * to hold fine amount from the getFine method in vehicles.Ticket class using speed of this Motorbike
     * then check for helmet present:
     * <p>
     * if the helmet is not present, add the 200$ to extraFine
     * <p>
     * return extraFine
     */

    public int additionalFineForNoHelmet(){

       int extraFine = Ticket.getFine(currentSpeed);
           if(!helmetPresent){
               extraFine += 200;
           }
     return  extraFine;
}
}
