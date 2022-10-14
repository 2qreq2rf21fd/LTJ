import java.util.Scanner;

public class ClassMath {
    public static void main(String[] args) {
        /**
         * @UTHOR I2nP6o
         *  f - floating point
         *  Інкремент / декремент
         *  Постфіксний / Префіксний - Після одного проходу інтерації додає 1 / Одразу додає 1 та при проходу ітерації без змін
         */


        //Префіксний
        int p = 1; // Інтекремент +1
        System.out.println(p++);
        System.out.println(p);

        int m = 1; // Декремент -1
        System.out.println(m--);
        System.out.println(m);

        //Постфіксний
        int o = 1;
        System.out.println(++o);
        System.out.println(o);

        int n = 1;
        System.out.println(++n);
        System.out.println(n);

        // Конкатенація

        System.out.println("2" + 2);
        System.out.println(2 + "2");

        System.out.println(2 + 4 + "2");
        System.out.println("2" + 4 + 2);

        System.out.println("2" + (4 + 2));


        /**
         * # Методи класу Math, Parch1
         * pow(a,b) - піднесення а до степені б
         * min(a,b) - отримати найменше число
         * max(a,b) - отримати найбільше число
         * abs(a,b) - знайти значення по модулю
         * sqrt(a) - знайти квадратний корінь числа
         * # Методи класу Math, Parch2
         * random() - генерує число від 0 до 1
         * Тригонометричні методи sin(a),cos(a),tan(a),asin(a),acos(a),atan(a).
         * Логарифмічні методи: log(a),log10(a),log1p(a)
         */

        System.out.println(Math.round(1.4));
        System.out.println(Math.round(1.5));

        System.out.println(Math.ceil(1.4));
        System.out.println(Math.floor(1.5));

    }
}
