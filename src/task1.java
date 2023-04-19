import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Введіть перше слово: ");
        Scanner scanedword = new Scanner(System.in);
        if (scanedword.hasNextLine()) {
            String word1 = scanedword.nextLine();
            System.out.print("Введіть друге слово: ");
            if (scanedword.hasNextLine()) {
                String word2 = scanedword.nextLine();
                System.out.print("Введіть третє слово: ");
                if (scanedword.hasNextLine()) {
                    String word3 = scanedword.nextLine();
                    System.out.print("Введіть четверте слово: ");
                    if (scanedword.hasNextLine()) {
                        String word4 = scanedword.nextLine();
                        System.out.print("Введіть п'яте слово: ");
                        String word5 = scanedword.nextLine();
                        System.out.println("Ваше речення: ".concat(word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5) + ".");
                    }
                }
            }
        }
    }
}
