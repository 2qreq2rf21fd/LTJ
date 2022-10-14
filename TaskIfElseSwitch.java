import java.util.Scanner;

public class TaskIfElseSwitch {
    public static void main(String[] args) {
        /**
         * @uthor I2nP6o
         * Створіть довільну цілочисельну змінну age. Напишіть умовну конструкцію, яка:
         * 1.1) Якщо вік 13 або менше виводить в консоль "Доступ обмежено".
         * 1.2) Якщо вік від 14 до 17 включно виводить "Частковий доступ".
         * 1.3) Якщо вік 18 і більше виводить в консоль "Доступ надано".
         * 2) Створіть 2 змінні double з довільними значеннями і використайте усі операції порівняння з ними. Виводьте результат одразу в консоль. [* підказка]
         * 3) Отримайте від користувача ціле число, рядок з операцією ("+", "-", "*" або "/") та ще одне ціле число. З використанням switch-case оберіть потрібну операцію, відповідно до того, що ввів користувач. Якщо, наприклад, користувач ввів "+", то виведіть в консоль суму двох цілих чисел. [** підказка]
         */

/*
    // Реалізація першого завдання

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

            if (age <= 13) {
            System.out.println("Acces Denied!");
            } else if (age < 14) {
                System.out.println("Acces not all!");
            } else if (age > 18){
                System.out.println("Acces to ALL!");
            }
*//*
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

*/
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
            if (arr[i] == 5) break;
            if (arr[i] % 2 != 0) continue;
            System.out.println(arr[i]);
        }





        }
}
