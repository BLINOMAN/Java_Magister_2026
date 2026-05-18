public interface Account {
    
    void deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
    
    String getAccountNumber();
    String getOwnerName();
    
    // Дополнительный метод для вывода информации
    default void printInfo() {
        System.out.println("=== Информация о счёте ===");
        System.out.println("Владелец: " + getOwnerName());
        System.out.println("Номер счёта: " + getAccountNumber());
        System.out.printf("Баланс: %.2f ₽\n", getBalance());
        System.out.println("-------------------------");
    }
}