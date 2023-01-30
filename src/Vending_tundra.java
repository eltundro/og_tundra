import java.util.Scanner;

public class Vending_tundra {
    public static void main(String[] args) {

        int Suhariki = 50;
        int CocaCola = 65;
        int Mentos = 40;
        int Twix = 55;
        int MountainDew = 70;

        System.out.println("\t\t\t  Введите количество денег:  ");
        int MoneyAmount = new Scanner(System.in).nextInt();


        boolean isCanBuy = false;

        if (MoneyAmount >=Suhariki) {
            System.out.println("\t\t*** Вы можете купить сухарики ***");
            isCanBuy = true;
        }

        if (MoneyAmount >=CocaCola) {
            System.out.println("\t\t*** Вы можете купить CocaCola ***");
            isCanBuy = true;
        }
        if (MoneyAmount >=Mentos) {
            System.out.println("\t\t*** Вы можете купить Mentos ***");
            isCanBuy = true;
        }
        if (MoneyAmount >=Twix) {
            System.out.println("\t\t*** Вы можете купить Twix ***");
            isCanBuy = true;
        }
        if (MoneyAmount >=MountainDew)
        {
            System.out.println("\t\t*** Вы можете купить MountDew ***");
            isCanBuy = true;
        }
        if (!isCanBuy) {
            System.out.println("\t\t\tНедостаточно средств");
        }
    }
}
