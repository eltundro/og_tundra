import java.util.Scanner;

public class ConverterValut {
    public static void main(String[] args) {
        System.out.println("Введите кол-во рублей в копилке ");
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();

        if(naturalNumber <0 || naturalNumber>1000)
        {
            System.out.println(" Добро пожаловать на секретный уровень");
        }
        if (naturalNumber>=0 & naturalNumber<=1000)

        {
            System.out.println();
            System.out.println(" Твой бабос в Баксах = " + (naturalNumber/65.0));
            System.out.println(" Твой бабос в Евро = " + (naturalNumber/73.0));
        }
    }

}