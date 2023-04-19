import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Перевірка ідентичності імен");
        System.out.print("Введіть перше ім'я: ");
        Scanner scanedword = new Scanner(System.in);
        if (scanedword.hasNextLine()) {
            String word1 = scanedword.nextLine();
            System.out.print("Введіть друге ім'я: ");
            if (scanedword.hasNextLine()) {
                String word2 = scanedword.nextLine();
                if (word1.equalsIgnoreCase(word2)) {
                    System.out.println("Імена ідентичні");
                } else {
                    System.out.println("Імена не ідентичні");
                }
            }
        }
    }
}
