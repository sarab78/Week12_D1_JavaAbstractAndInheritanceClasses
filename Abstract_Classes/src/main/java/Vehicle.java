public abstract class Vehicle {

    public String boarding;
    private String model;
    private int numberOfWheels;

    public Vehicle(String model, int numberOfWheels) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
    }

    public String drivingInstructions(){
        return "Turn the key to start.";
    }

    public abstract  String boardingInstructions();




    public String getModel() {
        return model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String startEngine() {
        return "Vrrr. Engine is running.";
    }
}
