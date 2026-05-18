public class Rectangle {
    
    private double length;  
    private double width;   
    
    public Rectangle(double length, double width) {
        setLength(length);  
        setWidth(width);
    }
    
    // Геттеры
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }
    
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }
    
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    public void printInfo() {
        System.out.println("Прямоугольник:");
        System.out.printf("Длина = %.2f\n", length);
        System.out.printf("Ширина = %.2f\n", width);
        System.out.printf("Площадь = %.2f\n", getArea());
        System.out.printf("Периметр = %.2f\n", getPerimeter());
    }
}