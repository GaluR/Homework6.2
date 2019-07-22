import java.util.Scanner;

public class Tab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[5];
        System.out.println("Wprowadz pierwszą liczbę: ");
        tab[0] = scan.nextInt();
        System.out.println("Wprowadz drugą liczbę: ");
        tab[1] = scan.nextInt();
        System.out.println("Wprowadz trzecią liczbę: ");
        tab[2] = scan.nextInt();
        System.out.println("Wprowadz czwartą liczbę: ");
        tab[3] = scan.nextInt();
        System.out.println("Wprowadz piątą liczbę: ");
        tab[4] = scan.nextInt();
        scan.close();
        int sum = tab[0] + tab[2] + tab[4];
        System.out.println("Suma 1, 3 i 5 liczby to: " + sum);
    }
}
