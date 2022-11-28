import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner amountOfMoney = new Scanner(System.in);
        Scanner numberOfFriends = new Scanner(System.in);

        int a = amountOfMoney.nextInt();
        int n = numberOfFriends.nextInt();

        if (n < 0){
            System.out.println("Bill total amount cannot be negative");
        } else if (n <= 0){
            System.out.println("Number of friends cannot be negative or zero");
            System.exit(0);
        } else {
            int tip = ((a / n) / 100 * 10);
            System.out.println(a / n + tip);
        }
    }
}
