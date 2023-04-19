import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Перевірка більшого рядка за кількістю символів");
        System.out.print("Введіть перший рядок: ");
        Scanner scanedword = new Scanner(System.in);
        if (scanedword.hasNextLine()) {
            String word1 = scanedword.nextLine();
            System.out.print("Введіть другий рядок: ");
            if (scanedword.hasNextLine()) {
                String word2 = scanedword.nextLine();
                if (word1.length() > word2.length()) {
                    System.out.println("Перший рядок більший");
                } else if (word2.length() > word1.length()) {
                    System.out.println("Другий рядок більший");
                }
            }
        }
    }
}
