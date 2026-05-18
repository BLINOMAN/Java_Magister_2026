public class BankAccount implements Account {
    
    private final String accountNumber;
    private final String ownerName;
    private double balance;
    
    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Пополнение на %.2f ₽ успешно. Новый баланс: %.2f ₽\n", 
                            amount, balance);
        } else {
            System.out.println("Сумма пополнения должна быть положительной!");
        }
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма снятия должна быть положительной!");
            return false;
        }
        
        if (amount > balance) {
            System.out.printf("Недостаточно средств! Баланс: %.2f ₽\n", balance);
            return false;
        }
        
        balance -= amount;
        System.out.printf("Снятие %.2f ₽ успешно. Новый баланс: %.2f ₽\n", 
                        amount, balance);
        return true;
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
    
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
    
    @Override
    public String getOwnerName() {
        return ownerName;
    }
    
    public boolean transferTo(BankAccount targetAccount, double amount) {
        if (this.withdraw(amount)) {
            targetAccount.deposit(amount);
            System.out.println("Перевод выполнен успешно!");
            return true;
        }
        return false;
    }
}