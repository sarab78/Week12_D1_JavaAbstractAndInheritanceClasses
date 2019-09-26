package Staff;

public abstract class Employee {


    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Add a method named raiseSalary with takes in a parameter of type double to increment the salary.

    public double raiseSalary(double raise){
        if(raise > 0){
            double newSalary = salary * raise;
            this.salary = newSalary;
        }
        return this.salary;
    }

    //Add a method called payBonus which returns 1% of the employees salary.

    public double payBonus(){
    return salary * 0.01;
    }
}
