package vehicles;
public class Car extends Vehicle {
    /**
     * Task 10
     * create two private attributes: int passengerCount, int currentSpeed
     */
    private int passengerCount;
    private int currentSpeed;

    /**
     * Task 11
     * create getter methods for the passengerCount and currentSpeed
     */
    public int getPassengerCount() {
        return passengerCount;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    /**
     * Task 12
     * create a constructor with all attributes including inherited
     * order of parameters are model, color, passengerCount, currentSpeed
     */
    public Car(String model,String color,int passengerCount,int currentSpeed){
         super(model, color);
        this.currentSpeed = currentSpeed;
        this.passengerCount = passengerCount;

   }
   /**
     * Task 13
     * create a method additionalFineForCrowd
     * <p>
     * create one local variable called extraFine as int
     * to hold fine amount from the getFine method in vehicles.Ticket class
     * then check for passengerCount:
     * <p>
     * if passengerCount between 6 and 7, add 300 to extraFine
     * if passengerCount between 8 and 10, add 600 to extraFine
     * if more than 10, add 1000 to extraFine
     * <p>
     * return extraFine
     */

      public int additionalFineForCrowd() {
          int extraFine = Ticket.getFine(currentSpeed);

          if (passengerCount == 6 || passengerCount == 7) {
              return extraFine + 300;
          }
          if (passengerCount >= 8 && passengerCount <= 10) {
              extraFine += 600;
          }
          if (passengerCount > 10) {
              extraFine += 1000;
          }

              return extraFine;
      }

}
