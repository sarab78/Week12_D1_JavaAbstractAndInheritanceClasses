public class Motorbike extends Vehicle {




    public Motorbike(String model)
    {
        super(model, 2);
    }
     public String boardingInstructions(){
        return "Just hop on.";
     }

    public String drivingInstructions()
    {
        return super.drivingInstructions() + " Use handlebars to steer.";

    }
}