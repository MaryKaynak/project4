package vehicles;

public class Vehicle {

    /**
     * Task 3
     * create 2 private attributes: String model, String color
     */
    private String model;
    private String color;


    /**
     * Task 4
     * create a constructor with all attributes as a parameter
     */
       public Vehicle(String model,String color){
           this.model = model;
           this.color = color;
       }




    /**
     * Task 5
     * create getter and setter for all attributes
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
