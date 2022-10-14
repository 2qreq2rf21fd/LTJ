import java.util.Random;
import java.util.Scanner;

public class TaskMath {
    public static void main(String[] args) {
        /**
         * @uthor I2nP6o
         * Виводити випадкове число від 0 до 100.
         * З використанням Scanner отримуємо значення змінних min & max. Дані про змінні і будуть границями генерованого числа.
         */

        // Реалізація першого завдання
      /* int num = (int)(Math.random() * 101);
        System.out.println(num);*/

        // Реалізація другого завдання
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minimum Valeue ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum Value ");
        int max = scanner.nextInt();

        System.out.println(Math.random() * (max - min ) + min);
        //https://vertex-academy.com/tutorials/uk/generaciya-vipadkovix-chisel-u-java/  -->( Math.random() * (b-a) ) + a




















    }
}
