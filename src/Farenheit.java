import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        System.out.println("Введите кол-во градусов в С ");
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();

        if(naturalNumber <0 || naturalNumber>100)
        {
            System.out.println("ИДИ НАХУЙ, ЧОРТ");
        }
       if (naturalNumber>=0 & naturalNumber<=100)

        {
            System.out.println();
            System.out.println(" Твой градус в F = " + (naturalNumber * 1.8 + 32));
        }
    }

}