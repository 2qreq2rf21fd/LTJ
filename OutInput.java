import java.util.Scanner;

public class OutInput {
    public static void main(String[] args) {
        /**
         * author I2nP6o
         * souf - System.out.printf
         * Метод Scanner
         */
        /*System.out.println("Hello\nWorld!"); //Перенесення на наструпний рядок
        System.out.println("Hello\tWorld!"); // Табуляція між словами */
        /*String name = "Nick";
        System.out.printf("Hello, %s\n", name); // Метод System.out.printf*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        /*String name = scan.nextLine();*/
        String name = scan.next();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();


        System.out.printf("\nName: %s, Age: %d\n", name, age);

    }
}
