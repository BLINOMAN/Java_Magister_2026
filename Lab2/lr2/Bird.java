public class Bird extends Animal {
    
    private boolean canFly;
    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Чик-чирик!");
    }
    
    public void fly() {
        if (canFly) {
            System.out.println(name + " летит высоко в небе!");
        } else {
            System.out.println(name + " не умеет летать.");
        }
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Умеет летать: " + (canFly ? "Да" : "Нет"));
    }
}