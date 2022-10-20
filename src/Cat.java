public class Cat extends Animal{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat (String breed){
        this.breed = breed;
    }

    public void printData(){
        System.out.println("Breed: "+ this.getBreed() +"\n"+ "Name: "+ this.getName()+ "\n"
                + "Age: "+ this.getAge());
    }
    @Override
    public Animal copy() {
        Cat catClone = new Cat(this.getBreed());
        catClone.setAge(this.getAge());
        catClone.setName(this.getName());
        return catClone;
    }
}
