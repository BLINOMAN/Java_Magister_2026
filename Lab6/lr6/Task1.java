package Lab6.lr6;

public class Task1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " выполняется.");
            });

            thread.start();
        }

    }
}
