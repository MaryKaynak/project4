package vehicles;

public class Ticket {

    /**
     * Task 1
     * create private static attribute with name fine as int
     */
    private static int fine;



    /**
     * Task 2
     * Create static method with name getFine and with
     * one parameter: currentSpeed as int
     * check currentSpeed and assign fine amount:
     * <p>
     * if the current speed between 80 - 90 ticket price is 80$
     * if the current speed between 90 - 100 ticket price is 150$
     * if the current speed between 100 - 110 ticket price is 280$
     * if the current speed more then 110 then 500$
     * if the current speed less then 80 fine is 0
     * <p>
     * return FINE
     * <p>
     * NOTE: you should assign all fines amounts to the FINE static field
     */
           //static Ticket(int currentSpeed){

       public static int getFine(int currentSpeed){

           if(currentSpeed >= 80 && currentSpeed <=90) {
           return fine=80;
       }
           else if(currentSpeed >= 90 && currentSpeed <=100) {
               return fine=150;
           }
           else if(currentSpeed >= 100 && currentSpeed <=110) {
               return fine=280;
           }
          else if(currentSpeed >110) {
               return fine= 500;
           }
            else
                fine = 0;

           return fine;
       }


}

