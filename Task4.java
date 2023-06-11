package homeWork2;

import java.util.Scanner;

/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        inputString();
    }
    public static void inputString() {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        if (!inputStr.isEmpty()) {
            System.out.println(inputStr);
        } else {
            System.out.println("Пустые строки вводить нельзя!");
            throw new RuntimeException("Пустая строка");
        }
    }
}
