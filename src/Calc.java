import java.util.Scanner;

public class Calc {
    private static final double Pi = 3.14159265358979323846;

    public static void main(String[] args) {

        //int pervoe = 1;
        //int vtoroe = 2;
        //int tretyeChislo = 3;
        //int chetvertoyeChislo = 4;
        //int pyatoeChislo = 5;
        //String C = "Hello";
        //String D = "World";
        /*System.out.println(C + " " + D);
        System.out.println();
        System.out.println();
        System.out.println();
        char Sha = 'H';
        char Yi = 'Ы';
        int Desyat = 10;
        float E = 2.6999999f;
        double Pi = PI;
        System.out.println(Pi);
        System.out.println(pervoe);
        System.out.println(vtoroe);
        System.out.println(tretyeChislo);
        System.out.println(chetvertoyeChislo);
        System.out.println(Sha);
        System.out.println(Yi);
        System.out.println(E);
        System.out.println(Desyat);*/
        System.out.println("\t\t\t*** Введите число а  ***");
        double a = new Scanner (System.in).nextDouble();
        System.out.println("\t\t\t*** Введите число b  ***");
        double b = new Scanner (System.in).nextDouble();
        System.out.println("Произведение ваших чисел:   " + a + "  *  " + b + " = " + (a * b));
        System.out.println("Сумма ваших чисел:   " + a + "  +  " + b + " = " + (a + b));
        System.out.println("Разность ваших чисел:   " + a + "  -  " + b + " = " + (a - b));
        System.out.println("Ваше число умноженное на Pi :" + a + "  * Pi *  " + b + " = " + (a * b * Pi));
    }
}
