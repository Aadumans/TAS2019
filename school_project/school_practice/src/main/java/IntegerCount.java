import java.util.Scanner;

class IntegerCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int tab1 = (a/2)+(a%2);
        int tab2 = (b/2)+(b%2);
        int tab3 = (c/2)+(c%2);
        int sum = tab1+tab2+tab3;
        System.out.println(sum);
    }
}