public class Student extends Person{




    public Student(String name, String cohort, String favouriteLanguage) {
        super(name, cohort, favouriteLanguage);
    }

    public String talk(){
        return "I love learning " +  getFavouriteLanguage();
    }

}

