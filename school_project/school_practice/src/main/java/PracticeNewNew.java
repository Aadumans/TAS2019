import java.util.Scanner;
class PracticeNewNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int current = sc.nextInt();
        if (current<min){
            System.out.println("Deficiency");
        } else if (current>max) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}
