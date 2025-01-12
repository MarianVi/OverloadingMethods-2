import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO
        int numar = scanner.nextInt();
        System.out.println(numberLength(numar));
    }

    public static int numberLength(int numar) {
        int lungime = 0;
        if (numar == 0) {
            return 1;
        }
        while (numar != 0) {
            lungime++;
            numar /= 10;
        }
        return lungime;
    }
}