public class TypeData {
    public static void main(String[] args) {

        /**
         * author I2nP6o
         * Типи данних
         * Сильні типізації
         * Приведення типів
         * Числа з плаваючою точкою float/double
         *
         */

    // short --> integer

       // short shortValue = 32000;
       // int integerValue = shortValue;
       // System.out.println(integerValue); //Шорт в інтежер приведення типів данних

    // integer --> short

        // int integerValue = 50000;
        // short shortValue = (short) integerValue;
        // System.out.println(shortValue); // Інтежер в шорт

    // integer --> float

            // int integerValue = 127;
           // float floatValue = integerValue;
           // System.out.println(floatValue);

    // integer --> double

           // int integerValue = 127;
           // double doubleValue = integerValue;
           // System.out.println(doubleValue);

    // double --> long

            // double doubleValue = 255.552;
           // long longValue = (long) doubleValue;
           // System.out.println(longValue);

    // long --> float

           /* long longValue = 3_000_000_000L;
            float floatValue = longValue;
            System.out.println(floatValue);*/

    // long --> DOUBLE

            /*long longValue = 3_000_000_000L;
            double doubleValue = longValue;
            System.out.println(doubleValue);*/

    // char --> integer

            /*char charValue = 'a';
            int integerValue = charValue;
            System.out.println(integerValue);*/

    // integer --> char

            int integerValue = 98;
            char charValue = (char) integerValue;
            System.out.println(integerValue);

    }
}
