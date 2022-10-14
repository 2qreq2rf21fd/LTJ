import java.util.Scanner;

public class IfElseSwitch {
    /**
     * @ythor I2nP6o
     * Умовні конструкції (if-else, switch)
     * ! (знак оклику)- Не Змінює значення умови на протилежне
     * && - І (та)(амперсанд) Поєднує 2 умови true коли обидві усови true
     * || () АБо Поєднує 2 умови True коли будь яка умова true
     * ^ () виключне або Поєднує 2 умови True коли одна умова true
     */
    public static void main(String[] args) {


        /*Scanner scan = new Scanner(System.in);*/
       /* int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Вам 18 або більше років. ");
        } else if (age >= 16) {
            System.out.println("Вам 16 або більше років. ");
        } else {
            System.out.println("Вам менше 16 років.");
        }
*/
        /*String city = scan.next();*/


        /*switch (city) {
            case "Kyiv": {
                System.out.println("Столиця");
                break;
            }
            case "Lviv": {
                System.out.println("Захід");
                break;
            }
            case "Kharkiv": {
                System.out.println("Схід");
                break;
            }
            default:
                System.out.println("Інше місто. ");*/

        // Enhenced Switch

        Scanner scan = new Scanner(System.in);
        String city = scan.next();
        switch (city) {
            case "Kyiv" -> System.out.println("Столиця");
            case "Lviv" -> System.out.println("Захід");
            case "Kharkiv" -> System.out.println("Інше місто.");
        }
        }


    }

/*}*/

