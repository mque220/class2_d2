import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while (num > 1) {
            num = num - (i * 6);
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}
