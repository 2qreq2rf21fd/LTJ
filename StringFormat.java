import java.time.LocalDate;

public class StringFormat {
    public static void main(String[] args) {
        /**
         *author I2nP6o
         *  Додатковий матеріал стосовно String.format()
         *  %s - числа, %d - символи
         *
         */
       /* String name = "Nick";
        int newMails = 5;
        String str = "Hello, " + name + ". You have a new mails " + newMails;
        String str = String.format("Hello, %s. You have %d a new mail. Today a %s", name, newMails, LocalDate.now());
        System.out.println(str);*/

        /*String kyivCity = "Kyiv";
        String lvivCity = "Lviv";
        String s = String.format("Cities: %2$s, %1$s", lvivCity, kyivCity);
        System.out.println(s);
*/

        String s = String.format("Value: %06.2f", 25.255);
        System.out.println(s);

    }
}
