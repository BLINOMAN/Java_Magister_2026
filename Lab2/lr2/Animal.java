public class Animal {
    
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Общий метод для всех животных
    public void makeSound() {
        System.out.println(name + " издаёт звук...");
    }
    
    // Общий метод
    public void eat() {
        System.out.println(name + " кушает.");
    }
    
    // Общий метод
    public void sleep() {
        System.out.println(name + " спит.");
    }
    
    // Геттеры
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Сеттеры
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    
    // Метод для вывода информации
    public void printInfo() {
        System.out.println("Животное: " + name + ", возраст: " + age + " лет");
    }
}