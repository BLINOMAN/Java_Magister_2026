public class Circle implements Shape {
    
    private double radius;
    
    public Circle(double radius) {
        setRadius(radius);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ошибка: радиус должен быть положительным!");
            this.radius = 1;
        }
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}