import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        System.out.println("Введите кол-во градусов в С ");
        int naturalNumber = new Scanner(System.in).nextInt();
        if(naturalNumber <=-51 || naturalNumber>=101)
        {
            System.out.println("Что-то слишком большие числа, бро");
        }
       if (naturalNumber>=-50 && naturalNumber<=100)
        {
            System.out.println(" Твой градус в F = " + (naturalNumber * 1.8 + 32));
        }
    }

}