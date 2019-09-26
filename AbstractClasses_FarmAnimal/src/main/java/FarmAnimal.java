public abstract class FarmAnimal {

    public String species;

    public FarmAnimal(String species){
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public String introduceYourself(){
        return "Hi,i am a Cow.";
    }

    public abstract String makeANoise();




}
