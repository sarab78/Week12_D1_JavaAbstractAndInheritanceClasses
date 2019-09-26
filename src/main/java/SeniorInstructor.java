public class SeniorInstructor extends Instructor{

    private int salary;

    public SeniorInstructor(String name, String cohort, String moduleTeam, int salary, String favouriteLanguage){
        super(name, cohort, moduleTeam, favouriteLanguage);
        this.salary = salary;
    }
}
