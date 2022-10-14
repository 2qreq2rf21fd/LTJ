public class StringType {
    public static void main(String[] args) {

        /**
         * author I2nP6o
         * # Порівняння рядків
         * s1.equals(s2) - За значенням;
         * s1.equalsIgnoreCase(s2) - За значенням без урахування регістру символів;
         * # Пошук символів
         * s1.indexOf(ch) - поверне індекс першого входу символа;
         * s1.lastIndexOf(ch) - поверне індекс останнього входу символа;
         * # Виділення частини рядка
         * s1.substring(first, last) - поверне частину рядка від першого (включно) до останнього (невключно) індекса;
         */


        /*String s1 = "Java";
        String s2 = "Java";
        String str = new String("Java");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(str));*/

        /*String name = "Nick";
        String greeting = "Hello, ";
        *//*System.out.println(greeting + name);*//*

        StringBuilder builder = new StringBuilder(greeting);
       *//* builder.append(name);
        System.out.println(builder);*//*
        System.out.println(builder.reverse()); // .reverse дозволяє перевернути значення рядка*/

        /**
         *
         */

        /*String kyivCapitalCity = "kyiv";
        String kyivCity = "kyiv";
        String lvivCity = "lviv";*/

        /*System.out.println(kyivCapitalCity.equalsIgnoreCase(kyivCity));*/
        /*System.out.println(lvivCity.indexOf("v"));*/
        /*System.out.println(kyivCity.lastIndexOf("iv"));*/
        /*System.out.println(kyivCapitalCity.substring(0, 4));*/
        /*System.out.println(kyivCapitalCity.charAt(0));*/

        // System.out.println("My age is " + 22);
        String nullStr = null;
        System.out.println(nullStr + "Hello!");

    }
}
