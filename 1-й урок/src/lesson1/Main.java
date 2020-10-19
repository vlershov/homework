package lesson1;

public class Main {

    public static void main(String[] args) {

        int integerValue = 2020;
        System.out.println(integerValue);
        long longValue = 100000000;
        System.out.println(longValue);
        byte byteValue = -127;
        System.out.println(byteValue);
        short shortValue = -32000;
        System.out.println(shortValue);
        double doubleValue = 3.5d;
        System.out.println(doubleValue);
        float floatValue = 2.4f;
        System.out.println(floatValue);
        char ch1 = '5';
        System.out.println(ch1);
        String stringValue = "fdsfs";
        System.out.println(stringValue);
        int summa = 12;
        System.out.println(summa);

        viceslenieDannix(10, 5, 2, 20);

        boolean RezultFunc = summaPridela(10, 5);
        System.out.println("Результат проверки суммы:");
        System.out.println(RezultFunc);

        intObrPor(500, 286);

        System.out.println("100 год висакосный : " + visYearVesokosn(100));
        System.out.println("400 год висакосный : " + visYearVesokosn(400));
        System.out.println("1996 год висакосный : " + visYearVesokosn(1996));
        System.out.println("1995 год висакосный : " + visYearVesokosn(1995));
        System.out.println("200 год висакосный : " + visYearVesokosn(200));
    }

    public static boolean visYearVesokosn(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void intObrPor(int a, int b){
        int summa = a + b;
        if ((summa>=100) && (summa<=999)){
            System.out.println("На входе:");
            System.out.println(summa);
            int mirror = 0;
            while (summa != 0) {
                mirror = mirror * 10 + (summa % 10);
                summa = summa / 10;
            }
            System.out.println("Число обратного порядка:");
            System.out.println(mirror);
        }
    }

    public static void viceslenieDannix(int a, int b, int c, int d){
        int summa = a * (b + (c / d));
        System.out.println("Результат вычисления по формуле:");
        System.out.println(summa);
    }

    public static boolean summaPridela(int a, int b){
        int rez = (a+b);
        if ((rez>=10) && (rez<=20)){
            return true;
        }else{
            return false;
        }
    }

}
