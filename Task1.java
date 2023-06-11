package homeWork2;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Введенное число: " + number);
    }
    private static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float num = 0;
        boolean isValidNum = false;
        while(!isValidNum) {
            System.out.println("Введите дробное число через запятую: ");
            try {
                num = scanner.nextFloat();
                isValidNum = true;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Введите дробное число через запятую: ");
                scanner.nextLine();
            }
        }
        return num;
    }

}
