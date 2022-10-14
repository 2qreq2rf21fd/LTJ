import java.util.Scanner;

public class RepeadOutInput {
    public static void main(String[] args) {
/**
 * @uthor I2nP6o
 * 1) Написати програму, яка буде отримувати від користувача ім'я, прізвище, місто та вік. Вивести ці значення у консоль з використанням System.out.printf().
 * 2) Спробувати змінити порядок отримання даних, переставити місцями місто і вік. Скоріш за все, так зробити не вийде, пояснення у підказці.
 * https://t.me/java_classroom/63
 * Для вирішення проблеми обробки числа/ наприклад перевіряємо вік користувача то ми можемо також отримати число у вигляді рядка для цього використаємо клас-оболочку String ageLine = scan.nextLine();
 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter You name: ");
        String name = scan.nextLine();
        System.out.print("Enter You Last name: ");
        String last = scan.nextLine();
        System.out.print("Enter you capitalCity: ");
        String city = scan.nextLine();
        System.out.println("Enter you AGE: ");
        int age = scan.nextInt();


        System.out.printf("\nName: %s, Last: %s\n, City: %s, Age: %d\n", name, last, city, age);

    }
}
