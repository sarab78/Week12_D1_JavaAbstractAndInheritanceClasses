public class Person {


    private String name;
    private String cohort;
    private String favouriteLanguage;

    public Person(String name, String cohort, String favouriteLanguage) {
        this.name = name;
        this.cohort = cohort;
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public String getFavouriteLanguage(){
        return favouriteLanguage;

    }
    public void setFavouriteLanguage(String favouriteLanguage ) {
   this.favouriteLanguage = favouriteLanguage;
    }


    public String talk() {
        return "I love " + this.favouriteLanguage;
    }
}
