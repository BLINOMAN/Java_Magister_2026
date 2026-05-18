public class Square implements Shape {
    
    private double side;
    
    public Square(double side) {
        setSide(side);
    }
    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Ошибка: сторона должна быть положительной!");
            this.side = 1;
        }
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}