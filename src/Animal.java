public abstract class Animal {

    protected String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public abstract Animal copy();
}
