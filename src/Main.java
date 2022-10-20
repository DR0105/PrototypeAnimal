public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Pit Bull");
        dog.setName("Max");
        dog.setAge(4);
        dog.printData();
        Dog anotherDog = (Dog) dog.copy();
        System.out.println("Copy of initial dog");
        anotherDog.printData();
        anotherDog.setName("Tony");
        System.out.println("After changing name");
        anotherDog.printData();
    }
}