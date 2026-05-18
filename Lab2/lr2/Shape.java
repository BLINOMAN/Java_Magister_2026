public interface Shape {
    
    double getArea();       
    double getPerimeter();  
    
    // Дополнительный метод для удобства
    default void printInfo() {
        System.out.printf("%s:\n", this.getClass().getSimpleName());
        System.out.printf("Площадь = %.2f\n", getArea());
        System.out.printf("Периметр = %.2f\n", getPerimeter());
        System.out.println("-------------------");
    }
}

