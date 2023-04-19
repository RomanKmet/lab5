import java.util.Scanner;

public class task2 {
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
                        System.out.println(word1.substring(0, 1) + word2.substring(0, 1) + word3.substring(0, 1) + word4.substring(0, 1) + word5.substring(0, 1));
                    }
                }
            }
        }
    }
}
