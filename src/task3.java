import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        float num1, num2, num3, maxFloat;
        System.out.println("Для виконання програми введіть дробові числа");
        Scanner scanednum = new Scanner(System.in);
        System.out.print("Введіть перше дробове число: ");
        if (scanednum.hasNextFloat()) {
            num1 = scanednum.nextFloat();
            System.out.print("Введіть друге дробове число: ");
            if (scanednum.hasNextFloat()) {
                num2 = scanednum.nextFloat();
                System.out.print("Введіть третє дробове число: ");
                if (scanednum.hasNextFloat()) {
                    num3 = scanednum.nextFloat();
                    if (num1 > num2 && num1 > num3) {
                        maxFloat = num1;
                        System.out.println(maxFloat);
                    } else if (num2 > num1 && num2 > num3) {
                        maxFloat = num2;
                        System.out.println(maxFloat);
                    } else if (num3 > num1 && num3 > num2) {
                        maxFloat = num3;
                        System.out.println(maxFloat);
                    } else if (num1 % 1 == 0) {
                        System.out.println("Ви ввели не дробове число");
                    } else if (num2 % 1 == 0) {
                        System.out.println("Ви ввели не дробове число");
                    } else if (num3 % 1 == 0) {
                        System.out.println("Ви ввели не дробове число");
                    }
                } else {
                    System.out.println("Ви ввели не дробове число");
                }
            } else {
                System.out.println("Ви ввели не дробове число");
            }
        }else {
            System.out.println("Ви ввели не дробове число");
        }
    }
}
