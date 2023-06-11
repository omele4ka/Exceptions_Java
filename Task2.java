package homeWork2;
/* Если необходимо, исправьте данный код
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */
public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = null;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            // Добавлены обработки еще двух ислючений: для массива другой длинны и для случая, если массив пустой
        } catch (ArithmeticException | IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
