class Dog{
    private String name;
    private int age;
    private String breed;

    public Dog() {
        this.name = "Unknown";
        this.age = 0;
        this.breed = "Unknown";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String printDogDetail(){
        return "Name: "+name+"--Breed: "+breed+"--Age: "+age;
    
    }
}
public class TET_HOLIDAY {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setName("Mickey");
        dog1.setAge(12);
        dog1.setBreed("Husky");
        System.out.println(dog1.printDogDetail());
    }
}
