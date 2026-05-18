public class Cat extends Animal {
    
    private String favoriteFood;
    
    public Cat(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу-мяу!");
    }
    
    public void purr() {
        System.out.println(name + " мурлычет");
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Любимая еда: " + favoriteFood);
    }
}