public class Triangle implements Shape {
    
    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle(double sideA, double sideB, double sideC) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Ошибка: стороны не образуют треугольник!");
            this.sideA = this.sideB = this.sideC = 1;
        }
    }
    
    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;
    }
    
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    
    public void printSides() {
        System.out.printf("Стороны: %.2f, %.2f, %.2f\n", sideA, sideB, sideC);
    }
}