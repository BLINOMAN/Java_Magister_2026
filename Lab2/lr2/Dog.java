public class Dog extends Animal {
    
    private String breed;        // Порода
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав-гав!");
    }
    
    public void fetch() {
        System.out.println(name + " приносит мяч!");
    }
    
    public String getBreed() {
        return breed;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Порода: " + breed);
    }
}