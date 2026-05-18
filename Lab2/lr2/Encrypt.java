import java.util.Scanner;

public class Encrypt {
    private static String encryptDecrypt(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char)arrayInt[i];
        }
        return new String(arrayCharNew);
    }

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String str = id.nextLine();
        System.out.println("Введите ключ: ");
        int shift = id.nextInt();
        
        String encryptString = encryptDecrypt(str, shift);
        
        System.out.println("Текст после преобразования: " + encryptString);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        
        id.nextLine();

        while (true) {
            String answer = id.nextLine();

            if (answer.equals("y")) {
                System.out.println(encryptDecrypt(encryptString, -shift));
                break;
            }
            else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            }
            else {
                System.out.println("Введите корректное значение.");
            }
        }
        id.close();
    }
}
