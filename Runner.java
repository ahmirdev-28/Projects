import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        System.out.println("\nTowers of Hanoi Steps:\n");
        Towers.move(n, 'A', 'C', 'B');

        input.close();
    }
}
