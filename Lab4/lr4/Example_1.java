package Lab4.lr4;

public class Example_1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("1 " + e); // исключениеобработано
        }
        System.out.println("2");
    }
}
