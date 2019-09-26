package Staff;

public abstract class Employee {

    private String name;
    private int NI Number;
    private int salary;

    public Employee(String name, int NI Number, int salary) {
        this.name = name;
        this.NI Number = NI Number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNI() {
        return NI;
    }

    public int getSalary() {
        return salary;
    }

    public int raiseSalary(double){

    }

    public int payBonus(){

    }
}
